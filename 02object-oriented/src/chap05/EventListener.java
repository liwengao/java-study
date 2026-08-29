package chap05;

/**
 * 接口分离原则
 * 1.一个接口应该尽量只包含相同职责的方法，尽可能少移动方法，如果太多，要拆分
 * JAVA中1个类可以实现多个接口，但是只能单继承
 * 2.接口之间可以继承，而且可以多个继承
 */
public interface EventListener extends MouseEventListener, KeyEventListener {

    void onkeydown(String key);



}
