package chap04;

public class CodeBlock {
    //1.类加载和初始化顺序
    //1.1静态变量初始化
    //1.2静态代码块执行，只在类加载和初始时执行一次
    //2.对象创建流程
    //2.11普通成员变量初始化
    //2.2构造代码初始化
    //2.3构造方法初始化
    public static int num=100;
    public int num2=200;
    public CodeBlock()
    {
        System.out.println("空构造方法");
    }
    public void func()
    {
        System.out.println("普通方法");
    }
    {
        System.out.println("构造带码块");
    }
    static {
        System.out.println("num初始值"+num);
        num++;
        System.out.println("静态代码块");
    }
}
