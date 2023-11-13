import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(bf.readLine());
		int[] num =  new int[a];
		for(int i=0; i<a; i++) {
			num[i]=Integer.parseInt(bf.readLine());
		}
		Arrays.sort(num);
		
		for(int i : num) {
			System.out.println(i);
		}
		
		
	}	
}