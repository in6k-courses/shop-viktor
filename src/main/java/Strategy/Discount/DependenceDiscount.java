package Strategy.Discount;

import Order.Basket;
import java.math.BigDecimal;


public class DependenceDiscount implements Discount {
    @Override
    public void ApplyDiscount(Basket basket){
            basket.setTotalDiscountAndSharePrice(basket.getTotalDiscountAndSharePrice().multiply(new BigDecimal(0.97)));//discount 3%
    }
}
