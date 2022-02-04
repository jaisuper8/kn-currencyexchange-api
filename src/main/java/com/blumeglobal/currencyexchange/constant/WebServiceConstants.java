package com.blumeglobal.currencyexchange.constant;

public class WebServiceConstants {

  public static String soapTemplateRequest =
      "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"
          + "\n"
          + "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:v01=\"http://mdm-next.int.kn/xsd/transaction/v01\" xmlns:v011=\"http://knesb.int.kn/xsd/esb/audit/v01\" xmlns:sec=\"http://schemas.xmlsoap.org/ws/2002/04/secext\" xmlns:v1=\"http://services.kuehne-nagel.com/xsd/MasterData/FICurrencyRate/CurrencyRate/V1\">\n"
          + "\n"
          + "<soapenv:Header>\n"
          + "\n"
          + "      <v011:Audit>\n"
          + "\n"
          + "         <v011:ApplicationID>blume</v011:ApplicationID>\n"
          + "\n"
          + "         <v011:CorrelationID>202112011204</v011:CorrelationID>\n"
          + "\n"
          + "             </v011:Audit>         \n"
          + "\n"
          + " </soapenv:Header>\n"
          + "\n"
          + "\n"
          + "\n"
          + "   <soapenv:Body>\n"
          + "\n"
          + "      <v1:select_CurrencyRate>\n"
          + "\n"
          + "         <predicate>./currencyRateTypeId='4F41' and ./currencyIdFrom='REPLACE1' and ./currencyIdTo='REPLACE2' and REPLACE3 </predicate>        \n"
          + "\n"
          + "      </v1:select_CurrencyRate>\n"
          + "\n"
          + "   </soapenv:Body>\n"
          + "\n"
          + "</soapenv:Envelope>";

  public static String timestamp = "T00:00:00";
}
