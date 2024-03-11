package bankapp;

import bank.Account;

public class BankApp {
    public static void main(String[] args){
        //System.out.println("현재 생성된 계좌는 " + Account.count + "개 입니다.");

        Account acc1 = new Account("", "James", 1000L, 2.3);
        Account acc2 = new Account("", "James", 1000L, 2.3);
        Account acc3 = new Account("", "James", 1000L, 2.3);
        Account acc4 = new Account("", "James", 1000L, 2.3);
        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println(acc3);
        System.out.println(acc4);


//        System.out.println(acc1+"\n");
//        acc1.deposit(-1000L);
//        System.out.println(acc1+"\n");
//        acc1.withdraw(10000000L);
//        System.out.println(acc1+"\n");
//        double interest = acc1.getCalInterest();
//        System.out.println("현재 이자율을 계산해드립니다: " + interest);
//
//        System.out.println("현재 생성된 계좌는 " + Account.count + "개 입니다.");
//        System.out.println(Math.PI); // Math클래스에서 바로 사용하는 것처럼 static 변수도 해당
    }
}
