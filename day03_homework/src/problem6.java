//6번 문제 - 별찍기
//어떤 수 n을 입력받으면 다음과 같은 삼각형을 출력한다.
//여기서 입력되는 n은 반드시 홀수이다.
//        입력
//3부터 99 까지의 홀수 중 하나가 입력된다.
//        출력
//출력예시와 같은 삼각형을 출력한다.
//입력 예시
//5
//출력 예시(정피라미드 형입니다. 폰트때문에 살짝 기울어져 보일 뿐입니다)
//*
//        ***
//        *****
//입력 예시
//7
//출력 예시(정피라미드 형입니다. 폰트때문에 살짝 기울어져 보일 뿐입니다)
//*
//        ***
//        *****
//        ******* (편집됨)

import java.util.*;
public class problem6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int input = in.nextInt();

        // 1->1번
        // 3->1,3->2번
//         *
//        ***

        // 5->1,3,5->3번
//          *
//         ***
//        *****

        // 7->1,3,5,7->4번
//           *
//          ***
//         *****
//        *******

        int bound = (input+1)/2;
        for(int i=1;i<=bound;i++){
            // 띄어쓰기
            for(int j=i;j<=input/2;j++){
                System.out.print(' ');
            }

            // 별
            for(int j=1;j<=2*i-1;j++){
                System.out.print('*');
            }

            System.out.println();
        }
    }
}
