import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(bf.readLine());
		int[] result = new int[x];
		for(int i=0; i < x; i++) {
			StringTokenizer str = new StringTokenizer(bf.readLine(), " ");
			int a = Integer.parseInt(str.nextToken());
			int b = Integer.parseInt(str.nextToken());
			result[i] = a+b;
		}
		for(int i=0; i< result.length; i++) {
			System.out.println(result[i]);
		}
	}
}