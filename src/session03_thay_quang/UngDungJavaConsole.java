package session03_thay_quang;

import java.util.Scanner;

public class UngDungJavaConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời nhập vào 1 số nguyên để thực hiện chức năng: ");
        int number = Integer.parseInt(scanner.nextLine());

        while (true){
            System.out.println("********MENU********");
            System.out.println("1. Kiểm tra số chẵn lẻ");
            System.out.println("2. Kiểm tra số nguyên tố");
            System.out.println("3 .Kiểm tra số hoàn hảo");
            System.out.println("4. In ra các số chia hết cho 3 và 5 trong khoảng 1-number");
            System.out.println("5. Tính tổng các ước số của number");
            System.out.println("6. Tính tổng các số nguyên tố trong khoảng 1-number");
            System.out.println("7. Nhập 2 số nguyên (number1,number2), kiểm tra number có trong khoảng từ (number1,number2");
            System.out.println("8. Thoát");
            System.out.println("--------------------");

            System.out.print("Mời chọn chức năng muốn kiểm tra theo menu: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    checkEvenOdd(number);
                    System.out.println();
                    break;
                case 2:
                    if (checkIsPrime(number)){
                        System.out.println("=> " + number + " là số nguyên tố");
                    }else{
                        System.out.println("=> " + number + " không phải số nguyên tố");
                    }
                    System.out.println();
                    break;
                case 3:
                    checkPerfect(number);
                    System.out.println();
                    break;
                case 4:
                    printALLValueDivisible(number);
                    System.out.println();
                    break;
                case 5:
                    totalAllValueDivisor(number);
                    System.out.println();
                    break;
                case 6:
                    totalAllIsPrime(number);
                    System.out.println();
                    break;
                case 7:
                    checkInRange(number);
                    System.out.println();
                    break;
                case 8:
                    System.out.println("Thoát");
                    return;
                default:
                    System.out.println("Không hợp lệ! Mời chọn chức năng tỏng menu");

            }
        }
    }

    public static void checkEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("=> " + number + " là số chẵn");
        } else {
            System.out.println("=> " + number + " là số lẻ");
        }
    }

    public static boolean checkIsPrime(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void checkPerfect(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number %i ==0) {
                sum += i;
            }
        }
        if (sum==number) {
            System.out.println("=> " + number + " là số hoàn hảo");
        } else {
            System.out.println("=> " + number + " không phải số hoàn hảo");
        }
    }

    public static void printALLValueDivisible(int number){
        System.out.print("=> Các số chia hết cho cả 3 và 5 trong khoảng từ 1 đến " + number + " là: ");
        for (int i=1; i < number; i++){
            if(i%3==0 && i%5==0){
                System.out.print(i+"\t");
            }
        }
    }

    public static void totalAllValueDivisor(int number){
        int total=0;
        for (int i=1; i <= number; i++)
            if(number %i ==0){
                total +=i;
            }
        System.out.println("=> Tổng các ước số của " + number + " là: " + total);
    }

    public static void totalAllIsPrime(int number){
        int total=0;
        if (number<=1) {
            System.out.println("Số không hợp lệ");
            return;
        }
        for (int i = 2; i <=number ; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j==0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                total +=i;
            }
        }
        System.out.println("=> Tổng các số nguyên tố trong khoảng từ 1 đến " + number + " là: " + total);
    }

    public static void checkInRange(int number) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nhỏ: ");
        int number1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số lớn" );
        int number2 = Integer.parseInt(scanner.nextLine());

        if (number >= number1 && number <= number2) {
            System.out.println("=> Số " + number + " có trong khoảng từ " + number1 + " đến " + number2);
        }
    }
}
