package Main;
import Order.*;
import Printer.Check;

import Strategy.Context.Calculate;

import java.util.ArrayList;

public class ShoppingCart {


    public void ShoppingCart(ArrayList<Thing> things) {

        Basket basket = Basket.createBasket(things);

        Calculate calculate = new Calculate();
        calculate.applyDiscountAndShares(basket);

        Check check = new Check(basket);
        check.print();
    }
}
