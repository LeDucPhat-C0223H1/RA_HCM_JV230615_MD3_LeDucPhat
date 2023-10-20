package BT2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DemSoDong {
    public static void main(String[] args) {
        String tenTep = "C:\\Users\\Ben's Laptop\\Desktop\\RA_HCM_JV230615_MD3_LeDucPhat\\src\\BT2\\data_Bt3.txt"; // Thay thế bằng đường dẫn tới tệp văn bản cụ thể bạn muốn đọc

        try {
            FileReader fileReader = new FileReader(tenTep);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            int soDong = 0;
            String dong;

            while ((dong = bufferedReader.readLine()) != null) {
                soDong++;
                // In nội dung từng dòng nếu cần
                System.out.println(dong);
            }

            System.out.println("Số dòng trong tệp: " + soDong);

            bufferedReader.close();
        } catch (IOException e) {
            System.err.println("Xảy ra lỗi khi đọc tệp: " + e.getMessage());
        }
    }
}
