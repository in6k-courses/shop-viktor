package Strategy.Context;

import Order.*;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class CalculateTest {

//    не используй цифры в названиях методов только для того, что бы сделать названия разными
    @Test
    public void testApplyDiscountAndShares1() throws Exception {
        Thing thingA = new Thing("a", new BigDecimal(1.34), Categories.category.clothes);
        Thing thingB = new Thing("a", new BigDecimal(19.66), Categories.category.clothes);
        Basket basket = new Basket();
        basket.addToBasket(thingA);
        basket.addToBasket(thingB);

        Calculate calculate = new Calculate();
        calculate.applyDiscountAndShares(basket);

        assertEquals(21, basket.getTotalPrice().intValue());
    }

//    удаляй закоментированный код
/*
    @Test
    public void testApplyDiscountAndShares2() throws Exception {
        Thing thingA = new Thing("a", new BigDecimal(500), Categories.category.clothes);
        Thing thingB = new Thing("a", new BigDecimal(5000), Categories.category.clothes);
        Basket basket = new Basket();
        basket.addToBasket(thingA);
        basket.addToBasket(thingB);

        Calculate calculate = new Calculate();
        calculate.applyDiscountAndShares(basket);

        assertEquals(990, basket.getTotalPrice());
    }*/
}