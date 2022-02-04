package com.blumeglobal.currencyexchange.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "currencyExchangeRate")
public class CurrencyExchangeRate {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "currencyRateTypeId")
  private Long id;

  @Column(name = "currencyIdFrom")
  private String from;

  @Column(name = "currencyIdTo")
  private String to;

  @Column(name = "ExchangeRate")
  private BigDecimal exchangeRate;

  @Column(name = "CurrencyCodeName")
  private String codename;

  @Column(name = "EffectiveDate")
  private Date Date;

  @Column(name = "MetaDataUpdatedBy")
  private String meta;

  @Column(name = "MetaDataUpdatedOn")
  private Date metadate;

  @Column(name = "currencyRateId")
  private String cid;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public BigDecimal getExchangeRate() {
    return exchangeRate;
  }

  public void setExchangeRate(BigDecimal exchangeRate) {
    this.exchangeRate = exchangeRate;
  }

  public String getCodename() {
    return codename;
  }

  public void setCodename(String codename) {
    this.codename = codename;
  }

  public java.util.Date getDate() {
    return Date;
  }

  public void setDate(java.util.Date date) {
    Date = date;
  }

  public String getMeta() {
    return meta;
  }

  public void setMeta(String meta) {
    this.meta = meta;
  }

  public java.util.Date getMetadate() {
    return metadate;
  }

  public void setMetadate(java.util.Date metadate) {
    this.metadate = metadate;
  }

  public String getCid() {
    return cid;
  }

  public void setCid(String cid) {
    this.cid = cid;
  }

  @Override
  public String toString() {
    return "CurrencyExchangeRate{"
        + "id="
        + id
        + ", from='"
        + from
        + '\''
        + ", to='"
        + to
        + '\''
        + ", exchangeRate="
        + exchangeRate
        + ", codename='"
        + codename
        + '\''
        + ", Date="
        + Date
        + ", meta='"
        + meta
        + '\''
        + ", metadate="
        + metadate
        + ", cid='"
        + cid
        + '\''
        + '}';
  }
}
