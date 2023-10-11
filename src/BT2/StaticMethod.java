package BT2;

public class StaticMethod {
    public static final double PI = 3.14;

    public static double calCircleArea(double radius) {
        return PI * radius * radius;
    }

    public static double calRectangleArea(double width, double height) {
        return width * height;
    }

    public static double calTriangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static void main(String[] args) {
        double circleArea1 = StaticMethod.calCircleArea(3.5);
        double circleArea2 = StaticMethod.calCircleArea(6.0);
        double triangleArea1 = StaticMethod.calTriangleArea(3.0, 4.0, 5.0);
        double triangleArea2 = StaticMethod.calTriangleArea(4.5, 7, 6.0);
        double rectangleArea1 = StaticMethod.calRectangleArea(2.5, 6.0);
        double rectangleArea2 = StaticMethod.calRectangleArea(4.0, 7.0);

        System.out.println("Circle 1 Area: " + circleArea1);
        System.out.println("Circle 2 Area: " + circleArea2);
        System.out.println("Triangle 1 Area: " + triangleArea1);
        System.out.println("Triangle 2 Area: " + triangleArea2);
        System.out.println("Rectangle 1 Area: " + rectangleArea1);
        System.out.println("Rectangle 2 Area: " + rectangleArea2);
    }
}
