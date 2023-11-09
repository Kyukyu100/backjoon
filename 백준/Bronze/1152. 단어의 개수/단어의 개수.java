import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String word = bf.readLine();
		String[] wordCheck =  word.split(" ");
		int count =0;
		for(int i=0; i<wordCheck.length; i++) {
			if(i==0 && wordCheck[i].equals("")) {
				continue;
			}else {
				count++;
			}
			
		}
		System.out.println(count);
		
	}	
}