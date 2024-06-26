import java.util.Scanner;
import java.util.Stack;

public class bt4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 chuoi bieu thuc");
        String str = sc.nextLine();
        System.out.println(isValid(str));
    }
    public static boolean isValid(String expression) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                // Nếu là dấu ngoặc trái, đưa vào stack
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                // Nếu là dấu ngoặc phải, kiểm tra với dấu ngoặc trái gần nhất trong stack
                if (stack.isEmpty()) {
                    return false; // Không có dấu ngoặc trái tương ứng
                }
                char left = stack.pop();
                if ((ch == ')' && left != '(') || (ch == ']' && left != '[') || (ch == '}' && left != '{')) {
                    return false; // Dấu ngoặc không khớp
                }
            }
        }

        // Kiểm tra xem stack có còn phần tử không
        return stack.isEmpty();
    }
}
