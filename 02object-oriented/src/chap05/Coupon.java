package chap05;

public class Coupon {
    private int threshold;
    private int discount;

    public Coupon(int threshold, int discount) {
        this.threshold = threshold;
        this.discount = discount;
    }
    public int calculateDiscount(double totalPrice) {
        return totalPrice>=threshold?discount:0;
    }
}
