import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuffer word = new StringBuffer(bf.readLine());
		String newWord = word.toString();
		String reverse = word.reverse().toString();
		if(newWord.equals(reverse)) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}
}