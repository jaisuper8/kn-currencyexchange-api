package com.blumeglobal.currencyexchange;

import com.blumeglobal.currencyexchange.client.CurrencyExchangeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

  @Autowired CurrencyExchangeClient currencyExchangeClient;

  @Override
  public void run(String... args) throws Exception {
    currencyExchangeClient.getCurrencyExchange();
  }
}
