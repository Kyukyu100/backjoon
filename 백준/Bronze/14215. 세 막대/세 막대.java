import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

interface Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        Map<Integer, Boolean> angle = new HashMap<Integer, Boolean>();
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();

        if(input[0] + input[1] > input[2]) {
            System.out.println(input[0] + input[1] + input[2]);
        } else {
            System.out.println((input[0] + input[1]) * 2 -1);
        }
    }
}