package session06_onclass.BT2_ClassQuadraticEquation;

import java.util.Scanner;

public class MainQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        QuadraticEquation  equation = new QuadraticEquation();
        equation.inputData(scanner);
        equation.inputData();
    }
}
