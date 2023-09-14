package session02_onClass;

public class BT2_HienThiCacLoaiHinh {
    public static void main(String[] args) {

        // Vẽ hình chữ nhật
        System.out.println("Hiển thị hình chữ nhật:");
        int i, j, k;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 7; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        // Vẽ tam giác vuông, có cạnh góc vuông ở botton-left
        System.out.println("Hiển thị tam giác vuông botton-left:");
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        // Vẽ tam giác vuông, có cạnh góc vuông ở top-left
        System.out.println("Hiển thị tam giác vuông top-left:");
        for (i = 1; i <= 5; i++) {
            for (j = 5; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        // Vẽ tam giác cân
        System.out.println("Hiển thị tam giác cân");
        for (i = 1; i <= 6; i++) {
            for (k = i; k < 6; k++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

    }
}
