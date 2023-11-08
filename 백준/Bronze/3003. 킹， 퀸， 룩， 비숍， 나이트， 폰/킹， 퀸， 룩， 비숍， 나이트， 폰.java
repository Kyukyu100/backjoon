import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int[] chess = {1,1,2,2,2,8};
		StringTokenizer str = new StringTokenizer(bf.readLine(), " ");
 		for(int i=0; i<chess.length; i++) {
 			chess[i] = chess[i] - Integer.parseInt(str.nextToken());
			
		}
 		for(int i : chess) {
 			System.out.print(i + " ");
 		}
	}
}