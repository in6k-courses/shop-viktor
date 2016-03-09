package Strategy.Share;

import Order.Thing;

public class GiftBuyingItemParticularCategory implements Share {
    @Override
    public void ApplyShare(Thing thing) {
        thing.setName( thing.getName().concat("+GIFT") );
    }
}
