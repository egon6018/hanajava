package array;

import java.util.Random;

public class Array4 {
    public static void main(String[] args){
//        Random r = new Random();
//        int num = r.nextInt(10) + 1;
//        System.out.println(num);

        // int형 배열, 사이즈 10개
        // 배열에 1~100까지의 숫자를 Random하게 넣는다. 단, 중복되지 않는 숫자를 입력
        // 합과 평균을 구하시오

        int arr[] = new int[10];
        Random r = new Random();
        for(int i=0;i<arr.length;i++){
            arr[i] = r.nextInt(100)+1;
            for(int j=0; j<i; j++){
                if(arr[i] == arr[j]){
                    i--; // 중복되면 다시 랜덤 돌게
                }
            }
        }

        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        double avg = sum;
        System.out.println("합 : " + sum);
        System.out.println("평균 : " + avg/arr.length);
    }
}
