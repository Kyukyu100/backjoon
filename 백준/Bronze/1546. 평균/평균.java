import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		ArrayList<Double> total = new ArrayList<>(num);
		StringTokenizer str = new StringTokenizer(bf.readLine()," ");
		
		while(str.hasMoreTokens()) {
			total.add(Double.parseDouble(str.nextToken()));
		}
		Collections.sort(total,Collections.reverseOrder());
		double max = total.get(0);
		for(int i=0; i<total.size(); i++) {
			total.set(i, (total.get(i)/max) * 100);
		}
		double result=0;
		for(double i : total) {
			result = result + i;
		}
		System.out.println((result/num));
	}
}