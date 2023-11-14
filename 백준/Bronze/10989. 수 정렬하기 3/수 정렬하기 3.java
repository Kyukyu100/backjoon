
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a =  Integer.parseInt(bf.readLine());
		int[] list = new int[a];
		for(int i=0; i<a; i++) {
			list[i] = Integer.parseInt(bf.readLine());
		}
		Arrays.sort(list);
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<list.length; i++) {
			sb.append(list[i] + "\n");
		}
		System.out.println(sb);
	}	
	
}