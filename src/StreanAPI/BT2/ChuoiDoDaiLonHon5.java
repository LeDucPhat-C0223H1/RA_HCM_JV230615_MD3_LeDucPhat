package StreanAPI.BT2;

import java.util.Arrays;
import java.util.List;

// StreanAPI
// Bài tập 2: Lọc danh sách chuỗi để chỉ chứa những từ có độ dài lớn hơn 5.
public class ChuoiDoDaiLonHon5 {
    public static void main(String[] args) {
        // Tạo List chứa chuỗi
        List<String> strings = Arrays.asList("Apple", "Banana", "Mango", "Peach", "Pear", "WaterMelon", "Orange", "Grape", "Strawberry" );

        List<String> result = strings.stream()
                .filter(element -> element.length() >5)
                .toList();

        System.out.print("Dãy chuỗi ban đầu: ");
        System.out.println(strings);
        System.out.print("Các chuỗi độ dài > 5: ");
        System.out.println(result);
    }
}
