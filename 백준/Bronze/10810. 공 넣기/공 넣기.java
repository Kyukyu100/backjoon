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
		for(int z=0; z<b; z++) {
			str= new StringTokenizer(bf.readLine()," ");
			int i =  Integer.parseInt(str.nextToken());
			int j =  Integer.parseInt(str.nextToken());
			int k =  Integer.parseInt(str.nextToken());
			for(int y=i-1; y<=j-1; y++) {
				basket[y] = k;
			}
		}
		for(int s=0; s<basket.length; s++) {
			if(s==0) {
				System.out.print(basket[s]);
			}else {
				System.out.print(" "+basket[s]);
			}
		}
		
	}
}