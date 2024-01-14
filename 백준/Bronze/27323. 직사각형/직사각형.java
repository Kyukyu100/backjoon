import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        int width = Integer.parseInt(br.readLine());
        int height = Integer.parseInt(br.readLine());
        int result = width * height;
		
        bw.write(result + "");
        bw.close();
    }
}