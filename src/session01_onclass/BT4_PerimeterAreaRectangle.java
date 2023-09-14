package session01_onclass;

import java.util.Scanner;

public class BT4_PerimeterAreaRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter width of rectangle (m): ");
        double width = scanner.nextDouble();

        System.out.print("Enter height of rectangle (m): ");
        double height = scanner.nextDouble();

        double perimeter = ((width + height) * 2);
        double area = (width * height);

        System.out.println("Perimeter of Rectangle: " + perimeter + " m" );
        System.out.println("Area of Rectangle: " + area + " m2" );
    }
}
