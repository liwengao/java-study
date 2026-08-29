package chap05;

import chap03.Product;

public class InterfaceDemo {
    static void main(String[] args) {
        Product product = Product.createPhysicalProduct("Book", 19.99, 0.5);
        Coupon coupon = new PriceDiscountCoupon(50, 10);
        Order order=new Order(product,10,coupon);
        order.showOrderInfo();
        System.out.println("+++++++++++++++++++++++++++++++++++");
        Coupon coupon2 = new RateDiscount(60, 80);
        order.setCoupon(coupon2);
        order.showOrderInfo();

    }
}
