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
		int cookTime = Integer.parseInt(bf.readLine());
		int newHour;
		int newMin;
		if(min + cookTime >= 60) {
			newHour =  hour + (min + cookTime)/60;
			if(newHour > 23) {
				newHour = (hour + (min + cookTime)/60) % 24;
				newMin = (min+cookTime)%60;
			}
			newMin = (min+cookTime)%60;
			
		}else {
			newHour = hour;
			newMin = min + cookTime;
		}
		System.out.println(newHour + " " + newMin);
	}
}