import java.util.Stack;

public class bt7 {
    public static void main(String[] args) {
        String str = "cba";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        boolean flag = true;
        for (int i = 1; i < stack.size(); i++) {
            if(stack.peek() < stack.get(i)){
                flag = false;
            }
        }
        if(flag){
            System.out.println("Giam dan");
        }

    }
}
