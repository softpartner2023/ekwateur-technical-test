package fr.ekwateur.billing.service;

import fr.ekwateur.billing.exception.PriceCategoryNotSupportedException;
import fr.ekwateur.billing.enums.PriceCategory;

import java.util.EnumMap;
import java.util.Map;

public class CalculatorFactory {

        static Map<PriceCategory, Calculator> map = new EnumMap<PriceCategory, Calculator>(PriceCategory.class);

        static {
            map.put(PriceCategory.PRICE_PARTICULAR, () -> PriceCategory.PRICE_PARTICULAR);
            map.put(PriceCategory.PRICE_PRO, () -> PriceCategory.PRICE_PRO);
            map.put(PriceCategory.PRICE_PRO_PLUS, () -> PriceCategory.PRICE_PRO_PLUS);
        }

        public static Calculator getCalculator(PriceCategory priceCategory) throws PriceCategoryNotSupportedException {
            if (!map.containsKey(priceCategory))
                throw new PriceCategoryNotSupportedException(priceCategory + " Price Category Not supported");
            return map.get(priceCategory);
        }
}
