package Order;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Basket {

    private BigDecimal totalDiscountAndSharePrice = new BigDecimal(0.0);
    private BigDecimal totalPrice = new BigDecimal(0.0);

    public static Categories.category promoGiftName = Categories.category.clothes;
    public static Categories.category promoDiscountName = Categories.category.medicament;

    private ArrayList<Thing> orderList = new ArrayList<Thing>();

    public void addToBasket(Thing thing){
        orderList.add(thing);
        totalPrice = totalPrice.add(thing.getPriceWithoutDiscountAndShare());
        totalDiscountAndSharePrice = totalPrice;
    }
    public void reCountTotalDiscountAndSharePrice(){
        totalDiscountAndSharePrice = new BigDecimal(0.0);
        for (Thing thing: orderList) {
            totalDiscountAndSharePrice = totalDiscountAndSharePrice.add(thing.getPriceDiscountAndShare());
        }
    }

    public BigDecimal getTotalPrice(){
        return totalPrice;
    }

    public BigDecimal getTotalDiscountAndSharePrice(){
        return totalDiscountAndSharePrice;
    }

    public void setTotalDiscountAndSharePrice(BigDecimal sum){
        this.totalDiscountAndSharePrice = sum;
    }

    public List<Thing> getOrderList() {
        return orderList;
    }

    public static Basket createBasket(ArrayList<Thing> things) {

        Basket basket = new Basket();
        for (Thing thing: things) {
            basket.addToBasket(thing);
        }
        return basket;
    }
}
