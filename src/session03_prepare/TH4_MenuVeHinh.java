package session03_prepare;

import java.util.Scanner;

public class TH4_MenuVeHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        while (choice !=4){
            System.out.println("*** Menu ***");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("4. Exit\n");
            System.out.print("Your choice is: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
                    drawTheTriangle();
                    System.out.println();
                    break;
                case 2:
                    drawTheSquare();
                    System.out.println();
                    break;
                case 3:
                    drawTheRectangle();
                    System.out.println();
                    break;
                case 4:
                    choice = 4;
                    System.out.println("Exit");
                    break;
                default:
                   System.out.println("Your choice isn't on the menu");
            }
        }
    }

    public static void drawTheTriangle(){
        System.out.println("Draw the traingle");
        for(int i = 0; i < 6; i++){
            for (int j = 6; j > i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void drawTheSquare(){
        System.out.println("Draw the square");
        for(int i = 0; i < 6; i++){
            for (int j = 6; j > 0; j--){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
    public static void drawTheRectangle(){
        System.out.println("Draw the traingle");
        for(int i = 0; i < 4; i++){
            for (int j = 7; j > 0; j--){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
