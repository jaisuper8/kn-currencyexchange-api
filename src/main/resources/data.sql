create table currencyExchangeRate
(
    currencyIdFrom varchar(50),
    currencyIdTo varchar(50) composite,
    currencyRateTypeId varchar(50),
    ExchangeRate decimal(10,5),
    EffectiveDate datetime primary key ,
    MetaDataUpdatedBy varchar(50),
    MetaDataUpdatedOn datetime,
    CurrencyRateId varchar(50),
    CurrencyCodeName varchar(10)

);

