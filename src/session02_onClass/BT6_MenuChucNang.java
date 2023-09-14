package session02_onClass;
import java.util.Scanner;

public class BT6_MenuChucNang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        while (true) {
            System.out.println("\t\t*** Menu ***");
            System.out.println("1. Kiểm tra tính chẵn lẽ của 1 số");
            System.out.println("2. Kiểm tra số nguyên tố");
            System.out.println("3. Kiểm tra một số có chia hết cho 3 không");
            System.out.println("4. Thoát");
            System.out.println();
            System.out.print("Mời bạn chọn chức năng kiểm tra: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Kiểm tra tính chẵn lẽ");
                    kiemTraChanLe();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Kiểm tra số nguyên tố");
                    kiemTraSoNguyenTo();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Kiểm tra một số có chia hết cho 3");
                    kiemTraChiaHetCho3();
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Kết thúc!");
                    System.out.println();
                    return ;
                default:
                    System.out.println("Không hợp lệ! Mời bạn chọn lại theo menu.");
                    System.out.println();
            }
        }
    }

    // Kiểm ta tính chẵn lẻ
    public static void kiemTraChanLe() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời nhập số: ");
        int number = Integer.parseInt(scanner.nextLine());
        if(number %2 ==0){
            System.out.println(number + " là số chẵn");
        }else {
            System.out.println(number + " là số lẻ");
        }
    }

    // Kiểm tra số nguyên tố
    public static void kiemTraSoNguyenTo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời nhập số : ");
        int number = Integer.parseInt(scanner.nextLine());
        boolean flag = true;
        if (number > 1) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    flag = false;
                    break;
                }
            }
        } else {
            flag = false;
        }
        if (flag) {
            System.out.println(number + " là số nguyên tố");
        } else {
            System.out.println(number + " không phải số nguyên tố");
        }
    }

    // Kiểm tra có chia hết cho 3 không
    public static void kiemTraChiaHetCho3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời nhập số: ");
        int number = Integer.parseInt(scanner.nextLine());
        if(number %3 ==0){
            System.out.println(number + " chia hết cho 3");
        }else {
            System.out.println(number + " không chia hết cho 3");
        }
    }
}
