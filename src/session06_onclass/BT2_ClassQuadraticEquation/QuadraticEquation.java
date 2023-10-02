
package session06_onclass.BT2_ClassQuadraticEquation;

import java.util.Scanner;

public class QuadraticEquation {

    private double a;
    private double b;
    private double c;

    public QuadraticEquation(){
    }

    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void inputData(Scanner scanner) {
        System.out.print("Mời nhập giá trị biến a: ");
        this.a = Integer.parseInt(scanner.nextLine());
        System.out.print("Mời nhập giá trị biến b: ");
        this.b = Integer.parseInt(scanner.nextLine());
        System.out.print("Mời nhập giá trị biến c: ");
        this.c = Integer.parseInt(scanner.nextLine());
        System.out.print("\n");
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        double discriminant = getDiscriminant();
        if (discriminant >= 0) {
            return (-b + Math.sqrt(discriminant)) / (2 * a);
        } else {
            return 0;
        }
    }

    public double getRoot2() {
        double discriminant = getDiscriminant();
        if (discriminant >= 0) {
            return (-b - Math.sqrt(discriminant)) / (2 * a);
        } else {
            return 0;
        }
    }

    public void inputData() {
        double discriminant = getDiscriminant();
        if (discriminant > 0) {
            System.out.printf("Delta: %f > 0\n", discriminant);
            System.out.println("Phương trình có hai nghiệm:");
            System.out.println("x1: " + getRoot1());
            System.out.println("x2: " + getRoot2());
        } else if (discriminant == 0) {
            System.out.printf("Delta = 0\n", discriminant);
            double root = getRoot1();
            System.out.println("Phương trình có một nghiệm:");
            System.out.println("x1 = x2 = " + root);
        } else {
            System.out.printf("Delta: %f < 0\n", discriminant);
            System.out.println("Phương trình không có nghiệm.");
        }
    }
}
