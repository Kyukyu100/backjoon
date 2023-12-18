import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws  Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count  = 0;

        for(int  i = 0; i  < N; i++){
            if(checkStr(br.readLine())){
                count++;
            }
        }
        br.close();
        System.out.println(count);
    }

    static boolean checkStr(String str){
        boolean[] checkAlpha = new boolean[26]; 
        int prev = -1; 

        for(int i = 0; i < str.length(); i++){
            int now = str.charAt(i); 

            if(prev != now){ 
                if(checkAlpha[now-97] == false){ 
                    checkAlpha[now-97] = true;
                    prev = now; 

                }else{
                    return false; 
                }
            }else{ 
                continue;
            }
        }
        return true; 
    }
}