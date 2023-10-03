package BT2;

import java.util.ArrayList;
import java.util.List;

public class DaoNguocListSoNguyen {
    public static void main(String[] args) {
        // Tạo một list số nguyên
        List<Integer> numbers = new ArrayList<>();

        // Thêm các phần tử vào list
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // In list trước khi đảo ngược
        System.out.println("List trước khi đảo ngược:");
        System.out.println(numbers);

        // Đảo ngược list
        List<Integer> reversedNumbers = new ArrayList<>();
        for (int i = numbers.size() - 1; i >= 0; i--) {
            reversedNumbers.add(numbers.get(i));
        }

        // In list sau khi đảo ngược
        System.out.println("List sau khi đảo ngược:");
        System.out.println(reversedNumbers);
    }
}
