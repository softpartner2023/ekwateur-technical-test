package fr.ekwateur.billing.service;

import fr.ekwateur.billing.enums.PriceCategory;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CalculatorFactoryTest {

    @Test
    public void shouldReturnCalculatorForParticularPricing() {
        Calculator calculator = CalculatorFactory.getCalculator(PriceCategory.PRICE_PARTICULAR);
        assertThat(calculator.getPriceCategory()).isEqualTo(PriceCategory.PRICE_PARTICULAR);
    }

    @Test
    public void shouldReturnCalculatorForProPricing() {
        Calculator calculator = CalculatorFactory.getCalculator(PriceCategory.PRICE_PRO);
        assertThat(calculator.getPriceCategory()).isEqualTo(PriceCategory.PRICE_PRO);
    }

    @Test
    public void shouldReturnCalculatorForProPlusPricing() {
        Calculator calculator = CalculatorFactory.getCalculator(PriceCategory.PRICE_PRO_PLUS);
        assertThat(calculator.getPriceCategory()).isEqualTo(PriceCategory.PRICE_PRO_PLUS);
    }

}