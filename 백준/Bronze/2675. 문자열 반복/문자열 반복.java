import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(bf.readLine());
		String[] newWord =  new String[count];
		for(int i=0; i<newWord.length; i++) {
			newWord[i] = "";
		}
		for(int i=0; i<count; i++) {
			StringTokenizer str =  new StringTokenizer(bf.readLine(), " ");
			int repeat = Integer.parseInt(str.nextToken());
			String word =  str.nextToken();
			for(int z=0; z<word.length(); z++) {
				for(int y=0; y<repeat; y++) {
					newWord[i] = newWord[i] + word.charAt(z);
				}
			}
		}
		for(String a : newWord) {
			System.out.println(a);
		}
		
		
	}	
}