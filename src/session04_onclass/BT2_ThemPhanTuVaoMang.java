package session04_onclass;

import java.util.Scanner;

public class BT2_ThemPhanTuVaoMang {
    public static void main(String[] args) {
        // B1: Khai báo, khởi tạo và in ra mảng 1 chiều cho sẵn
        int[] arrInt = {10,4,6,7,8,6,9,5,1,3};
        System.out.println("Các phần tử trong mảng 1 chều cho sẵn: ");
        for (int element: arrInt) {
            System.out.printf("%d\t",element);
        }
        System.out.println("\n");


        // B2: Nhập phần tử muốn thêm
        Scanner scanner = new Scanner(System.in);
        int valueAdd;
        System.out.print("Nhập giá trị phần tử muốn thêm: ");
        valueAdd = scanner.nextInt();


        // B3: Chọn vị trí muốn thêm từ menu
        int choice = -1;
        System.out.println("*****MENU*****");
        System.out.println("1. Thêm vào đầu mảng");
        System.out.println("2. Thêm vào cuối mảng");
        System.out.println("3. Thêm vào vị trí chọn");
        System.out.print("Chọn vị trí theo menu: ");
        choice = scanner.nextInt();


        // B4: Thêm phần tử
        int[] newArr = new int[arrInt.length + 1];
        switch (choice){
            case 1:
                // Thêm vào đầu mảng
                newArr[0] = valueAdd;
                for (int i = 1; i < newArr.length ; i++) {
                    newArr[i] = arrInt[i-1];
                }
                break;
            case 2:
                // Thêm vào cuối mảng
                for (int i = 0; i < newArr.length-1; i++) {
                    newArr[i] = arrInt[i];
                }
                newArr[newArr.length -1] = valueAdd;
                break;
            case 3:
                // Thêm vị trí bất kì
                int indexAdd = -1;
                System.out.print("Vị trí muốn thêm: ");
                indexAdd = scanner.nextInt();
                if (indexAdd < 0 && indexAdd > arrInt.length) {
                    System.out.println("=> Không thể chèn phần tử vào mảng, chọn lại vị trí ");
                }else {
                    for (int i = 0; i < indexAdd; i++) {
                        newArr[i] = arrInt[i];
                    }
                    newArr[indexAdd] = valueAdd;
                    for (int i = indexAdd+1; i < newArr.length; i++) {
                        newArr[i] = arrInt[i-1];
                    }
                }
                break;
        }


        // B5: Gán lại mảng mới cho mảng ban đầu và in ra kết quả
            arrInt = newArr;
            System.out.println("\nMảng sau khi thêm phần tử: ");
            for (int element: arrInt) {
                System.out.printf("%d\t", element);
            }

    }
}


