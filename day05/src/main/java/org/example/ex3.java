package org.example;

public class ex3 {
    public static void main(String[] args) {
        System.out.println("Database Connection");
        try{
            int i = 10/0;
        }catch(Exception e){
            System.out.println("Database Error");
            return;
        }finally {
            System.out.println("Database Close");
        }

    }
}
