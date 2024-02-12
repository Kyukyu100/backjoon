import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st =  new StringTokenizer(br.readLine()); 

        int N = Integer.parseInt(st.nextToken()); 
        int k = Integer.parseInt(st.nextToken()); 

        Integer[] score = new Integer[N];

        st =  new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) { 
            score[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        Arrays.sort(score, Collections.reverseOrder()); 
		
        bw.write(score[k-1] +"");
        bw.flush();
        bw.close();

    }
}