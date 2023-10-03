package BT5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TimChuoiNganNhatTrongChuoiVanBan {
    public static void main(String[] args) {
        // Bước 1: Tạo một chuỗi đầu vào
        String inputString = "Rikkei Academy để nông dân biết code chủ động, quyết tâm, thành công.";

        // Bước 2: Chuyển đổi chuỗi thành danh sách các từ
        List<String> wordList = Arrays.asList(inputString.split(" "));

        // Bước 3: Tạo danh sách để lưu trữ các từ có độ dài nhỏ nhất
        List<String> shortestWords = new ArrayList<>();

        // Bước 4: Duyệt danh sách các từ và tìm các từ có độ dài nhỏ nhất
        int shortestLength = Integer.MAX_VALUE;
        int wordCurrentlength;

        for (String word : wordList) {
            wordCurrentlength = word.length();
            //------------------------------//
            if (wordCurrentlength < shortestLength) {
                shortestLength = wordCurrentlength;
                //-----------------//
                shortestWords.clear();
                shortestWords.add(word);
            } else if (wordCurrentlength == shortestLength) {
                shortestWords.add(word);
            }
        }

        // Bước 5: In ra kết quả
        System.out.println("***** Nội dung Văn bản *****");
        System.out.println(inputString);
        System.out.print("\nChữ ngắn nhất trong câu là: ");
        for (String word : shortestWords) {
            System.out.printf("'%s' |" ,word);
        }
    }
}
