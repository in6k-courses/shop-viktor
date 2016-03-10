package Order;

import java.math.BigDecimal;

public class Thing {

//   Цена оригинального товара, да и сам товар, не моет меняться после каждого перерасчета.
//   Для этого следовало создать отдельную сущьность.
    private BigDecimal priceWithoutDiscountAndShare;
    private BigDecimal priceDiscountAndShare;

    private String name;

    private Categories.category category;


    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public BigDecimal getPriceWithoutDiscountAndShare(){
        return priceWithoutDiscountAndShare;
    }


    public BigDecimal getPriceDiscountAndShare() {
        return priceDiscountAndShare;
    }

    public void setPriceDiscountAndShare(BigDecimal priceDiscountAndShare) {
        this.priceDiscountAndShare = priceDiscountAndShare;
    }


    public Categories.category getCategoryName(){
        return category;
    }


    public Thing(String name, BigDecimal priceWithoutDiscountAndShare, Categories.category category){
        this.name = name;
        this.priceWithoutDiscountAndShare = priceWithoutDiscountAndShare;
        this.priceDiscountAndShare = priceWithoutDiscountAndShare;
        this.category = category;
    }
}
