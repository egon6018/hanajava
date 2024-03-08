package array;

public class Array6 {
    public static void main(String[] args){
        int a[][] = {{1,2,3},{4,5,6}};
        System.out.println(a.length); // 2행
        System.out.println(a[0].length); // 3열

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.printf("[%d][%d] : %d", i,j,a[i],a[j]);
            }
        }

        for(int ar[] : a){
            for(int num : ar){
                System.out.print(num+" ");
            }
        }
    }
}
