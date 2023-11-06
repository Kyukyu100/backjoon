import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int[] c = new int[9];
		for(int i=0; i<c.length; i++) {
			c[i] =  Integer.parseInt(bf.readLine());
		}
		int max = c[0];
		int line=1;
		for(int i=0; i<c.length; i++) {
			if(max < c[i]) {
				max = c[i];
				line = i+1;
			}
		}
		
		System.out.println(max + "\n" + line);
		
    }
}