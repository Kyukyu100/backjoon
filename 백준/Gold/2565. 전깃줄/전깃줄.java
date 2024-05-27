import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Comparator;
 
public class Main {
 
	static Integer[] dp;
	static int[][] wire;
	
	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		dp = new Integer[N];
		wire = new int[N][2];
		
		StringTokenizer st;
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			wire[i][0] = Integer.parseInt(st.nextToken());
			wire[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(wire, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
		});
 
		int max = 0;
		 
		for(int i = 0; i < N; i++) {
			max = Math.max(recur(i), max);
		}
		
		System.out.println(N - max);
		
	}
	
	
	static int recur(int N) {
		
		if(dp[N] == null) {
			
			dp[N] = 1;	
			
			for(int i = N + 1; i < dp.length; i++) {
				
			
				if(wire[N][1] < wire[i][1]) {
					dp[N] = Math.max(dp[N], recur(i) + 1);
				}
			}
		}
		return dp[N];
        
	}
 
}