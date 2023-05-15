package fr.ekwateur.billing.enums;

import java.math.BigDecimal;

public enum PriceCategory {

    PRICE_PARTICULAR(new BigDecimal("0.121"),new BigDecimal("0.115")),
    PRICE_PRO(new BigDecimal("0.114"),new BigDecimal("0.111")),
    PRICE_PRO_PLUS(new BigDecimal("0.118"),new BigDecimal("0.113"));

    private BigDecimal priceElectricityForKwh;
    private BigDecimal priceGazForKwh;

    PriceCategory(BigDecimal priceElectricityForKwh, BigDecimal priceGazForKwh) {
        this.priceElectricityForKwh = priceElectricityForKwh;
        this.priceGazForKwh = priceGazForKwh;
    }

    public BigDecimal getPriceElectricityForKwh() {
        return priceElectricityForKwh;
    }

    public void setPriceElectricityForKwh(BigDecimal priceElectricityForKwh) {
        this.priceElectricityForKwh = priceElectricityForKwh;
    }

    public BigDecimal getPriceGazForKwh() {
        return priceGazForKwh;
    }

    public void setPriceGazForKwh(BigDecimal priceGazForKwh) {
        this.priceGazForKwh = priceGazForKwh;
    }
}
