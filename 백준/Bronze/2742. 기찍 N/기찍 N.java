import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		long a = Long.parseLong(bf.readLine());
		for(long i=a; i>=1; i--) {
			System.out.println(i);
		
		}
	}	
}