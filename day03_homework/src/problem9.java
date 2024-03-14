//9번 문제 - 숫자 스무고개
//컴퓨터가 1에서 100까지의 숫자중 하나를 랜덤으로 선택하고 사용자가 숫자를 입력하면 컴퓨터가 만든 값보다 큰지 작은 지를 알려줍니다.
//사용자가 정답을 찾을 때까지 반복합니다.
//숫자 맞추기 게임 실행 결과입니다.
////        입력 예, 출력 예)

import java.util.*;
public class problem9 {
    public static void main(String[] args){
        Random random = new Random();
        Scanner in = new Scanner(System.in);

        System.out.println("제가 생각한 숫자를 맞춰보세요~");
        int computer = random.nextInt(100)+1;
        int user = in.nextInt();

        while(true){
            if(computer > user){
                System.out.println("컴퓨터가 만든 값보다 작습니다. 다시 맞춰보세요!");
                user = in.nextInt();
            }
            else if(computer < user){
                System.out.println("컴퓨터가 만든 값보다 큽니다. 다시 맞춰보세요!");
                user = in.nextInt();
            }
            else{
                System.out.println("맞추셨습니다. 축하합니다!");
                break;
            }
        }
    }
}
