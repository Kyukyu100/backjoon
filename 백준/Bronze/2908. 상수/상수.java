
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer str= new StringTokenizer(bf.readLine()," ");
		StringBuffer a = new StringBuffer(str.nextToken());		
		StringBuffer b = new StringBuffer(str.nextToken());		
		int reverseA = Integer.parseInt(a.reverse().toString());
		int reverseB = Integer.parseInt(b.reverse().toString());
		if(reverseA > reverseB ) {
			System.out.println(reverseA);
		}else {
			System.out.println(reverseB);
		}
	}	
}
