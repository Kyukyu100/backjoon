import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		long num = Long.parseLong(bf.readLine());
		long a =  1;
		if(num !=0 ) {
			for(long i=1; i<=num; i++) {
				a = a*i;
			}
		}else {
			num = 1;
		}
		System.out.println(a);
		
		
	}	
}