import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(bf.readLine());
		for(int i=0; i<x; i++) {
			for(int y=0; y<=i; y++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}