package chap05;

import chap03.Product;

public class Order {
    private Product product;
    private  int amount;
    private Coupon coupon;



    public Order(Product product, int amount, Coupon coupon) {
        this.product = product;
        this.amount = amount;
        this.coupon = coupon;
    }
    public void showOrderInfo()
    {
        //计算商品总价
     double totalPrice = product.getPrice() * amount;
     //2.计算优惠金额
        double discount = coupon.calculateDiscount(totalPrice);
        //3.显示订单信息
        System.out.println("订单信息：");
        System.out.println("商品名称：" + product.getName() + "，" +
                "价格：" + product.getPrice() + "，数量：" + amount);
        //保留两位小数
        System.out.printf("商品总价：%.2f，优惠金额：%.2f\n", totalPrice, discount);
        System.out.printf("最终价格：%.2f\n", totalPrice - discount);
    }
    public void setCoupon(Coupon coupon) {
        this.coupon = coupon;
    }
}
