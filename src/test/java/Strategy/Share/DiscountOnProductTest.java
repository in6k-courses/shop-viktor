package Strategy.Share;

import Order.Categories;
import Order.Thing;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class DiscountOnProductTest {

    @Test
    public void testApplyShare() throws Exception {
        Thing thingA = new Thing("a", new BigDecimal(50), Categories.category.clothes);

        Share share =  new DiscountOnProduct();
//        нарушен стиль наименования методов
        share.ApplyShare(thingA);

        assertEquals(45, thingA.getPriceDiscountAndShare().intValue());
    }
}