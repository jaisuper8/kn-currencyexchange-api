package com.blumeglobal.currencyexchange;

import com.blumeglobal.currencyexchange.client.CurrencyExchangeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.xml.xpath.XPathExpressionException;

@SpringBootApplication(scanBasePackages = {"com.blumeglobal.currencyexchange"})
@EntityScan("com.blumeglobal.currencyexchange.model")
@EnableJpaRepositories("com.blumeglobal.currencyexchange.repository")
public class CurrencyexchangeApplication {

  @Autowired CurrencyExchangeClient currencyExchangeClient;

  public static void main(String[] args) throws XPathExpressionException {
    SpringApplication.run(CurrencyexchangeApplication.class, args);
  }
}
