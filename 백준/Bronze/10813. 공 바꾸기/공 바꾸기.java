import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str=  new StringTokenizer(bf.readLine(), " ");
		int a = Integer.parseInt(str.nextToken());
		int b = Integer.parseInt(str.nextToken());
		int[] basket = new int[a];  
		for(int i=0; i<basket.length; i++) {
			basket[i]=i+1;
		}
		for(int i=0; i<b; i++) {
			str = new StringTokenizer(bf.readLine()," ");
			int x = Integer.parseInt(str.nextToken());
			int y = Integer.parseInt(str.nextToken());
			int num1 = basket[x-1];
			int num2 = basket[y-1];
			basket[x-1] = num2;
			basket[y-1] = num1;
		}
		for(int i=0; i<basket.length; i++) {
			if(i==0) {
				System.out.print(basket[i]);
			}else {
				System.out.print(" "+ basket[i]);
			}
		}
	}
}