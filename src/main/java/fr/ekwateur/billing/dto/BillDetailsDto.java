package fr.ekwateur.billing.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class BillDetailsDto {

    @JsonProperty
    private String priceCategory;

    @JsonProperty
    private BigDecimal electricityPriceForKWh;

    @JsonProperty
    private BigDecimal consumedElectricity;

    @JsonProperty
    private BigDecimal totalElectricityPrice;

    @JsonProperty
    private BigDecimal gazPriceForKWh;

    @JsonProperty
    private BigDecimal consumedGaz;

    @JsonProperty
    private BigDecimal totalGazPrice;

    @JsonProperty
    private BigDecimal totalPrice;

    public String getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(String priceCategory) {
        this.priceCategory = priceCategory;
    }

    public BigDecimal getElectricityPriceForKWh() {
        return electricityPriceForKWh;
    }

    public void setElectricityPriceForKWh(BigDecimal electricityPriceForKWh) {
        this.electricityPriceForKWh = electricityPriceForKWh;
    }

    public BigDecimal getConsumedElectricity() {
        return consumedElectricity;
    }

    public void setConsumedElectricity(BigDecimal consumedElectricity) {
        this.consumedElectricity = consumedElectricity;
    }

    public BigDecimal getTotalElectricityPrice() {
        return totalElectricityPrice;
    }

    public void setTotalElectricityPrice(BigDecimal totalElectricityPrice) {
        this.totalElectricityPrice = totalElectricityPrice;
    }

    public BigDecimal getGazPriceForKWh() {
        return gazPriceForKWh;
    }

    public void setGazPriceForKWh(BigDecimal gazPriceForKWh) {
        this.gazPriceForKWh = gazPriceForKWh;
    }

    public BigDecimal getConsumedGaz() {
        return consumedGaz;
    }

    public void setConsumedGaz(BigDecimal consumedGaz) {
        this.consumedGaz = consumedGaz;
    }

    public BigDecimal getTotalGazPrice() {
        return totalGazPrice;
    }

    public void setTotalGazPrice(BigDecimal totalGazPrice) {
        this.totalGazPrice = totalGazPrice;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }
}
