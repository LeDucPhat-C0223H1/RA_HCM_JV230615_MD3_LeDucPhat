package session03_onclass;

public class BT4_HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        int number = 2, count = 0;
        System.out.println("Hiển thị 20 số nguyên tố đầu tiên:");
        while (count<20) {
            if (isPrime(number)){
                System.out.print(number+"\t");
                count++;
            }
            number++;
        }
    }

    public static boolean isPrime(int number){
        if (number == 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number %i ==0) {
                return false;
            }
        }
        return true;
    }
}
