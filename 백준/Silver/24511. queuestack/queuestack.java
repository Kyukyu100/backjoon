import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> queue = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        
        for(int i = 0; i < n;i++){
            arr[i] = Integer.valueOf(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            int tmp = Integer.parseInt(st.nextToken());
            if(arr[i] == 0){
                queue.offer(tmp);
            } 
        }
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++){
            int tmp = Integer.parseInt(st.nextToken());
            queue.offerFirst(tmp);
            sb.append(queue.pollLast() + " ");
        }
        System.out.println(sb.toString());
        
    }
}