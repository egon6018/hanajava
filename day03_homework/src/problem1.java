import java.util.Scanner;

public class problem1 {
//    1번문제 - 알바천국
//    알바생 홍길동은 월, 수, 금, 일 아르바이트를 간다.
//    다음은 요일의 순서이다.
//    월요일 (1)
//    화요일 (2)
//    수요일 (3)
//    목요일 (4)
//    금요일 (5)
//    토요일 (6)
//    일요일 (7)
//    요일의 번호가 입력으로 주어지면 그 날이 아르바이트 가는 날이면 "oh my god"를 가는 날이 아니면 "enjoy"를 출력하시오.
//    입력
//    Scanner 콘솔 입력으로 요일의 번호가 하나 주어진다.(정수)
//    출력
//    아르바이트 가는 날이면 "oh my god~"를 가는 날이 아니면 "enjoy!"를 출력하시오.
//    입력 예시
//1
//    출력 예시
//    oh my god~
//    입력 예시
//2
//    출력 예시
//    enjoy!

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        // 알바생 홍길동은 월,수,금,일 알바감 -> 1,3,5,7
        int day = in.nextInt();
        if(day == 1 || day == 3 || day == 5 || day == 7){
            System.out.println("oh my god~");
        }
        else{
            System.out.println("enjoy!");
        }
    }
}

//        Scanner in = new Scanner(System.in);	// Scanner 객체 생성
//
//        byte a = in.nextByte(); 		// byte 형 입력 및 리턴
//        short b = in.nextShort(); 		// short 형 입력 및 리턴
//        int c = in.nextInt(); 			// int 형 입력 및 리턴
//        long d = in.nextLong(); 		// long 형 입력 및 리턴
//
//        float e = in.nextFloat(); 		// float 형 입력 및 리턴
//        double f = in.nextDouble(); 	// double 형 입력 및 리턴
//
//        boolean g = in.nextBoolean(); 	// boolean 형 입력 및 리턴
//
//        String h = in.next(); 			// String 형 입력 및 리턴 (공백을 기준으로 한 단어를 읽음)
//        String i = in.nextLine(); 		// String 형 입력 및 리턴 (개행을 기준으로 한 줄을 읽음)
