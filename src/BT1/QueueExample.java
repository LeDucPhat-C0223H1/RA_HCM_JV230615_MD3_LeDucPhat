package BT1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử: ");
        int n = Integer.parseInt(scanner.next());
        System.out.println();


        String element;
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập phần tử thứ %d: ", i+1);
            element = scanner.next();
            queue.add(element);
        }
        System.out.print("\n-------------\n");
        System.out.println("Các phần tử của danh sách: ");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
