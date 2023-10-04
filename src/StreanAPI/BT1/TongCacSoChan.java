package StreanAPI.BT1;

import java.util.Arrays;
import java.util.List;

// StreanAPI
// Bài tập 1: Tính tổng của các số chẵn từ một danh sách số nguyên.
public class TongCacSoChan {
    public static void main(String[] args) {
        // Tạo List chứa mảng số nguyên
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // Cách 1
        int sumOfEvenNumbers = numbers.stream()
                .filter((element) -> element %2 ==0)
                .mapToInt(Integer:: intValue)
                .sum();

//        Cách 2 ngắn gọn
//        int sumOfEvenNumbers = numbers.stream()
//                .filter((element) -> element %2 ==0)
//                .reduce(0,(a,b)->a+b);

        System.out.print("Dãy số nguyên: ");
        System.out.println(numbers);
        System.out.println("Tổng của các số chẵn là: " + sumOfEvenNumbers);
    }
}
