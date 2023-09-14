package session02_onClass;
import java.util.Scanner;

public class BT7_TinhChuViVaDienTich {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        while (true) {
            System.out.println("\t\t*** Menu ***");
            System.out.println("1. Hình chữ nhật");
            System.out.println("2. Hình tam giác");
            System.out.println("3. Hình tròn");
            System.out.println("4. Thoát");
            System.out.println();
            System.out.print("Mời bạn chọn chức năng kiểm tra: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Hình chữ nhật");
                    Rectangle();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Hình tam giác");
                    Triangle();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Hình tròn");
                    Circle();
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Thoát!");
                    System.out.println();
                    return ;
                default:
                    System.out.println("Không hợp lệ! Mời bạn chọn lại theo menu.");
                    System.out.println();
            }
        }
    }

    // Hình chữ nhât
    public static void Rectangle() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mời nhập chiều rộng (m): ");
        double width = scanner.nextDouble();
        System.out.print("Mời nhập chiều dài (m): ");
        double height = scanner.nextDouble();

        double perimeter = (width + height)*2;
        double area = (width * height);
        System.out.println("Chu vi hình chữ nhật: " + perimeter + " m");
        System.out.println("Diện tích hình chữ nhật: " + area + " m2");
    }

    // Tam giác
    public static void Triangle() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mời nhập độ dài cạnh a (m): ");
        double sideA = scanner.nextDouble();
        System.out.print("Mời nhập độ dài cạnh b (m): ");
        double sideB = scanner.nextDouble();
        System.out.print("Mời nhập độ dài cạnh c (m): ");
        double sideC = scanner.nextDouble();

        double perimeter = (sideA + sideB + sideC);
        double area = Math.sqrt( (perimeter/2) * ((perimeter/2)-sideA) * ((perimeter/2)-sideB) * ((perimeter/2)-sideC));
        System.out.println("Chu vi tam giác: " + perimeter + " m");
        System.out.println("Diện tích tam giác: " + area + " m2");
    }

    // Hình tròn
    public static void Circle() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mời nhập bán kính (m): ");
        double radius = scanner.nextDouble();
        double perimeter = 2 * radius * (Math.PI);
        double area = (Math.PI) * (Math.pow(radius,2));
        System.out.println("Chu vi hình tròn: " + perimeter + " m");
        System.out.println("Diện tích hình tròn: " + area + " m2");
    }
}
