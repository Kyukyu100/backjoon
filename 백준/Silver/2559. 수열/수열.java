import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        
        int max = 0; 
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken()); 
        int K = Integer.parseInt(st.nextToken()); 
        
        int[] temperature = new int[N]; 
        
        st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < N; i++) {
            temperature[i] = Integer.parseInt(st.nextToken()); 
        }

        for (int i = 0; i < K; i++) {
            max = max + temperature[i];
        }
        
        int temp = max; 
        
        for (int i = K; i < N; i++) {
            temp = temp - temperature[i - K] + temperature[i];
            max = Math.max(max, temp);  
        }

        System.out.println(max); 
        
    }
    
}