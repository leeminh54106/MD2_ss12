import java.util.Scanner;
import java.util.Stack;

public class bt5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        Integer[] numbers = new Integer[]{1, 2, 3, 4, 5, 61, 7, 8, 9, 10};
        for (int i = 0; i < numbers.length; i++) {
            if (stack.isEmpty() || numbers[i] > stack.peek()) {
                stack.push(numbers[i]);
            }
        }
        System.out.println(stack.peek());
    }
}
