package BT4;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Stack;

public class ReverseText {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng từ: ");
        int num = Integer.parseInt(scanner.nextLine());

        String inputString;
        for (int i = 0; i < num; i++) {
            System.out.printf("Nhập từ thứ %d: ",(i +1));
            inputString = scanner.nextLine();
            stack.push(inputString);
        }

        System.out.println("\nVăn bản đảo ngược là: ");
        for (int i = 0; i < num; i++) {
            System.out.print(stack.pop() + " ");
        }

    }


}
