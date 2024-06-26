import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class bt6 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Queue<Integer> q = new LinkedList<Integer>(Arrays.asList(arr));
        int n = q.poll();
        for (int i = 0; i < n; i++) {
            int m = q.poll();
            if(n>m){
                q.offer(n);
                n = m;
            }else{
                q.offer(m);
            }
        }
        System.out.println(n);
    }
}
