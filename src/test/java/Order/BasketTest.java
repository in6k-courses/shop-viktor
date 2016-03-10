package Order;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.junit.Assert.*;

// - много дублирования кода в подготовке данных
// - сдедует испольщовать осмысленные тестовые данные - `a` не этот случай
public class BasketTest {

    @Test
    public void testAddToBasket() throws Exception {
        Thing thingA = new Thing("a", new BigDecimal(10.34), Categories.category.clothes);
        Thing thingB = new Thing("a", new BigDecimal(9.66), Categories.category.clothes);

        Basket basket = new Basket();
        basket.addToBasket(thingA);
        basket.addToBasket(thingB);

        assertEquals(20, basket.getTotalPrice().intValue());
    }

//    обращай внимание на правильное написание слов
    @Test
    public void testApdateTotalDiscountAndSharePrice() throws Exception {
        Thing thingA = new Thing("a", new BigDecimal(10.34), Categories.category.clothes);
        Thing thingB = new Thing("a", new BigDecimal(19.66), Categories.category.clothes);

        Basket basket = new Basket();
        basket.reCountTotalDiscountAndSharePrice();
        basket.addToBasket(thingA);
        basket.addToBasket(thingB);

        assertEquals(30, basket.getTotalPrice().intValue());
    }

    @Test
    public void testGetTotalPrice() throws Exception {
        Thing thingA = new Thing("a", new BigDecimal(1.34), Categories.category.clothes);
        Thing thingB = new Thing("a", new BigDecimal(19.66), Categories.category.clothes);

        Basket basket = new Basket();
        basket.addToBasket(thingA);
        basket.addToBasket(thingB);

        assertEquals(21,basket.getTotalPrice().intValue());
    }

    @Test
    public void testGetTotalDiscountAndSharePrice() throws Exception {

        Thing thingA = new Thing("a", new BigDecimal(1.34), Categories.category.clothes);
        Thing thingB = new Thing("a", new BigDecimal(19.66), Categories.category.clothes);

        Basket basket = new Basket();
        basket.addToBasket(thingA);
        basket.addToBasket(thingB);

        assertEquals(21,basket.getTotalDiscountAndSharePrice().intValue());
    }

    @Test
    public void testSetTotalDiscountAndSharePrice() throws Exception {
        Thing thingA = new Thing("a", new BigDecimal(1.34), Categories.category.clothes);
        Thing thingB = new Thing("a", new BigDecimal(19.66), Categories.category.clothes);
        Basket basket = new Basket();
        basket.addToBasket(thingA);
        basket.addToBasket(thingB);

        basket.setTotalDiscountAndSharePrice(new BigDecimal(777));

        assertEquals(777, basket.getTotalDiscountAndSharePrice().intValue());
    }

    @Test
    public void testGetOrderList() throws Exception {
        Thing thingA = new Thing("a", new BigDecimal(1.34), Categories.category.clothes);
        Thing thingB = new Thing("a", new BigDecimal(19.66), Categories.category.clothes);
        Basket basket = new Basket();
        ArrayList<Thing> things = new ArrayList<Thing>();

        basket.addToBasket(thingA);
        basket.addToBasket(thingB);
        things.add(thingA);
        things.add(thingB);

        assertEquals(things, basket.getOrderList());
    }
}