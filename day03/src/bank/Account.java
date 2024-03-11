package bank;

public class Account {
    private String accNum;
    private String customerName;
    private long balance;
    private double interest; // 이자율


    // 밖에서 객체 생성안하더라도 클래스 이름만으로 접근할 수 있게 public으로 지정
    public static int count = 0; // 계좌가 현재까지 몇개 생성되었는지

    static{ // 최초의 객체가 생성될때 단 한번 생성된다!
        System.out.println("Start static Area...");
        count = 1000000;
        System.out.println("End static Area...");
    }

    public Account() {
    }

    public Account(String accNum, String customerName, long balance, double interest) {
        this.accNum = String.valueOf(count); // String.valueOf(): int형->string형
        this.customerName = customerName;
        if(balance < 0){
            // 마이너스 통장이 아닌 이상 처음에 음수가 들어가면 안됨
            System.out.println("잔액은 0원 이상이어야 합니다.");
            return;
        }
        this.balance = balance;
        this.interest = interest;
        count++;
    }

    public String getAccNum() {
        return accNum;
    }

    public String getCustomerName() {
        return customerName;
    }

    public long getBalance() {
        return balance;
    }

    public double getInterest() {
        return interest;
    }

    public void withdraw(long money) { // 출금
        if(money <= 0){
            System.out.println("1원이상 출금하셔야 합니다.");
            return;
        }
        else if(this.balance < money){
            System.out.println("현재 자산이 출금하려는 금액보다 적어 마이너스가 됩니다. 출금하실 수 없습니다.");
            return;
        }
        this.balance -= money;
    }

    public void deposit(long money) { // 입금
        if(money <= 0){
            System.out.println("입금하려면 적어도 1원이상이어야 합니다.");
            return; // Exception
        }
        this.balance += money;
    }

    public double getCalInterest() { // 이자율 계산
        return (this.balance * this.interest) / 100;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Account{");
        sb.append("accNum='").append(accNum).append('\'');
        sb.append(", customerName='").append(customerName).append('\'');
        sb.append(", balance=").append(balance);
        sb.append(", interest=").append(interest);
        sb.append('}');
        return sb.toString();
    }
}
