import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class bt3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 chuoi can kiem tra");
        String str = sc.nextLine().toLowerCase();
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            stack.push(ch);
            queue.add(ch);
        }
        boolean check = true;

        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.remove())) {
                check = false;
            }
        }
        if(check){
            System.out.println("Chuoi chuan");
        }else{
            System.out.println("Khong chuan");
        }
    }
}
