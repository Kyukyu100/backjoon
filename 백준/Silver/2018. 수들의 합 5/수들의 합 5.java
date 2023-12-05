import java.io.*;

public class Main{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
	
		int start=0;
        int end=0; 
		int sum=0;
        int cnt=0;
		while(start<=N) {
			while(++end<=N) { 
				sum += end; 
				if(sum>=N) {
					if(sum==N) cnt++;
					break;
				}
			}
			while(++start<=N) {
				sum -= start; 
				if(sum<=N) {
					if(sum==N) cnt++;
					break;
				}
			}	
		}
		System.out.println(cnt);
	}
}