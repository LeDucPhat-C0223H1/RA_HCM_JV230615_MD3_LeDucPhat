package session01_onclass;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BT5_AvgScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập điểm môn Toán: " );
        double toan = scanner.nextDouble();

        System.out.print("Nhập điểm môn Lý: " );
        double ly = scanner.nextDouble();

        System.out.print("Nhập điểm môn Hóa: " );
        double hoa = scanner.nextDouble();

        System.out.print("Nhập điểm môn Văn: " );
        double van = scanner.nextDouble();

        System.out.print("Nhập điểm môn Anh Ngữ: " );
        double anh = scanner.nextDouble();

        double avg = ((toan + ly + hoa + van + anh) /5);
        System.out.println("Điểm trung bình: " + avg);

        if (avg >= 9 ) {
            System.out.println("Xếp loại xuất sắc");
        } else if (avg >= 8) {
            System.out.println("Xếp loại xuất giỏi");
        } else if (avg >= 6.5) {
            System.out.println("Xếp loại xuất khá");
        } else if (avg >= 5) {
            System.out.println("Xếp loại xuất trung bình");
        } else {
            System.out.println("Xếp loại xuất yếu");
        }
    }
}
