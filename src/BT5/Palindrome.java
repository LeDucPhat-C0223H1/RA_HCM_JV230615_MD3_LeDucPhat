package BT5;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chuỗi ban đầu: ");
        String inputString = scanner.nextLine().toLowerCase();

        System.out.println(inputString);

        for (int i = 0; i < inputString.length(); i++) {
            stack.push(inputString.charAt(i));
            queue.offer(inputString.charAt(i));
        }

        boolean check = true;
        while (!stack.isEmpty()) {
            if (stack.pop() != queue.poll()) {
                check = false;
                break;
            }
        }

        if (check) {
            System.out.println("\n=> Đây là 1 chuỗi Palindrome");
        }else {
            System.out.println("\n=> Đây không phải 1 chuỗi Palindrome");
        }


    }

}
