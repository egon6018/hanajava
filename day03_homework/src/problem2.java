import java.util.Random;

public class problem2 {
//    2번 문제 - 로또 번호 발생기
//    홍길동은 매주 로또를 한장씩 산다.
//    이번 주는 프로그램으로 로또 당첨 번호를 발생시켜, 수동으로 로또 번호를 기입하려고 한다.
//    프로그램으로 로또번호 6개를 발생시키고, 출력해보자.
//    단 로또 번호는 1~45까지의 정수이고, 6개이다.
//    중복된 번호가 발생하면, 재추첨해서 중복 수를 피해야 한다.
//            Math.random() 함수나 Random 클래스의 nextInt() 함수를 사용하여 랜덤한 수를 발생시킨다.
//    입력 예)
//    없음
//    출력 예)
//            12 17 23 43 9 33
//    출력 예)
//            15 15(중복발생! 재추첨) 37 29 42 22 8

    public static void main(String[] args){
        Random r = new Random();

        int lotto[] = new int[6];
        for(int i=0;i<6;i++){
            lotto[i] = r.nextInt(45)+1;

            for(int j=0;j<i;j++){
                if(lotto[j] == lotto[i]){
                    i--; // 중복되면 다시
                }
            }
        }

        for(int i=0;i<6;i++){
            System.out.print(lotto[i]+" ");
        }
    }
}
