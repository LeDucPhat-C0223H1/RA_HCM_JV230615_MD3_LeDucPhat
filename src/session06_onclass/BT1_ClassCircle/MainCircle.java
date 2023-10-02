package session06_onclass.BT1_ClassCircle;

import java.util.Scanner;

public class MainCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Circle circle = new Circle();
        circle.inputData(scanner);
        circle.displayData();
    }
}
