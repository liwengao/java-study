package chap05;

public interface Shape {
    final double PI=3.1415926;
    static double calculatePerimeter(double radius)
    {
        return 2*PI*radius;
    }
    default double calculateArea(double radius)
    {
        return PI*radius*radius;
    }


}
