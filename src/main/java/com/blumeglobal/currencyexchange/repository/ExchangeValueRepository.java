package com.blumeglobal.currencyexchange.repository;

import com.blumeglobal.currencyexchange.model.CurrencyExchangeRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ExchangeValueRepository extends JpaRepository<CurrencyExchangeRate, Long> {

  Optional<CurrencyExchangeRate> findById(Long id);
}
