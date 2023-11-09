import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int [] alphabet = new int[26];
		for(int i=0; i<alphabet.length; i++) {
			alphabet[i] = -1;
		}
		
		StringBuffer word = new StringBuffer(bf.readLine());
		for(int i=0; i<word.length(); i++) {
			if(alphabet[word.charAt(i) - 97] != -1) {
				continue;
			}
			alphabet[word.charAt(i) - 97] = i;
		}
		for(int i : alphabet) {
			System.out.print(i +  " ");
		}
	}
}