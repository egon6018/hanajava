//4번 문제 - 컴퓨터와 함께 369게임하기
//컴퓨터와 현빈이가 369게임을 하게 되었다.
//컴퓨터가 먼저 숫자를 출력하되, 3이나 6이나 9가 들어 있으면, 박수 X 글자로 대신한다.
//현빈이는 직접 Scanner콘솔에 입력한다.
//        1부터 40까지 게임을 해서 누가 승리했는지 또는 무승부인지를 출력해보자.
//중간에 현빈(인간)이 숫자를 잘못 입력하면, 컴퓨터 승! 이라고 출력하고 게임종료 된다.
//출력예)
//컴퓨터 : 1
//나 : 2 입력후 엔터
//컴퓨터 : X
//나 : X 입력후 엔터
//컴퓨터 승!
//게임종료
//출력예)
//컴퓨터 : 1
//나 : 2 입력후 엔터
//컴퓨터 : X
//나 : 4 입력후 엔터
//컴퓨터 : 5
//나 : X
//…
//컴퓨터 : XX
//나 : 40 입력후 엔터
//무승부!
//게임종료

import java.util.*;

public class problem4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        boolean people_turn = false;
        for(int i=1;i<=40;i++){
            // 컴퓨터
            if(!people_turn){
                if(Integer.toString(i).contains("3") || Integer.toString(i).contains("6") || Integer.toString(i).contains("9")){
                    if(Integer.toString(i).contains("33") || Integer.toString(i).contains("36") || Integer.toString(i).contains("39")){
                        System.out.println("XX");
                    }
                    else{
                        System.out.println("X");
                    }
                }
                else{
                    System.out.println(i);
                }
                people_turn = true;
            }
            else{
                String myturn = in.nextLine();
                if(Integer.toString(i).contains("3") || Integer.toString(i).contains("6") || Integer.toString(i).contains("9")){
                    if(Integer.toString(i).contains("33") || Integer.toString(i).contains("36") || Integer.toString(i).contains("39")){
                        if(!myturn.equals("XX")){
                            System.out.println("컴퓨터 승!");
                            System.out.println("게임종료");
                            break;
                        }
                    }
                    else{
                        if(!myturn.equals("X")){
                            System.out.println("컴퓨터 승!");
                            System.out.println("게임종료");
                            break;
                        }
                    }
                }
                else{
                    // 숫자가 나와야 할 차례인데 X또는 XX를 입력했다면
                    if(myturn.equals("X") || myturn.equals("XX")){
                        System.out.println("컴퓨터 승!");
                        System.out.println("게임종료");
                        break;
                    }
                    else if(Integer.parseInt(myturn) != i){
                        // 아니면 다른 숫자를 입력했다면
                        System.out.println("컴퓨터 승!");
                        System.out.println("게임종료");
                        break;
                    }
                }
                people_turn = false;
            }

            if(i == 40){ // 만약 40번 끝까지 왔다면
                System.out.println("무승부!");
                System.out.println("게임종료");
                break;
            }
        }
    }
}
