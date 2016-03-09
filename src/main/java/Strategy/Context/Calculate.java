package Strategy.Context;
import Order.*;
import Strategy.Discount.*;
import Strategy.Share.*;


public class Calculate {


    private void applyDiscount(Basket basket){
        Discount discount;
        if( basket.getTotalPrice().doubleValue() > 1000.0){
            discount = new DependenceDiscount();
        }
        else if( basket.getTotalPrice().doubleValue() > 100.0){
            discount = new ConstantDiscount();
        }
        else {
            discount = new NoDiscount();
        }
        discount.ApplyDiscount(basket);
    }

    private void applyShare(Basket basket){
        for (Thing thing: basket.getOrderList()) {
            Share share;
            if( thing.getCategoryName().equals(Basket.promoGiftName) ){
                share = new GiftBuyingItemParticularCategory();
                Basket.promoGiftName = Categories.category.nothing;
            }
            else if( thing.getCategoryName().equals(Basket.promoDiscountName) ){
                share = new DiscountOnProduct();
            }
            else{
                share = new NoShare();
            }
            share.ApplyShare(thing);
        }
    }

    public void applyDiscountAndShares(Basket basket){
        applyShare(basket);
        basket.reCountTotalDiscountAndSharePrice();
        applyDiscount(basket);
    }
}
