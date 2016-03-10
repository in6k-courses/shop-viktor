package Strategy.Discount;

import Order.Basket;
import java.math.BigDecimal;

// Этот класс дублирует ConstantDiscount и не соответствует своему названию.
public class DependenceDiscount implements Discount {
    @Override
    public void ApplyDiscount(Basket basket){
            basket.setTotalDiscountAndSharePrice( basket.getTotalDiscountAndSharePrice().multiply( new BigDecimal(0.97)));//discount 3%
    }
}
