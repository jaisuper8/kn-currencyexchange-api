package com.blumeglobal.currencyexchange;

import com.blumeglobal.currencyexchange.client.CurrencyExchangeClient;
import com.blumeglobal.currencyexchange.model.CurrencyExchangeRate;
import com.blumeglobal.currencyexchange.repository.ExchangeValueRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;

import javax.xml.xpath.XPathExpressionException;

@SpringBootTest
class CurrencyexchangeApplicationTests {

  @Test
  void contextLoads() throws XPathExpressionException {
    System.out.println("--");
    CurrencyExchangeClient x = new CurrencyExchangeClient();
    String s = x.getCurrencyExchange();

    System.out.println(s);
  }

  @Bean
  public CommandLineRunner startOne(CurrencyExchangeClient client) {
    System.out.println("---");
    return (args) -> {
      // String response = client.getCurrencyExchange();
      // System.out.println(response);
    };
  }

  public CommandLineRunner test(ExchangeValueRepository repository) {
    return (args) -> {

      // ExchangeValueRepository repository = ExchangeValueRepository.getratebyid(2).get();
      repository.save(new CurrencyExchangeRate());
      repository.save(new CurrencyExchangeRate());
      repository.save(new CurrencyExchangeRate());
      repository.save(new CurrencyExchangeRate());
      repository.save(new CurrencyExchangeRate());
      repository.save(new CurrencyExchangeRate());
      repository.save(new CurrencyExchangeRate());
      repository.save(new CurrencyExchangeRate());
    };
  }
}

//
//		};
//	}
