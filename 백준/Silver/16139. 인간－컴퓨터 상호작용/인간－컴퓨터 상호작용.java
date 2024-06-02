import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine(); 
		int q = Integer.parseInt(br.readLine()); //질문 수
		int l = s.length();
		
		int[][] memos = new int[l+1][26];
		memos[1][s.charAt(0)-'a']++;
        
		for(int i=2;i<=l;i++) {
			int idx = s.charAt(i-1)-'a';
            
			for(int j=0;j<26;j++) {
                
				int before = memos[i-1][j];
				memos[i][j]=j==idx?before+1:before;
			}
		}
		StringTokenizer st;
        
		for(int i=0;i<q;i++) {
			st = new StringTokenizer(br.readLine());
			int idx = st.nextToken().charAt(0)-'a';
			
			int start = Integer.parseInt(st.nextToken())+1;
			
			int end = Integer.parseInt(st.nextToken())+1;
			
			bw.append((memos[end][idx]-memos[start-1][idx])+"\n");
		}
        
		bw.close();
		br.close();
	}
    
}