import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a =  Integer.parseInt(bf.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<a; i++) {
			list.add(Integer.parseInt(bf.readLine()));
		}
		Collections.sort(list, Collections.reverseOrder());
		StringBuilder sb= new StringBuilder();
		for(int i=0; i<list.size(); i++ ) {
			sb.append(list.get(i) + "\n");
		}
		System.out.println(sb);
		
	}	
	
}