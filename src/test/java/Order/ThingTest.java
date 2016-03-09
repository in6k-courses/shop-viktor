package Order;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class ThingTest {

    @Test
    public void testGetName() throws Exception {
        Thing thing = new Thing("apple",new BigDecimal(10), Categories.category.clothes);

        assertEquals("apple",thing.getName());
    }

    @Test
    public void testSetName() throws Exception {
        Thing thing = new Thing("apple",new BigDecimal(10), Categories.category.clothes);

        thing.setName("orange");

        assertEquals("orange",thing.getName());
    }

    @Test
    public void testGetPriceWithoutDiscountAndShare() throws Exception {
        Thing thing = new Thing("apple",new BigDecimal(130), Categories.category.clothes);

        assertEquals(130,thing.getPriceDiscountAndShare().intValue());
    }

    @Test
    public void testGetCategoryName() throws Exception {
        Thing thing = new Thing("apple",new BigDecimal(130), Categories.category.clothes);

        assertEquals("clothes",thing.getCategoryName().toString());
    }

    @Test
    public void testSetPriceDiscountAndShare() throws Exception {
        Thing thing = new Thing("apple",new BigDecimal(130), Categories.category.clothes);
        thing.setPriceDiscountAndShare(new BigDecimal(12));

        assertEquals(12,thing.getPriceDiscountAndShare().intValue());
    }

    @Test
    public void testGetPriceDiscountAndShare() throws Exception {
        Thing thing = new Thing("apple",new BigDecimal(130), Categories.category.clothes);

        assertEquals(130,thing.getPriceDiscountAndShare().intValue());
    }


}