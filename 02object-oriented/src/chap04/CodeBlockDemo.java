package chap04;

public class CodeBlockDemo {
    static void main(String[] args) {
        System.out.println(CodeBlock.num);
        System.out.println(CodeBlock.num);
        System.out.println("====================================");
        CodeBlock cb1=new CodeBlock();
        System.out.println(cb1.num);
        CodeBlock cb2=new CodeBlock();
        System.out.println(cb2.num);
        System.out.println("====================================");
        System.out.println(TrafficLight.RED.getLabel()+"灯的下一个灯是"
                +TrafficLight.RED.getNextLight().getLabel()+"灯");

    }
}
