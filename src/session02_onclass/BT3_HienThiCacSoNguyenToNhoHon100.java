package session02_onclass;

public class BT3_HienThiCacSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int number = 2;
        System.out.println("Các số nguyên tố nhỏ hơn 100:");
        while (number<100) {
            if (isPrime(number)){
                System.out.print(number+"\t");
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
