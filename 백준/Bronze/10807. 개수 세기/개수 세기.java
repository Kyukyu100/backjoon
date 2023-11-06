import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
       
        int a = Integer.parseInt(bf.readLine());
        int[] arr = new int[a]; 
        StringTokenizer str = new StringTokenizer(bf.readLine()," "); 
        for(int i=0; i<a; i++) {
        	arr[i] = Integer.parseInt(str.nextToken());
        }
        int c = Integer.parseInt(bf.readLine());
        
        int result = 0;
        for(int i=0; i<arr.length; i++) {
        	if(c == arr[i]) {
        		result = result + 1;
        	}
        }
        System.out.println(result);
    }
}