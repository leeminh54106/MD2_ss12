import java.util.Scanner;
import java.util.Stack;

public class bt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi dau vao");
        String str = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '('|| ch == '{' || ch == '[') {
                stack.push(ch);
            }
            else if (ch == ')' || ch == '}' || ch == ']') {
                if(stack.pop().compareTo(ch) != 0){
                    System.out.println("Chuoi k dung");
                    break;
                }
            }
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
