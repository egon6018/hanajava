package array;

public class Array5 {
    public static void main(String[] args){
        // 2차원배열 선언
//        int a[][];
//        int []b[];
//        int [][]c;

        int a[][] = new int[10][10]; // 10X10 정방형 배열
        int b[][] = new int[10][];
        b[1] = new int[3];
        b[0] = new int[5];

        System.out.println(b.length);
        System.out.println(b[1].length);

        int c[][][] = new int[3][][];

        int a1[][] = new int[][]{{1,2},{3,4}};
        int a2[][] = new int[2][];
        a2[0] = new int[]{1,2};
        a2[1] = new int[]{2,3};
    }
}
