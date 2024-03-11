package cal1;

public class Cal {
    private int num1;
    private int num2;

    private Cal(){

    }

    public Cal(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double sum(){
        return num1 + num2;
    }

    public  double div(){
        return num1 / num2;
    }
}
