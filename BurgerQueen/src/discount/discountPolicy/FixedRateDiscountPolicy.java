package discount.discountPolicy;

public class FixedRateDiscountPolicy {

    private int discountrate;

    public FixedRateDiscountPolicy(int discountrate) {
        this.discountrate = discountrate;
    }

    public int calculateDiscountedPrice(int price) {
        return price - (price*discountrate / 100);
    }
}
