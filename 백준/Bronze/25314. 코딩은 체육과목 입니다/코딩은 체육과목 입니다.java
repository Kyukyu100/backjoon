import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(bf.readLine());
		StringBuffer result = new StringBuffer("int");
		if(x%4 == 0) {
			int num = x/4;
			for(int i=0; i<num; i++) {
				result.insert(0, "long ");
			}
		}
		System.out.println(result);
			
	}
}