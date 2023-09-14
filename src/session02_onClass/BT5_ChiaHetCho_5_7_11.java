package session02_onClass;

public class BT5_ChiaHetCho_5_7_11 {
    public static void main(String[] args) {
        int number = 1;

        while (true) {
            if (number % 5 == 0 && number % 7 == 0 && number % 11 == 0) {
                System.out.print("Số Nguyên dương nhỏ nhất chia hết cho cà 5,7 và 11 là: " + number);
                break;
            }
            number++;
        }
    }
}
