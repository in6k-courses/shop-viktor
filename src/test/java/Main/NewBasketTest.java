package Main;

import Order.Basket;
import Order.Categories;
import Order.Thing;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class NewBasketTest {

    @Test
    public void testCreateBasket() throws Exception {
        Categories.category food = Categories.category.food;
        Categories.category medicament = Categories.category.medicament;
        ArrayList<Thing> things = new ArrayList<Thing>();
        BigDecimal bigDecimal = new BigDecimal(0);
        things.add(new Thing("broad", new BigDecimal(11), food));
        things.add(new Thing("analgine", new BigDecimal(49), medicament));
        Basket extented = new Basket();
        extented.addToBasket(new Thing("broad",new BigDecimal(11), food));
        extented.addToBasket(new Thing("analgine", new BigDecimal(49), medicament));

        Basket actual = Basket.createBasket(things);

        assertEquals(extented.getTotalPrice(),actual.getTotalPrice());
    }
}