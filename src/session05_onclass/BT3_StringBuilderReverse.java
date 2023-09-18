package session05_onclass;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BT3_StringBuilderReverse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Mời nhập chuỗi ban đầu: ");

            // Gọi phương thức để đảo ngược chuỗi
            String originalString = scanner.nextLine();
            String reversedString = reverseString(originalString);

            // In ra chuỗi đảo ngược
            System.out.println("Chuỗi đảo ngược: " + reversedString);
            System.out.println();
        }
    }

    public static String reverseString(String input) {
        // Tạo một đối tượng StringBuffer từ chuỗi đầu vào
        StringBuffer stringBuffer = new StringBuffer(input);

        // Sử dụng phương thức reverse() để đảo ngược chuỗi
        stringBuffer.reverse();

        // Chuyển đối tượng StringBuffer thành chuỗi và trả về
        return stringBuffer.toString();
    }
}


//public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//
//    String str;
//    while (true) {
//        System.out.println("Mời nhập chuỗi: ");
//        str = scanner.nextLine();
//        String result = Test(str);
//
//        System.out.println("Kết quả: " + result );
//        System.out.println();
//    }
//}
//    public static String Test(String input){
//        StringBuilder stringBuilder =  new StringBuilder(input);
//        stringBuilder.reverse();
//        return stringBuilder.toString();
//    }
//}
