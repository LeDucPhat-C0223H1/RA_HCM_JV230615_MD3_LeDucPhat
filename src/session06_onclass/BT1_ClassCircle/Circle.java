package session06_onclass.BT1_ClassCircle;

import java.util.Scanner;

public class Circle {
    private double radius;
    private double parameter;
    private double area;

    public Circle() {
    }

    public Circle(double radius, double parameter, double area) {
        this.radius = radius;
        this.parameter = parameter;
        this.area = area;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public double getParameter() {
        return parameter;
    }

    public void setParameter(float parameter) {
        this.parameter = parameter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public double parameter(){
        return 2 * Math.PI * this.radius;
    }

    public double area(){
        return Math.PI * Math.PI * this.radius;
    }

    public void inputData(Scanner scanner){
        System.out.print("Mời nhập bán kính (m): ");
        this.radius = scanner.nextFloat();
    }

    public void displayData() {
        System.out.printf("Bán kính: %f m\n", radius);
        System.out.printf("Chu vi: %f m\n", parameter());
        System.out.printf("Diện tích: %f m2\n", area());
    }


}
