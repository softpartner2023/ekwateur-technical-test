package fr.ekwateur.billing.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class BillRequest {

    private String priceCategory;

    private BigDecimal consumedElectricity;

    private BigDecimal consumedGaz;

    public BillRequest(){
        super();
    }

    public BillRequest(String priceCategory, BigDecimal consumedElectricity, BigDecimal consumedGaz) {
        this.priceCategory = priceCategory;
        this.consumedElectricity = consumedElectricity;
        this.consumedGaz = consumedGaz;
    }

    public String getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(String priceCategory) {
        this.priceCategory = priceCategory;
    }

    public BigDecimal getConsumedElectricity() {
        return consumedElectricity;
    }

    public void setConsumedElectricity(BigDecimal consumedElectricity) {
        this.consumedElectricity = consumedElectricity;
    }

    public BigDecimal getConsumedGaz() {
        return consumedGaz;
    }

    public void setConsumedGaz(BigDecimal consumedGaz) {
        this.consumedGaz = consumedGaz;
    }
}
