package DateAPI.BT7;

import java.time.MonthDay;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

// DateAPI
// Bài tập 7: Chuyển đổi một chuỗi ngày tháng thành đối tượng LocalDate và in ra ngày tháng.
public class ChuyenDoiChuoiNgayThang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ngày tháng: ");
        String input = scanner.nextLine();

        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd-MM");
        MonthDay monthDay = MonthDay.parse(input, inputFormatter);

        System.out.printf("Hôm nay là ngày %s tháng %s",monthDay.getDayOfMonth(),monthDay.getMonthValue());

    }
}
