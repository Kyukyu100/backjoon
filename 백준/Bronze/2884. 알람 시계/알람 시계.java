import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		int hour= Integer.parseInt(st.nextToken());
		int min = Integer.parseInt(st.nextToken());
		int newHour;
		int newMin;
		if(hour == 0 && min < 45) {
			newHour = 23;
			newMin = min + 15;
		}else {
			newHour = ((hour * 60) + min - 45) / 60;
			newMin = ((hour * 60) + min - 45)% 60;
		}
		System.out.println(newHour + " " + newMin);
	}
}