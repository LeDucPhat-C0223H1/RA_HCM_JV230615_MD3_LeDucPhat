package BT4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InRaChuoiCoDoDaiHon3KyTu {

    public static void main(String[] args) {
        // Tạo một chuỗi
        String inputString = "Rikkei Academy để nông dân biết code";

        // Tạo List String
        List<String> stringList = new ArrayList<>();

        // Chuyển đổi chuỗi thành mảng các từ
        String[] words = inputString.split(" ");

        // Thêm các từ có độ dài lớn hơn 3 ký tự vào List
        for (String word : words) {
            if (word.length() > 3) {
                stringList.add(word);
            }
        }

        // In ra các chuỗi có độ dài lớn hơn 3 ký tự
        System.out.println("Các chuỗi có độ dài lớn hơn 3 ký tự:");
        for (String str : stringList) {
            System.out.println(str);
        }
    }
}

