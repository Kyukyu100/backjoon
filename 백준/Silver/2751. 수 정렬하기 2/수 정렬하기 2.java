import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int count= Integer.parseInt(bf.readLine());
		int[] list =  new int[count];
		for(int i=0; i<count; i++) {
			list[i] = Integer.parseInt(bf.readLine());
		}
		Set<Integer> newList = new HashSet<>();
		
		for(int a : list) {
			newList.add(a);
		}
		ArrayList<Integer> orderList = new ArrayList<>(newList);
		Collections.sort(orderList);
		StringBuilder result = new StringBuilder();
		for(int i : orderList) {
			result.append(i + "\n");
		}
		System.out.println(result);
		
	}	
}