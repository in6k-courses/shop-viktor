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
        Thing[] things = new Thing[10];

        things[0] = new Thing("Orange",new BigDecimal(10), Categories.category.food);
        things[1] = new Thing("Apple",new BigDecimal(10.80),Categories.category.food);
        things[2] = new Thing("Jacket",new BigDecimal(2200.99),Categories.category.clothes);
        things[3] = new Thing("Aspirin",new BigDecimal(80),Categories.category.medicament);
        things[4] = new Thing("Chocolate",new BigDecimal(20.55),Categories.category.food);
        things[5] = new Thing("Broad",new BigDecimal(8.30),Categories.category.food);
        things[6] = new Thing("Burger",new BigDecimal(15.05),Categories.category.food);
        things[7] = new Thing("Shirt",new BigDecimal(300),Categories.category.clothes);
        things[8] = new Thing("Paracetamol",new BigDecimal(75.31),Categories.category.medicament);
        things[9] = new Thing("Analgene",new BigDecimal(120),Categories.category.medicament);

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
