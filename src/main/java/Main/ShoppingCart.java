package Main;
import Order.*;
import Printer.Check;

import Strategy.Context.Calculate;

import java.util.ArrayList;

public class ShoppingCart {

    private Basket basket = new Basket();

    public void shoppingCart(ArrayList<Thing> things) {

        basket = Basket.createBasket(things);

        Calculate calculate = new Calculate();
        calculate.applyDiscountAndShares(basket);
    }

    public void checkOut(){
        Check check = new Check(basket);
        check.print();
    }
}
