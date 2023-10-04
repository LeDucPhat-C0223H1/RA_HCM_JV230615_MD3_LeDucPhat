package DateAPI.BT5;

// DateTime API:
// Bài tập 5: In ra ngày và giờ hiện tại theo định dạng yyyy-MM-dd HH:mm:ss.

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InNgayGio {
    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String result = currentDateTime.format(dateTimeFormatter);

        System.out.println("Ngày và giờ hiện tại: " + result);
    }
}
