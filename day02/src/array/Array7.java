package array;

import java.util.Random;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Array7 {
    public static void main(String[] args){
        // 5행 5열의 배열에
        // Random 하게 중복되지 않은 1~100까지의 수를 발생 시킨다.
        // 각 열에 최대값의 합과 최소값의 합을 출력 하시오

        int arr[][] = new int[5][5];
        Random r = new Random();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = r.nextInt(100)+1;

                for(int k=0;k<j;k++){
                    if(arr[i][k] == arr[i][j]){
                        j--; // 중복되면 다시 랜덤숫자 할당
                    }
                }
            }
        }

        int max_sum = 0, min_sum = 0;
        for(int col=0; col<arr[0].length; col++){ // 각 열마다
            int max_val = 0;
            for(int i=0;i<arr.length;i++){
                max_val = max(max_val, arr[i][col]);
            }
            //System.out.println(col+"열의 최댓값은 "+max_val);
            max_sum += max_val;

            int min_val = 101;
            for(int i=0;i<arr.length;i++){
                min_val = min(min_val, arr[i][col]);
            }
            //System.out.println(col+"열의 최솟값은 "+min_val);
            min_sum += min_val;
        }

        System.out.println("각 열의 최대값의 합: " + max_sum);
        System.out.println("각 열의 최소값의 합: " + min_sum);
    }
}
