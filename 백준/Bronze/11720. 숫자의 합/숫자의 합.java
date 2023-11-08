import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(bf.readLine());
		String num = bf.readLine();
		int result = 0;
		for(int i=0; i<count; i++) {
			result = result + (num.charAt(i) - 48 );
		}
		System.out.println(result);
	}
}