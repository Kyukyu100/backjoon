import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer str =  new StringTokenizer(bf.readLine()," ");
		int a = Integer.parseInt(str.nextToken());
		int b = Integer.parseInt(str.nextToken());
		ArrayList<Integer> basket = new ArrayList<>();
		for(int i=0; i<a; i++) {
			basket.add(i+1);
		}
		for(int i=0; i<b; i++) {
			str = new StringTokenizer(bf.readLine()," ");
			int startNum = Integer.parseInt(str.nextToken());
			int endNum = Integer.parseInt(str.nextToken());
			Collections.reverse(basket.subList(startNum-1, endNum));
		}
		for(int i : basket) {
			System.out.print(i+ " ");
		}
	}
}