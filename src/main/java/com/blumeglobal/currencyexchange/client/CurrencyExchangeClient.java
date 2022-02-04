package com.blumeglobal.currencyexchange.client;

import com.blumeglobal.currencyexchange.constant.WebServiceConstants;
import com.blumeglobal.currencyexchange.model.CurrencyExchangeRate;
import com.blumeglobal.currencyexchange.repository.ExchangeValueRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.StringReader;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Base64;

@Service
public class CurrencyExchangeClient {

  private static Logger logger = LoggerFactory.getLogger(CurrencyExchangeClient.class);

  // Values taken from application.properties file under resource
  @Value("${webservice.id}")
  private String webserviceId;

  @Value("${webservice.usdcode}")
  private String usdcode;

  @Value("${webservice.cadcode}")
  private String cadcode;

  @Value("${webservice.mxncode}")
  private String mxncode;

  @Value("${webservice.pw}")
  private String webservicePw;

  @Value("${webservice.url}")
  private String webserviceUrl;

  @Value("${listofString}")
  private String[] listofString = {"usdcode", "cadcode", "mxncode"};

  @Autowired ExchangeValueRepository repository;

  private static final SimpleDateFormat formatter =
      new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");

  public String getCurrencyExchange() {

    // Setting up HTTP Request
    System.out.println(this.webserviceId);
    RestTemplate restTemplate = new RestTemplate();

    String base64Creds = webserviceId + ":" + webservicePw;

    String result = "";

    HttpHeaders headers = new HttpHeaders();

    headers.setContentType(MediaType.TEXT_XML);

    headers.add(
        "Authorization",
        "Basic "
            + new String(Base64.getEncoder().encode(base64Creds.getBytes(StandardCharsets.UTF_8))));
    System.out.println((base64Creds));

    // SOAP Request is inserted into HTTPEntity (WebServiceConstants.soapTemplateRequest).
    String usdcode = "55532D446F6C6C6172";
    String cadcode = "43616E616469616E2D446F6C6C6172";
    String date = "date-greater-than(./effectiveDate, '2022-01-31T00:00:00')";
    String mxncode = "4D65786963616E2D5065736F";

    LocalDate today = LocalDate.now();
    LocalDate yesterday = today.minusDays(1);

    String message = WebServiceConstants.soapTemplateRequest;

    message = message.replaceAll("REPLACE1", cadcode);
    message = message.replaceAll("REPLACE2", usdcode);
    message = message.replaceAll("REPLACE3", date);

    System.out.println(Arrays.toString(listofString));

    /* TODO: Need to manipulate WebServiceConstants.soapTemplateRequest String for the following xml element values
       CorrelationID, Predicate
    */

    for (int source = 0; source < listofString.length; source++) {
      for (int dest = 0; dest < listofString.length; dest++) {
        System.out.println(listofString[source]);
        System.out.println(listofString[dest]);
        if (!listofString[source].equals(listofString[dest])
            && (listofString[source].equals("usdcode") || listofString[dest].equals("usdcode"))) {

          if (listofString[source].equals("usdcode") && listofString[dest].equals("cadcode")) {

            message = makemessage(usdcode, cadcode, date);

            HttpEntity<String> request = new HttpEntity<>(message, headers);

            // Request is executed here

            System.out.println("webservicePw = " + webservicePw);
            System.out.println("webserviceUrl = " + webserviceUrl);

            ResponseEntity<String> responseEntity =
                restTemplate.exchange(webserviceUrl, HttpMethod.POST, request, String.class);

            // Response is extracted here
            // TODO: Error Handling if response is not XML

            String response = responseEntity.getBody();
            saveInDB(response, "USD");
            System.out.println(response);
          }

          if (listofString[source].equals("cadcode") && listofString[dest].equals("usdcode")) {

            message = makemessage(cadcode, usdcode, date);

            HttpEntity<String> request = new HttpEntity<>(message, headers);

            // Request is executed here

            ResponseEntity<String> responseEntity =
                restTemplate.exchange(webserviceUrl, HttpMethod.POST, request, String.class);

            // Response is extracted here
            // TODO: Error Handling if response is not XML

            String response = responseEntity.getBody();
            saveInDB(response, "CAD");

            System.out.println(response);
          }
          if (listofString[source].equals("usdcode") && listofString[dest].equals("mxncode")) {

            message = makemessage(usdcode, mxncode, date);

            HttpEntity<String> request = new HttpEntity<>(message, headers);

            // Request is executed here

            ResponseEntity<String> responseEntity =
                restTemplate.exchange(webserviceUrl, HttpMethod.POST, request, String.class);

            // Response is extracted here
            // TODO: Error Handling if response is not XML

            String response = responseEntity.getBody();
            saveInDB(response, "USD");

            System.out.println(response);
          }
          if (listofString[source].equals("mxncode") && listofString[dest].equals("usdcode")) {

            message = makemessage(mxncode, usdcode, date);

            HttpEntity<String> request = new HttpEntity<>(message, headers);

            // Request is executed here

            ResponseEntity<String> responseEntity =
                restTemplate.exchange(webserviceUrl, HttpMethod.POST, request, String.class);

            // Response is extracted here
            // TODO: Error Handling if response is not XML

            String response = responseEntity.getBody();
            saveInDB(response, "MXN");

            System.out.println(response);
          }
        }
      }

      HttpEntity<String> request = new HttpEntity<>(message, headers);

      // Request is executed here

      ResponseEntity<String> responseEntity =
          restTemplate.exchange(webserviceUrl, HttpMethod.POST, request, String.class);

      // Response is extracted here
      // TODO: Error Handling if response is not XML

      String response = responseEntity.getBody();
      saveInDB(response, "USD");

      System.out.println();
    }
    return result;
  }

  private String makemessage(String fromcode, String tocode, String date) {
    String message = WebServiceConstants.soapTemplateRequest;
    message = message.replaceAll("REPLACE1", fromcode);
    message = message.replaceAll("REPLACE2", tocode);
    message = message.replaceAll("REPLACE3", date);

    return message;
  }

  private String xPathToStringElement(String xmlString, String xPathInput)
      throws XPathExpressionException {

    InputSource inputXML = new InputSource(new StringReader(xmlString));

    XPath xPath = XPathFactory.newInstance().newXPath();

    return xPath.evaluate(xPathInput, inputXML);
  }

  private void saveInDB(String xml, String code) {
    try {
      DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
      DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
      Document doc = documentBuilder.parse(new InputSource(new StringReader(xml)));
      NodeList nodeList = doc.getElementsByTagName("CurrencyRate");
      for (int i = 0; i < nodeList.getLength(); i++) {
        Node n = nodeList.item(i);
        CurrencyExchangeRate currencyExchangeRate = new CurrencyExchangeRate();
        Element currencyRateElement = (Element) n;

        Element currencyIdFrom =
            (Element) currencyRateElement.getElementsByTagName("currencyIdFrom").item(0);
        currencyExchangeRate.setFrom(currencyIdFrom.getTextContent());

        Element currencyIdTo =
            (Element) currencyRateElement.getElementsByTagName("currencyIdTo").item(0);
        currencyExchangeRate.setTo(currencyIdTo.getTextContent());

        Element exchangeRate =
            (Element) currencyRateElement.getElementsByTagName("exchangeRate").item(0);
        currencyExchangeRate.setExchangeRate(
            BigDecimal.valueOf(Double.parseDouble(exchangeRate.getTextContent())));

        Element effectiveDate =
            (Element) currencyRateElement.getElementsByTagName("effectiveDate").item(0);
        currencyExchangeRate.setDate(formatter.parse(effectiveDate.getTextContent()));

        Element currencyRateTypeId =
            (Element) currencyRateElement.getElementsByTagName("currencyRateTypeId").item(0);
        currencyExchangeRate.setCid(currencyRateTypeId.getTextContent());

        Element metaDataNode =
            (Element) currencyRateElement.getElementsByTagName("metaData").item(0);
        currencyExchangeRate.setMeta(
            metaDataNode.getElementsByTagName("updatedBy").item(0).getTextContent());
        currencyExchangeRate.setMetadate(
            formatter.parse(
                metaDataNode.getElementsByTagName("updatedOn").item(0).getTextContent()));

        System.out.println(currencyExchangeRate);
        currencyExchangeRate.setCodename(code);
        repository.save(currencyExchangeRate);
      }
    } catch (Exception e) {
      System.out.println("Exception occurred while parsing a response" + xml);
      e.printStackTrace();
    }
  }
}
