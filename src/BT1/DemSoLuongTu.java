package BT1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DemSoLuongTu {
    public static void main(String[] args) {
        // Bước 1: Đường dẫn đến tệp văn bản bạn muốn đọc
        String filePath = "C:\\Users\\Ben's Laptop\\Desktop\\RA_HCM_JV230615_MD3_LeDucPhat\\src\\BT1\\data_Bt1.txt";

        try {
            // Bước 2: Gọi hàm đọc tệp và lấy nội dung
            String fileContent = readFile(filePath);

            // Bước 3: Tách nội dung thành mảng các từ dựa trên khoảng trắng
            String[] words = fileContent.split("\\s+");

            // Bước 4: Đếm số lượng từ và hiển thị kết quả
            int wordCount = words.length;
            System.out.println("Số lượng từ trong tệp: " + wordCount);
        } catch (IOException e) {
            System.err.println("Đã xảy ra lỗi khi đọc tệp: " + e.getMessage());
        }
    }

    // Hàm đọc tệp và trả về nội dung dưới dạng chuỗi
    private static String readFile(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }
}
