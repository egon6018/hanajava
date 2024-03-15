//미니프로젝트 . 성적관리 프로그램
//문제설명
//1차 객체배열 리스트을 통해 데이타를 관리한다. - 배열을 10개정도 만들어서 사용해도 됨, 아니면 ArrayList를 이용하여 사용함.
//아래 콘솔과 같이 입력 및 출력되도록 한다.
//입력 및 출력 예시
//-----------성적 관리 프로그램-------------
//        1.입력 2.전체출력 3.검색 4.수정 5.삭제 6.종료 : 1
//이름 입력 : 홍길동
//국어점수 입력 : 70
//영어점수 입력 : 80
//수학점수 입력 : 90
//        -----------성적 관리 프로그램-------------
//        1.입력 2.전체출력 3.검색 4.수정 5.삭제 6.종료 : 2
//이름: 홍길동 국어: 70 영어: 80 수학: 90 총점: 240 평균: 80.0
//        -----------성적 관리 프로그램-------------
//        1.입력 2.전체출력 3.검색 4.수정 5.삭제 6.종료 : 1
//이름 입력 : 변사또
//국어점수 입력 : 30
//영어점수 입력 : 49
//수학점수 입력 : 59
//        -----------성적 관리 프로그램-------------
//        1.입력 2.전체출력 3.검색 4.수정 5.삭제 6.종료 : 2
//이름: 홍길동 국어: 70 영어: 80 수학: 90 총점: 240 평균: 80.0
//이름: 변사또 국어: 30 영어: 49 수학: 59 총점: 138 평균: 46.0
//        -----------성적 관리 프로그램-------------
//        1.입력 2.전체출력 3.검색 4.수정 5.삭제 6.종료 : 3
//검색할 사람의 이름 : 홍길동
//이름: 홍길동 국어: 70 영어: 80 수학: 90 총점: 240 평균: 80.0
//        -----------성적 관리 프로그램-------------
//        1.입력 2.전체출력 3.검색 4.수정 5.삭제 6.종료 : 4
//수정할 사람의 이름 : 홍길동
//수정할 내용은? 1.국어 2.영어 3.수학 : 1
//국어점수 수정 : 50
//        -----------성적 관리 프로그램-------------
//        1.입력 2.전체출력 3.검색 4.수정 5.삭제 6.종료 : 2
//이름: 홍길동 국어: 50 영어: 80 수학: 90 총점: 220 평균: 73.33333333333333
//이름: 변사또 국어: 30 영어: 49 수학: 59 총점: 138 평균: 46.0
//        -----------성적 관리 프로그램-------------
//        1.입력 2.전체출력 3.검색 4.수정 5.삭제 6.종료 : 5
//삭제할 사람의 이름 : 변사또
//-----------성적 관리 프로그램-------------
//        1.입력 2.전체출력 3.검색 4.수정 5.삭제 6.종료 : 2
//이름: 홍길동 국어: 50 영어: 80 수학: 90 총점: 220 평균: 73.33333333333333
//        -----------성적 관리 프로그램-------------
//        1.입력 2.전체출력 3.검색 4.수정 5.삭제 6.종료 : 6
//종료!!
//종료 코드 0(으)로 완료된 프로세스

import java.util.ArrayList;
import java.util.Scanner;

class Grade {
    private String name;
    private int kor;
    private int mat;
    private int eng;

    public Grade() {
    }

    public Grade(String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getSum(){
        return this.kor+this.mat+this.eng;
    }

    public double getAvg(){
        return (double) getSum()/3;
    }

    public void print(){
        // 이름: 홍길동 국어: "50 영어: 80 수학: 90 총점: 220 평균: 73.33333333333333
        System.out.println("이름: "+getName()+" 국어: "+getKor()+" 영어: "+getEng()+" 수학: "+getMat()+
                            " 총점: "+getSum()+" 평균: "+getAvg());
    }

    @Override
    public String toString() {
        return "Grade{" +
                "name='" + name + '\'' +
                ", kor=" + kor +
                ", mat=" + mat +
                ", eng=" + eng +
                '}';
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Grade> people = new ArrayList<>(10);

        boolean finish = false;
        while(!finish){
            System.out.println("     ----------성적 관리 프로그램----------     ");
            System.out.printf("     1.입력 2.전체출력 3.검색 4.수정 5.삭제 6.종료 : ");
            int num = in.nextInt(); // 작업을 수행할 번호 입력

            switch(num){
                case 1: { // 입력
                    System.out.printf("이름 입력 : ");
                    String name = in.next(); // next(): 공백 기준, nextLine(): 개행문자 기준

                    System.out.printf("국어점수 입력 : ");
                    int kor = in.nextInt();

                    System.out.printf("영어점수 입력 : ");
                    int eng = in.nextInt();

                    System.out.printf("수학점수 입력 : ");
                    int mat = in.nextInt();

                    people.add(new Grade(name, kor,mat,eng));
                    break;
                }
                case 2:{ // 전체출력
                    if(people.size() == 0){
                        System.out.println("조회할 수 없습니다. 데이터를 입력해주세요!");
                    }
                    else{
                        for(Grade person : people){
                            person.print();
                        }
                    }
                    break;
                }
                case 3:{ // 검색
                    System.out.printf("검색할 사람의 이름 : ");
                    String searchPerson = in.next();

                    if(people.size() == 0){
                        System.out.println("조회할 수 없습니다. 데이터를 입력해주세요!");
                    }
                    else{
                        for(Grade person : people){
                            if(searchPerson.equals(person.getName())){ // 내가 검색할 사람을 찾았다면
                                person.print();
                                break;
                            }
                        }
                    }
                    break;
                }
                case 4:{ // 수정
                    System.out.printf("수정할 사람의 이름 : ");
                    String updatePerson = in.next();

                    System.out.println("수정할 내용은? 1.국어 2.영어 3.수학 : ");
                    int pick = in.nextInt();

                    for(Grade person : people){
                        if(updatePerson.equals(person.getName())){ // 수정할 사람의 이름을 찾았다면
                            if(pick == 1){
                                System.out.printf("국어점수 수정 : ");
                                int updateKor = in.nextInt();
                                person.setKor(updateKor);
                            } else if(pick == 2){
                                System.out.printf("영어점수 수정 : ");
                                int updateEng = in.nextInt();
                                person.setEng(updateEng);
                            } else if(pick == 3){
                                System.out.printf("수학점수 수정 : ");
                                int updateMat = in.nextInt();
                                person.setMat(updateMat);
                            }
                            break;
                        }
                    }
                    break;
                }
                case 5:{ // 삭제
                    System.out.printf("삭제할 사람의 이름 : ");
                    String removePerson = in.next();

                    for(Grade person : people){
                        if(removePerson.equals(person.getName())){
                            people.remove(person);
                            break;
                        }
                    }
                    break;
                }
                case 6:{ // 종료
                    System.out.println("종료!!");
                    finish = true;
                    break;
                }
            }
        }
        in.close();
    }
}