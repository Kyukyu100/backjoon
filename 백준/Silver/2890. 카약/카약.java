import java.util.Scanner;

 

public class Main {

      public static void main(String[] args) {
            int count = 0; // 입력받을 라인 수
            int size = 0; // 배열 크기
            String str = ""; // 입력받을 라인 담을 변수
            String oneStr = "";

            String[] arr;

            int[] rank = new int[9];

            int[] answer = new int[9];

            int num = 0, max = 0, order = 1, check = 0;

            Scanner scan = new Scanner(System.in);

            count = scan.nextInt(); // 입력받을 StringLine 개수 입력받기

            size = scan.nextInt(); // 배열 크기 입력 받기

            arr = new String[size]; // 배열 크기 초기화

            scan.nextLine();

            for(int i=0; i<count; i++){

                  str = scan.nextLine(); // 한 라인씩 입력받기

                  arr = str.split("");

                  for(int j=1; j<size-1; j++){

                        oneStr = arr[j];

                        if(!(".".equals(oneStr))){

                              num = Integer.parseInt(oneStr) - 1;

                              rank[num] = j;

                              if(max < j){

                                    max = j;

                              }

                              break;

                        }

                  }

            }

            while(max > 0){

                  check = 0;

                  for(int j=0; j<9; j++){

                        if(rank[j] == max){

                              answer[j] = order;

                              check = 1;

                        }

                  }

                  max--;

                  if(check == 1){

                        order++;

                  }

            }

 

            for(int i=0; i<9; i++){

                  System.out.println(answer[i]);

            }

      }

}