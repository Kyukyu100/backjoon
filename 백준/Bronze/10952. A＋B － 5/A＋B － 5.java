import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			StringTokenizer str = new StringTokenizer(bf.readLine()," ");
			int a =  Integer.parseInt(str.nextToken());
			int b =  Integer.parseInt(str.nextToken());
			if(a+b !=0) {
				bw.write(a+b+"\n");
			}
			if(a+b == 0) {
				bw.flush();
				break;
			}
		}
	}
}