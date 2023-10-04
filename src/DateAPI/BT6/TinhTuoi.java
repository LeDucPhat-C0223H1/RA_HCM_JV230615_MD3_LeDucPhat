package DateAPI.BT6;

import java.time.LocalDate;
import java.time.Year;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

// DateTime API:
// Bài tập 6: Tính tuổi của một người từ năm sinh.
public class TinhTuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập năm sinh: ");
        String inputBirthYear = scanner.nextLine();

        Year birthYear = Year.parse(inputBirthYear);
        LocalDate currentDate = LocalDate.now();

        long age = ChronoUnit.YEARS.between(birthYear, currentDate);

        System.out.printf("Tuổi của người: %d tuổi\n",age );
    }
}
