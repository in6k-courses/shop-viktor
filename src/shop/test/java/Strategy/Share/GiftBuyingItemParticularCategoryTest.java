package Strategy.Share;

import Order.Categories;
import Order.Thing;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by avatarion on 3/7/16.
 */
public class GiftBuyingItemParticularCategoryTest {

    @Test
    public void testApplyShare() throws Exception {
        Thing thingA = new Thing("a", new BigDecimal(50), Categories.category.clothes);

        Share share =  new GiftBuyingItemParticularCategory();
        share.ApplyShare(thingA);

        assertEquals("a+GIFT", thingA.getName().toString());
    }
}