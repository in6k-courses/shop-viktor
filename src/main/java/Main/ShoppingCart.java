package Main;

import Order.Basket;
import Order.Categories;
import Order.Thing;
import Printer.Check;
import Strategy.Context.Calculate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Random;

public class ShoppingCart {

    private Basket basket = new Basket();
    private Calculate calculate = new Calculate();

    public void shoppingCart(ArrayList<Thing> things) {
        basket = Basket.createBasket(things);
        calculate.applyDiscountAndShares(basket);
    }

    public void shoppingCart() {//random input data
        Thing[] things = new Thing[10];

        things[0] = new Thing("orange",new BigDecimal(10), Categories.category.food);
        things[1] = new Thing("apple",new BigDecimal(10.80),Categories.category.food);
        things[2] = new Thing("jacket",new BigDecimal(2200.99),Categories.category.clothes);
        things[3] = new Thing("aspirin",new BigDecimal(80),Categories.category.medicament);
        things[4] = new Thing("chocolate",new BigDecimal(20.55),Categories.category.food);
        things[5] = new Thing("broad",new BigDecimal(8.30),Categories.category.food);
        things[6] = new Thing("burger",new BigDecimal(15.05),Categories.category.food);
        things[7] = new Thing("sausage",new BigDecimal(10.20),Categories.category.food);
        things[8] = new Thing("paracetamol",new BigDecimal(75.31),Categories.category.medicament);
        things[9] = new Thing("analgene",new BigDecimal(120),Categories.category.medicament);
        Random random = new Random();
        for(int i = 0;i < random.nextInt(100) + 3 ;i++) {
            basket.addToBasket(things[random.nextInt(10)]);
        }
        calculate.applyDiscountAndShares(basket);
    }

    public void checkOut(){
        Check check = new Check(basket);
        check.print();
    }
}
