package fr.ekwateur.billing.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.math.BigDecimal;

@JsonPropertyOrder({ "priceCategory", "consumedElectricity", "consumedGaz" })
public class BillRequestDto {

    @JsonProperty()
    private String priceCategory;

    @JsonProperty()
    private BigDecimal consumedElectricity;

    @JsonProperty()
    private BigDecimal consumedGaz;


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
