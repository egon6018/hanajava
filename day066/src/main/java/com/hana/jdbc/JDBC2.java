package com.hana.jdbc;

import java.sql.*;

public class JDBC2 { // INSERT
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
        String insertSql = "INSERT INTO db_cust VALUES(?,?,?)"; // ==> insert문
        try{
            pstmt = con.prepareStatement(insertSql); // ==> insert문
            // 아래는 INSERT문처럼 ?가 있을때에만 필요
            pstmt.setString(1,"id03");
            pstmt.setString(2,"pwd03");
            pstmt.setString(3,"한글");


            // 4단계. 전송
            pstmt.executeUpdate(); // 서버에 전송할꺼다 ==> insert문
            System.out.println("Inserted Data...");
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
