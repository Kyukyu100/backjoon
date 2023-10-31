import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		int x= Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int z = Integer.parseInt(st.nextToken());
		int result;
		if(x == y && x == z) {
			result = 10000 + (x * 1000);
			System.out.println(result);
		}else if(x == y && x != z ){
			result = 1000 + (x * 100);
			System.out.println(result);
		}else if(x != y && y == z) {
			result = 1000 + (z * 100);
			System.out.println(result);
		}else if(x != y && x == z) {
			result = 1000 + (z * 100);
			System.out.println(result);
		}else {
			result = (((x > y) && (x > z)) ? x : (y > z ? y : z )) * 100;
			System.out.println(result);
		}
	}
}