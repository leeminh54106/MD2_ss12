import java.util.Stack;

public class bt9 {
    public static void main(String[] args) {
        int number = 111;
        Stack<Integer> stack = new Stack<>();
        while (number > 0) {
            int number1 = number%2;
            stack.push(number1);
            number = number/2;
        }
        StringBuilder stt = new StringBuilder();
        while (!stack.isEmpty()) {
            stt.append(stack.pop());
        }
        System.out.println(stt);
    }
}
