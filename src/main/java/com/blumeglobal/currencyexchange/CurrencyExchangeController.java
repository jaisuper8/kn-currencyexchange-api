package com.blumeglobal.currencyexchange;

import com.blumeglobal.currencyexchange.client.CurrencyExchangeClient;
import com.blumeglobal.currencyexchange.model.CurrencyExchangeRate;
import com.blumeglobal.currencyexchange.repository.ExchangeValueRepository;

public class CurrencyExchangeController {

  private ExchangeValueRepository repository;
  private CurrencyExchangeClient client;


  public CurrencyExchangeRate getratebyid(Long id) {

    CurrencyExchangeRate rate = new CurrencyExchangeRate();
    return rate;
  }

}
