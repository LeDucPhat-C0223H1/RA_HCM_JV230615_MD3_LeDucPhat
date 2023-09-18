package session04_prepare;

import java.util.Scanner;

public class TH2_TimGiaTriTrongMang {
    public static void main(String[] args) {
        // Khai báo mảng tên danh sách học viên
        String[] listStudent = {"Sơn", "Châu", "Quân", "Phúc", "Đông", "Cường", "Đức", "Hiệp", "Minh", "Phát"};

        // Nhập tên học sinh
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời nhập tên học sinh: ");
        String inputName = scanner.nextLine();

        // Tìm tên học trong danh sách
        boolean isExist = false;
        for (int i = 0; i < listStudent.length; i++) {
            if (listStudent[i].equals(inputName)) {
                System.out.println("Vị trí của học sinh có tên " + inputName + " trong danh sách là: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Không tìm thấy học sinh có tên " + inputName + " trong danh sách");
        }

    }
}
