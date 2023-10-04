package StreanAPI.BT4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// StreanAPI
// Bài tập 4: Sắp xếp danh sách số nguyên theo thứ tự giảm dần và lấy 3 phần tử đầu tiên.
public class GiamDanVaLay3PhanTuDauTien {
    public static void main(String[] args) {
        // Tạo List chứa mảng số nguyên
        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 7, 3, 8, 6, 4);

        List<Integer> sortedNumbers = numbers.stream()
                .sorted((a,b) -> b - a)
                .limit(3)
                .toList();

        System.out.print("Danh sách số nguyên: ");
        System.out.println(numbers);
        System.out.print("Danh sách sau khi sắp xếp và lấy 3 phần tử đầu tiên:");
        System.out.println(sortedNumbers);
    }
}
