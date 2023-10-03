package BT1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CacHamTrongList {
    public static void main(String[] args) {
        // Tạo một list số nguyên
        List<Integer> numbers = new ArrayList<>();

        // Số lượng phần tử ngẫu nhiên, tối đa là 10
        int count = (int) (Math.random() * 10) + 1;

        // Gán giá trị ngẫu nhiên cho từng phần tử
        for (int i = 0; i < count; i++) {
            int randomNumber = (int) (Math.random() * 100);
            numbers.add(randomNumber);
        }

        // In list số nguyên
        System.out.println("List số nguyên ngẫu nhiên:");
        System.out.println(numbers);

        // Tìm phần tử lớn nhất
        int maxNumber = Collections.max(numbers);

        // In phần tử lớn nhất
        System.out.println("Phần tử lớn nhất trong list: " + maxNumber);
    }
}
