import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int cute = 0;
		int notCute = 0;
		int count = Integer.parseInt(bf.readLine());
		for(int i=0; i<count; i++) {
			int answer = Integer.parseInt(bf.readLine());
			if(answer == 0) {
				notCute++;
			}
			if(answer == 1) {
				cute++;
			}
		}
		
		if(cute-notCute > 0) {
			System.out.println("Junhee is cute!");
		}else {
			System.out.println("Junhee is not cute!");
		}
		
		
	}	
	
}