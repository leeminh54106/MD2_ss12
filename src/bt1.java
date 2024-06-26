import java.util.Scanner;
import java.util.Stack;

public class bt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        System.out.println("Nhap so phan tu vao trong mang");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu vao trong mang "+(i+1));
            stack.push(sc.nextLine());
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
