package Strategy.Discount;

import Order.Basket;
import Order.Categories;
import Order.Thing;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;


public class DependenceDiscountTest {

    @Test
    public void testApplyDiscount() throws Exception {
        Thing thingA = new Thing("a", new BigDecimal(50), Categories.category.clothes);
        Thing thingB = new Thing("a", new BigDecimal(50), Categories.category.clothes);
        Basket basket = new Basket();
        basket.addToBasket(thingA);
        basket.addToBasket(thingB);

        Discount discount = new DependenceDiscount();
        discount.ApplyDiscount(basket);
//        Не надо усложнять жизнь себе и другим. Если математика не очевидна, как в этом случае,
//        следует сразу использовать результат а не такие длинные выражения.
        BigDecimal ex = new BigDecimal(100).multiply(new BigDecimal(0.97));

        assertEquals(ex,basket.getTotalDiscountAndSharePrice());
    }
}