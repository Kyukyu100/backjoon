import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            int n = Integer.parseInt(br.readLine());

            if (n == -1) {
                break;
            }

            int[] array = new int[n];

            int sum = 0;

            for (int i = 1; i <= n; i++) {
                if (n % i == 0 && i != n) {
                    array[i] = i;
                    sum += i;
                }
            }
            if (sum != n) { 
                sb.append(n+ " is NOT perfect. \n");
                continue; 
            }

            sb.append(n + " = 1"); 
            for(int i = 1; i <= n; i++){ 
                if(array[i-1] != 0 && array[i-1] != 1){ 
                    sb.append(" + " + array[i-1]);
                }

            }
            sb.append("\n");

        }
        br.close();
        System.out.println(sb);
    }

}