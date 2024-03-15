package com.hana.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC4 { // INSERT
    public static void main(String[] args){
        // 1단계. Driver Loading
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("OK...");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver Not Found...");
        }

        // 2단계. Connection (접속)
        String url = "jdbc:mysql://localhost:3306/shopdb";
        String id = "user01";
        String pwd = "111111";

        Connection con = null;
        try {
            con = DriverManager.getConnection(url, id, pwd);
            System.out.println("접속 성공!!!!");
        } catch (SQLException e) {
            System.out.println("접속 실패!!!!");
            e.printStackTrace();
        }

        // 3단계. SQL 구문 생성
        PreparedStatement pstmt = null;

        // 여기에서는 sql문안에 세미쿨론 안붙임!!
        String updateSql = "UPDATE db_cust SET pwd = ?, name = ? WHERE id = ?";
        try{
            pstmt = con.prepareStatement(updateSql);
            // setString()의 첫번째 매개변수는 ?의 순서를 뜻함
            pstmt.setString(1,"pwd03");
            pstmt.setString(2,"이말숙");
            pstmt.setString(3,"id05");


            // 4단계. 전송
            // update도 delete처럼 바꿔야 할 id값이 없어도 update를 진행하기 때문에 result값을 받아서
            // result==1일때는 update하고, result==0일때는 에러나도록 예외처리를 해야 한다.
            int result = pstmt.executeUpdate(); // 서버에 전송할꺼다
            System.out.println("Updated Data..." + result);
        } catch (SQLException e) {
            System.out.println("SQL Error");
            e.printStackTrace(); // error원인을 알려줌
        } finally {
            if(pstmt != null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if(con != null){
                try {
                    con.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
