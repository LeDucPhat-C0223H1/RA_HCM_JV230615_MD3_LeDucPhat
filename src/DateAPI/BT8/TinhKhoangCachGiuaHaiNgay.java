package DateAPI.BT8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

// DateAPI
// Bài tập 8: Tính khoảng cách giữa hai ngày và in ra số ngày đó.
public class TinhKhoangCachGiuaHaiNgay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Nhập ngày bắt đầu: ");
        String start = scanner.nextLine();

        System.out.println("Nhập ngày kêt thúc");
        String end = scanner.nextLine();

        LocalDate startDate = LocalDate.parse(start, dateTimeFormatter);
        LocalDate endDate = LocalDate.parse(end, dateTimeFormatter);

        long result = Math.abs(ChronoUnit.DAYS.between(startDate,endDate));

        System.out.printf("Khoảng cách giữa 2 ngày là: %d ngày", result);
    }
}
