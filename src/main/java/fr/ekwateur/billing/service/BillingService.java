package fr.ekwateur.billing.service;

import fr.ekwateur.billing.exception.PriceCategoryNotSupportedException;
import fr.ekwateur.billing.domain.BillDetails;
import fr.ekwateur.billing.domain.BillRequest;
import fr.ekwateur.billing.enums.PriceCategory;
import org.springframework.stereotype.Service;

@Service
public class BillingService {

    public BillDetails getBillDetails(BillRequest billRequest){
        switch (billRequest.getPriceCategory()){
            case "PARTICULAR" : return CalculatorFactory.getCalculator(PriceCategory.PRICE_PARTICULAR)
            .processInvoice(billRequest);
            case "PRO" : return CalculatorFactory.getCalculator(PriceCategory.PRICE_PRO)
                    .processInvoice(billRequest);
            case "PRO_PLUS" : return CalculatorFactory.getCalculator(PriceCategory.PRICE_PRO_PLUS)
                    .processInvoice(billRequest);
            default: throw new PriceCategoryNotSupportedException(billRequest.getPriceCategory()+" Price Category Not supported");
        }
    }
}
