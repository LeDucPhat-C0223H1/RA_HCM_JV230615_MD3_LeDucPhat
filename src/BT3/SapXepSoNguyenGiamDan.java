package BT3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Sắp xếp số nguyên giảm dần sử dụng phương thức Collection.sort()
public class SapXepSoNguyenGiamDan {
    public static void main(String[] args) {
        // Tạo một list số nguyên
        List<Integer> numbers = new ArrayList<>();

        // Thêm các phần tử vào list
        numbers.add(5);
        numbers.add(2);
        numbers.add(9);
        numbers.add(1);
        numbers.add(7);

        // In list trước khi sắp xếp
        System.out.println("List trước khi sắp xếp:");
        System.out.println(numbers);

        // Sắp xếp danh sách theo thứ tự tăng dần
        Collections.sort(numbers);

        // Đảo ngược danh sách để có thứ tự giảm dần
        Collections.reverse(numbers);

        // In list sau khi sắp xếp
        System.out.println("List sau khi sắp xếp giảm dần:");
        System.out.println(numbers);
    }
}
