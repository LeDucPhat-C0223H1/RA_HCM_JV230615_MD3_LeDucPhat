package session04_onclass;

import java.util.Scanner;

public class BT1_XoaPhanTuKhoiMang {
    public static void main(String[] args) {

        // B1: Khai báo, khởi tạo và in ra mảng 1 chiều cho sẵn
        int[] arrInt = {10,4,6,7,8,6,9,5,1,3};
        System.out.println("Các phần tử trong mảng 1 chều cho sẵn: ");
        for (int element: arrInt) {
            System.out.printf("%d\t",element);
        }
        System.out.println("\n");


        // B2: Chọn phần tử muốn xóa
        int choice;
        int index_delete = -1;
        System.out.print("Chọn phần tử trong mảng muốn xóa: ");
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();


        // B3: Tìm và đếm số lần xuất hiện của giá trị cần xóa trong mảng
        int count = 0;
        boolean isExist = false;
        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i] == choice) {
                isExist = true;
                count++;
            }
        }


        // B4: Nếu không xuất hiện thì hiện thông báo v kết thúc.
        // Có thì tiếp tục thực hiện xóa
        if (!isExist) {
            System.out.println("=> Không có phần tử muốn xóa trong mảng");
        }else {
            // Tạo mảng mới độ có dài nhỏ hơn
            int[] newArr = new int[arrInt.length - count];
            // Xóa: sao chép các giá trị mảng cũ trừ phần tử muốn xóa
            int j = 0;
            for (int i = 0; i < arrInt.length; i++) {
                if (arrInt[i] != choice) {
                    newArr[j] = arrInt[i];
                    j++;
                }
            }
            // Gán lại mảng mới cho mảng ban đầu và in ra kết quả
            arrInt = newArr;
            System.out.println("Mảng sau khi xóa phần tử: ");
            for (int element: arrInt) {
                System.out.printf("%d\t", element);
            }
        }

    }
}
