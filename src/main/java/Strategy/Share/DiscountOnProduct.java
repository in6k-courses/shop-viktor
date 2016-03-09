package Strategy.Share;

import Order.Thing;

import java.math.BigDecimal;

public class DiscountOnProduct implements Share {
    @Override
    public void ApplyShare(Thing thing) {
        thing.setPriceDiscountAndShare(thing.getPriceWithoutDiscountAndShare().multiply(new BigDecimal(0.9)));//discount 10%
    }
}
