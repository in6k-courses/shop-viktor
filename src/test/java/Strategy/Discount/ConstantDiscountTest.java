package Strategy.Discount;

import Order.*;
import org.junit.Test;
import java.math.BigDecimal;
import static org.junit.Assert.assertEquals;

public class ConstantDiscountTest {

    @Test
    public void testApplyDiscount() throws Exception {
        Thing thingA = new Thing("a", new BigDecimal(50), Categories.category.clothes);
        Thing thingB = new Thing("a", new BigDecimal(50), Categories.category.clothes);
        Basket basket = new Basket();
        basket.addToBasket(thingA);
        basket.addToBasket(thingB);


        Discount discount = new ConstantDiscount();
//        тест на скидку не должен работать с реальной корзиной
        discount.ApplyDiscount(basket);
        basket.setTotalDiscountAndSharePrice(basket.getTotalDiscountAndSharePrice().setScale(2, BigDecimal.ROUND_HALF_UP));
        assertEquals(99,basket.getTotalDiscountAndSharePrice().intValue());

    }
}