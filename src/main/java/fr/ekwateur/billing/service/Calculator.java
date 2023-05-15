package fr.ekwateur.billing.service;

import fr.ekwateur.billing.domain.BillDetails;
import fr.ekwateur.billing.domain.BillRequest;
import fr.ekwateur.billing.enums.PriceCategory;

public interface Calculator {

    PriceCategory getPriceCategory();
    default BillDetails processInvoice(BillRequest billRequest) {
        BillDetails billDetails = new BillDetails();
        billDetails.setPriceCategory(billRequest.getPriceCategory());
        billDetails.setElectricityPriceForKWh(getPriceCategory().getPriceElectricityForKwh());
        billDetails.setConsumedElectricity(billRequest.getConsumedElectricity());
        billDetails.setTotalElectricityPrice(billRequest.getConsumedElectricity().multiply(getPriceCategory().getPriceElectricityForKwh()));
        billDetails.setGazPriceForKWh(getPriceCategory().getPriceGazForKwh());
        billDetails.setConsumedGaz(billRequest.getConsumedGaz());
        billDetails.setTotalGazPrice(billRequest.getConsumedGaz().multiply(getPriceCategory().getPriceGazForKwh()));
        billDetails.setTotalPrice(billDetails.getTotalElectricityPrice().add(billDetails.getTotalGazPrice()));
        return billDetails;
    }
}
