import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        boolean[] prime = new boolean[1000001];
        prime[0] = prime[1] = true;

        for (int i = 2; i <= Math.sqrt(1000000); i++) {
            if(prime[i] == true){
                continue;
            }
            for (int j = i*i; j <prime.length; j+=i) {
                prime[j] = true;
            }
        }

        for (int i = 0; i < T; i++) {
            int countPartition = 0;
            int N = Integer.parseInt(br.readLine());

            for (int j = 1; j <= N/2; j++) {
                if (!prime[j] && !prime[N - j]) {
                    countPartition++;
                }
            }
            sb.append(countPartition).append("\n");
        }
        System.out.print(sb);
    }
}