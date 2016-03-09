package Main;

import Order.*;
import java.math.BigDecimal;
import java.util.ArrayList;


public class MainClass {
    public static void main(String[] args){
        Categories.category clothes = Categories.category.clothes;
        Categories.category food = Categories.category.food;
        Categories.category medicament = Categories.category.medicament;
        ArrayList<Thing> things = new ArrayList<Thing>();
        //input dada for basket
        things.add(new Thing("broad", new BigDecimal(11), food));
        things.add(new Thing("analgine",new BigDecimal(49), medicament));
        things.add(new Thing("jacket",new BigDecimal(1100), clothes));
        things.add(new Thing("aspirine",new BigDecimal(15), medicament));
        things.add(new Thing("aspirine",new BigDecimal(15), medicament));
        things.add(new Thing("aspirine", new BigDecimal(15), medicament));
        things.add(new Thing("aspirine", new BigDecimal(15), medicament));

        ShoppingCart cart = new ShoppingCart();
        cart.shoppingCart(things);
        cart.checkOut();
    }
}
