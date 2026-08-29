package chap05;

public class RateDiscount implements Coupon {
    private int threshold;
    private int discount;

    public RateDiscount(int discount, int threshold) {
        this.discount = discount;
        this.threshold = threshold;
    }

    @Override
    public int calculateDiscount(double totalPrice) {
        return totalPrice>=threshold?(int)(totalPrice*(100-discount)/100):0;
    }
}
