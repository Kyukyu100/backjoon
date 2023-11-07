import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Integer[] num = new Integer[10];
		for(int i=0; i<10; i++) {
			int a = Integer.parseInt(bf.readLine());
			num[i] = a%42;
		}
		Set<Integer> set = new HashSet<Integer>(Arrays.asList(num));
		System.out.println(set.size());
		
		
	}
}