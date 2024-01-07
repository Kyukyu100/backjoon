import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
    
		String f = "factor\n";
		String m = "multiple\n";
		String n = "neither\n";
        
		Scanner in = new Scanner(System.in);
        
		StringBuilder sb = new StringBuilder();
        
 
		while(true) {
			
			int first = in.nextInt();
			int second = in.nextInt();
			
			if(first == 0 && second == 0) break;
			
			if(second % first == 0) {
				sb.append(f);
			}
			else if(first % second == 0) {
				sb.append(m);
			}
			else {
				sb.append(n);
			}
		}
		System.out.println(sb);
	}
 
}