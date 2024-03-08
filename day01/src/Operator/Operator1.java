package Operator;

public class Operator1 {
    public static void main(String[] args){
        int i1 = 10;
        int i2 = 3;
        double i3 = i1 / i2;
        double i4 = i1*1.0 / i2; // 이러면 3.3333... 가능
        int result = i1++ + ++ i2;

        System.out.println(i3);
        System.out.println(i4);
        System.out.printf("%d %d %d", result, i1, i2);
        System.out.println();

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        // 3수의 최대 값을 구하세요
        int num4 = 0;
        num4 = num1>num4 ? num1 : num4;
        num4 = num2>num4 ? num2 : num4;
        num4 = num3>num4 ? num3 : num4;
        System.out.println("세 수의 최대값은 : " + num4);
    }
}