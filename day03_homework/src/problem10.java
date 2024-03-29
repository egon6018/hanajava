//10번 문제 - 괄호의 갯수
//프로그래밍을 할 때 가장 중요한 것 중 하나가 괄호의 개수를 맞추는 것이다.
//즉, 여는 괄호가 있으면 항상 닫는 괄호가 있고, 닫는 괄호가 있으면 여는 괄호도 있어야 한다.
//올바른 괄호를 확인하기 위해 가장 기본적인 방법 중 하나는 여는 괄호와 닫는 괄호의 개수를 세는 것이다.
//소괄호로 이루어진 문자열을 주어지면 괄호의 개수를 출력하는 프로그램을 작성하시오.
//        입력
//괄호로 이루어진 문자열이 입력된다. (길이 100,000 이하)
//출력
//여는 괄호의 개수와 닫힌 괄호의 개수를 출력한다.
//        입력 예시
//        ((())()(()))
//출력 예시
//6 6

import java.util.*;
public class problem10 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String input = in.nextLine();

        int open=0, close=0;
        for(int i=0;i<input.length();i++){
            char cur_val = input.charAt(i);

            if(cur_val == '('){
                open++;
            }
            else if(cur_val == ')'){
                close++;
            }
        }

        System.out.println("여는괄호개수: "+open+", 닫는괄호개수: "+close);
    }
}
