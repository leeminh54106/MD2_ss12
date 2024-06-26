import java.util.Stack;

public class bt8 {
    public static void main(String[] args) {
        String str = "35";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                stack.push(ch);
            }
        }
        boolean check = true;
        while (!stack.isEmpty()) {
            int number = Integer.parseInt(stack.pop().toString());
            if(number <0 || number ==0 || number == 1 || number == 2){
                System.out.println("Day khong phai la stack so nguyen to");
                break;
            }
            else{
                for (int i = 2; i < number; i++) {
                    if(number%i == 0){
                        check = false;
                        break;
                    }
                }
                if(!check){
                    break;
                }
            }

        }
        if(check){
            System.out.println("Day la stack so nguyen to");
        }else{
            System.out.println("Day k phai la stack so nguyen to");
        }
    }
}
