import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long res;				
        
        if (n == 0) {				
            res = 1;
        } else {
            res = fact(n);			
        }
        System.out.println(res);
        br.close();
    }

    public static long fact(long n) {
        if (n > 1) {
            n = n * fact(n - 1);	
        } else {
            n = n * 1;			
        }

        return n;
    }
    
}
