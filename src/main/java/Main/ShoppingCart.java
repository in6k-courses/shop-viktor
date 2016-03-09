package Main;

import Order.*;
import Printer.Check;
import Strategy.Context.Calculate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Random;

public class ShoppingCart {

    private Basket basket = new Basket();
    private Calculate calculate = new Calculate();

    public ShoppingCart(ArrayList<Thing> things) {
        basket = Basket.createBasket(things);
        calculate.applyDiscountAndShares(basket);
    }

    public ShoppingCart() {//random input data
        ArrayList<Thing> things = new ArrayList<Thing>();

        things.add(new Thing("Orange",new BigDecimal(10), Categories.category.food));
        things.add(new Thing("Apple",new BigDecimal(10.80),Categories.category.food));
        things.add(new Thing("Jacket",new BigDecimal(2200.99),Categories.category.clothes));
        things.add(new Thing("Aspirin",new BigDecimal(80),Categories.category.medicament));
        things.add(new Thing("Chocolate",new BigDecimal(20.55),Categories.category.food));
        things.add(new Thing("Broad",new BigDecimal(8.30),Categories.category.food));
        things.add(new Thing("Burger",new BigDecimal(15.05),Categories.category.food));
        things.add(new Thing("Shirt",new BigDecimal(300),Categories.category.clothes));
        things.add(new Thing("Paracetamol",new BigDecimal(75.31),Categories.category.medicament));
        things.add(new Thing("Analgene",new BigDecimal(120),Categories.category.medicament));

        Random random = new Random();

        for(int i = 0;i < random.nextInt(100) + 3 ;i++) {
            basket.addToBasket(things.get(random.nextInt(10)));
        }
        ShoppingCart cart = new ShoppingCart(things);
    }

    public void checkOut(){
        Check check = new Check(basket);
        check.print();
    }
}
