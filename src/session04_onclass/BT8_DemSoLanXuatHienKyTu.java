package session04_onclass;

import java.util.Scanner;

public class BT8_DemSoLanXuatHienKyTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào 1 chuỗi:");
        String str = scanner.nextLine();
        System.out.println("Nhập vào ký tự cần tìm:");
        char charSearch = scanner.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == charSearch) {
                count++;
            }
        }
        if (count != 0) {
            System.out.printf("Ký tự %c xuất hiện %d lần trong chuỗi",charSearch,count);
        }else {
            System.out.printf("Không tìm thấy ký tự %c trong chuỗi",charSearch);
        }
    }
}
