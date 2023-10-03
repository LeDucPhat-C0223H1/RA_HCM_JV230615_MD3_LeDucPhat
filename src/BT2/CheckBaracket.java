package BT2;

import java.util.Scanner;
import java.util.Stack;

/** Viết chương trình sử dụng stack để kiểm tra xem một chuỗi đầu vào có cặp dấu ngoặc đúng hay không.
 rekkei Academi - daipv */
public class CheckBaracket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi đầu vào:");
        String input = scanner.nextLine(); // lấy chỗi đầu vào từ bàn phím

        //B1: Tạo một stack rỗng để lưu trữ các dấu ngoặc.
        Stack<Character> stack = new Stack<>();

        //B2: Duyệt từng ký tự trong chuỗi đầu vào.
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            // B3: Nếu ký tự đang xét là một dấu ngoặc mở (như (, {, [), đưa nó vào stack.
            if (ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }

            // B4: Nếu ký tự đang xét là một dấu ngoặc đóng (như ), }, ]),
            // lấy phần tử trên cùng của stack ra và so sánh với dấu ngoặc đóng.
            // Nếu chúng không khớp, chuỗi không đúng. Nếu khớp, tiếp tục xét ký tự tiếp theo.
            else if (ch == ')' || ch == '}' || ch == ']'){
                // nếu không đúng ngoặc mở sẽ kiểm tra có phải ngoặc đóng không, nếu đúng thì chạy khối lệnh trong if
                // nếu chưa có ngoặc mở mà đã có ngoặc đóng thì sẽ báo sai và dừng chương trình
                if (stack.isEmpty()) {
                    System.out.println("=> Chuỗi không đúng vì chỉ có ngoặc đóng, không có ngoặc mở");
                    return;
                }
                char openBracket = stack.pop();  // tạo biến openBracket để lấy ngoặc mở cuối cùng khỏi stack
                if (!isMatchingBracket(openBracket, ch)){  // gọi hàm check với biến openBracket, và ngoặc đóng hiện tại.
                    System.out.println("=> Chuỗi không đúng vì có cặp ngoặc mở đóng không cùng loại");  // nếu biến trả về false có nghĩa là cặp ngoặc đóng mở không tương đồng
                    return;
                }
            }
        }

        //B5: Nếu đã duyệt hết chuỗi và stack vẫn còn phần tử, chuỗi không đúng.
        boolean check = stack.isEmpty();
        if (check){
            System.out.println("=> Có các cặp ngoặc hợp lệ");
        }else {
            System.out.println("=> Chuỗi không đúng vì chỉ có ngoặc mở, không có ngoặc đóng");
        }
    }

    // Hàm kiểm tra cặp ngoặc trùng khớp
    private static boolean isMatchingBracket(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }
}
