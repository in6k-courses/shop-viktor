package Strategy.Discount;

import Order.Basket;
import Order.Categories;
import Order.Thing;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by avatarion on 3/7/16.
 */
public class ConstantDiscountTest {

    @Test
    public void testApplyDiscount() throws Exception {
        Thing thingA = new Thing("a", new BigDecimal(50), Categories.category.clothes);
        Thing thingB = new Thing("a", new BigDecimal(50), Categories.category.clothes);
        Basket basket = new Basket();
        basket.addToBasket(thingA);
        basket.addToBasket(thingB);

        Discount discount = new ConstantDiscount();
        discount.ApplyDiscount(basket);

        assertEquals(99,basket.getTotalDiscountAndSharePrice().intValue());

    }
}