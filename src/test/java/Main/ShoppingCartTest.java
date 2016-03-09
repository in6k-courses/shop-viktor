package Main;

import Order.*;
import Printer.Check;
import Strategy.Context.Calculate;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class ShoppingCartTest {

    @Test
    public void testShoppingCart() throws Exception {
        //

        Categories.category food = Categories.category.food;
        Categories.category medicament = Categories.category.medicament;
        ArrayList<Thing> things = new ArrayList<Thing>();
        BigDecimal bigDecimal = new BigDecimal(0);
        things.add(new Thing("broad",       new BigDecimal(11), food));
        things.add(new Thing("analgine",    new BigDecimal(49), medicament));
        Basket basket = new Basket();
        Calculate calculate= new Calculate();
        Check check = new Check(basket);
        //
        basket = Basket.createBasket(things);
        calculate.applyDiscountAndShares(basket);
        //

        assertEquals(60, basket.getTotalPrice().intValue());
        assertEquals(55, basket.getTotalDiscountAndSharePrice().intValue());
    }
}