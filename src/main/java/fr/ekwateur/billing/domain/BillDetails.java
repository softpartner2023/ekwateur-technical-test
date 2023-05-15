package fr.ekwateur.billing.domain;

import java.math.BigDecimal;

public class BillDetails {
    private String priceCategory;
    private BigDecimal electricityPriceForKWh;
    private BigDecimal consumedElectricity;
    private BigDecimal totalElectricityPrice;
    private BigDecimal gazPriceForKWh;
    private BigDecimal consumedGaz;
    private BigDecimal totalGazPrice;
    private BigDecimal totalPrice;

    public BillDetails(){
        super();
    }

    public BillDetails(String priceCategory, BigDecimal electricityPriceForKWh, BigDecimal consumedElectricity, BigDecimal totalElectricityPrice, BigDecimal gazPriceForKWh, BigDecimal consumedGaz, BigDecimal totalGazPrice, BigDecimal totalPrice) {
        this.priceCategory = priceCategory;
        this.electricityPriceForKWh = electricityPriceForKWh;
        this.consumedElectricity = consumedElectricity;
        this.totalElectricityPrice = totalElectricityPrice;
        this.gazPriceForKWh = gazPriceForKWh;
        this.consumedGaz = consumedGaz;
        this.totalGazPrice = totalGazPrice;
        this.totalPrice = totalPrice;
    }

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
