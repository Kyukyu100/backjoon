import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> numList = new ArrayList<>();
		int num = 0;
		int sum = 0;
		for(int i=0; i<7; i++) {
			num = Integer.parseInt(bf.readLine());
			if(num%2 == 1 ) {
				numList.add(num);
				sum = sum + num;
			}
		}
		if(numList.size() == 0) {
			System.out.println("-1");
		}else {
			Collections.sort(numList);
			System.out.println(sum);
			System.out.println(numList.get(0));
		}
		
	}	
	
}
