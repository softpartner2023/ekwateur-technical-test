package fr.ekwateur.billing.service;

import fr.ekwateur.billing.domain.BillDetails;
import fr.ekwateur.billing.domain.BillRequest;
import fr.ekwateur.billing.enums.PriceCategory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class BillingServiceTest {

    @Autowired
    BillingService billingService;

    @Test
    public void shouldReturnCorrectBillDetailForParticularPricing() {
        BillDetails billDetailsExpected = new BillDetails("PARTICULAR", new BigDecimal("0.121"),
                BigDecimal.valueOf(10), new BigDecimal("1.210"), new BigDecimal("0.115"),
                BigDecimal.valueOf(10), new BigDecimal("1.150"), new BigDecimal("2.360"));
        BillRequest billRequest = new BillRequest("PARTICULAR", BigDecimal.valueOf(10), BigDecimal.valueOf(10));
        BillDetails billDetails = billingService.getBillDetails(billRequest);
        assertAll("Verify Bill Details",
                () -> assertEquals(billDetailsExpected.getPriceCategory(), billDetails.getPriceCategory()),
                () -> assertEquals(billDetailsExpected.getElectricityPriceForKWh(), billDetails.getElectricityPriceForKWh()),
                () -> assertEquals(billDetailsExpected.getConsumedElectricity(), billDetails.getConsumedElectricity()),
                () -> assertEquals(billDetailsExpected.getTotalElectricityPrice(), billDetails.getTotalElectricityPrice()),
                () -> assertEquals(billDetailsExpected.getTotalElectricityPrice(), billDetails.getTotalElectricityPrice()),
                () -> assertEquals(billDetailsExpected.getGazPriceForKWh(), billDetails.getGazPriceForKWh()),
                () -> assertEquals(billDetailsExpected.getConsumedGaz(), billDetails.getConsumedGaz()),
                () -> assertEquals(billDetailsExpected.getTotalGazPrice(), billDetails.getTotalGazPrice()),
                () -> assertEquals(billDetailsExpected.getTotalPrice(), billDetails.getTotalPrice()));
    }

    @Test
    public void shouldReturnCorrectBillDetailForProPricing() {
        BillDetails billDetailsExpected = new BillDetails("PRO", new BigDecimal("0.114"),
                BigDecimal.valueOf(10), new BigDecimal("1.140"), new BigDecimal("0.111"),
                BigDecimal.valueOf(10), new BigDecimal("1.110"), new BigDecimal("2.250"));
        BillRequest billRequest = new BillRequest("PRO", BigDecimal.valueOf(10), BigDecimal.valueOf(10));
        BillDetails billDetails = billingService.getBillDetails(billRequest);
        assertAll("Verify Bill Details",
                () -> assertEquals(billDetailsExpected.getPriceCategory(), billDetails.getPriceCategory()),
                () -> assertEquals(billDetailsExpected.getElectricityPriceForKWh(), billDetails.getElectricityPriceForKWh()),
                () -> assertEquals(billDetailsExpected.getConsumedElectricity(), billDetails.getConsumedElectricity()),
                () -> assertEquals(billDetailsExpected.getTotalElectricityPrice(), billDetails.getTotalElectricityPrice()),
                () -> assertEquals(billDetailsExpected.getTotalElectricityPrice(), billDetails.getTotalElectricityPrice()),
                () -> assertEquals(billDetailsExpected.getGazPriceForKWh(), billDetails.getGazPriceForKWh()),
                () -> assertEquals(billDetailsExpected.getConsumedGaz(), billDetails.getConsumedGaz()),
                () -> assertEquals(billDetailsExpected.getTotalGazPrice(), billDetails.getTotalGazPrice()),
                () -> assertEquals(billDetailsExpected.getTotalPrice(), billDetails.getTotalPrice()));
    }

    @Test
    public void shouldReturnCorrectBillDetailForProPlusPricing() {
        BillDetails billDetailsExpected = new BillDetails("PRO_PLUS", new BigDecimal("0.118"),
                BigDecimal.valueOf(10), new BigDecimal("1.180"), new BigDecimal("0.113"),
                BigDecimal.valueOf(10), new BigDecimal("1.130"), new BigDecimal("2.310"));
        BillRequest billRequest = new BillRequest("PRO_PLUS", BigDecimal.valueOf(10), BigDecimal.valueOf(10));
        BillDetails billDetails = billingService.getBillDetails(billRequest);
        assertAll("Verify Bill Details",
                () -> assertEquals(billDetailsExpected.getPriceCategory(), billDetails.getPriceCategory()),
                () -> assertEquals(billDetailsExpected.getElectricityPriceForKWh(), billDetails.getElectricityPriceForKWh()),
                () -> assertEquals(billDetailsExpected.getConsumedElectricity(), billDetails.getConsumedElectricity()),
                () -> assertEquals(billDetailsExpected.getTotalElectricityPrice(), billDetails.getTotalElectricityPrice()),
                () -> assertEquals(billDetailsExpected.getTotalElectricityPrice(), billDetails.getTotalElectricityPrice()),
                () -> assertEquals(billDetailsExpected.getGazPriceForKWh(), billDetails.getGazPriceForKWh()),
                () -> assertEquals(billDetailsExpected.getConsumedGaz(), billDetails.getConsumedGaz()),
                () -> assertEquals(billDetailsExpected.getTotalGazPrice(), billDetails.getTotalGazPrice()),
                () -> assertEquals(billDetailsExpected.getTotalPrice(), billDetails.getTotalPrice()));
    }
}