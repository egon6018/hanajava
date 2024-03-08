package loop;

import java.util.Scanner;

public class Loop3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        out:while(true){
            System.out.println("Input Command... (q,c,r,u,d)");
            String cmd = sc.next();

            if(cmd.equals("q")){
                System.out.println("Bye");
                sc.close(); // System.in을 했으니까 그걸 종료시켜줘야 함. 아니면 OS에 계속 쌓이게 되는 문제..
                break;
            }

            switch(cmd){
                case "c" : {
                    System.out.println("Create");
                    break;
                }
                case "r" : {
                    System.out.println("Input ID...");
                    String id = sc.next();
                    System.out.println("Read ID Info...");
                    break;

                    //sc.close();
                    //break out; // switch문의 break가 아닌 while문을 가리키는 지정한이름 out을 break한다.
                }
                case "u" : {
                    System.out.println("Update");
                    break;
                }
                case "d" : {
                    System.out.println("Delete");
                    break;
                }
                default: {
                    System.out.println("Try Again");
                }
            }
        }

        System.out.println("End....");
    }
}
