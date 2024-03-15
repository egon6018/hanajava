package com.hana.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC5 { // INSERT
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

        String deleteSql = "DELETE FROM db_cust WHERE id = ?";
        try{
            pstmt = con.prepareStatement(deleteSql);
            // setString()의 첫번째 매개변수는 ?의 순서를 뜻함
            pstmt.setString(1,"id03");

            // 4단계. 전송
            // 근데 지금 문제점은 id03을 이전에 삭제해서 이제 테이블에 없는데 다음에 또 삭제해도 에러가 안나고 삭제한다고 뜸
            // => 그래서 result값을 받아와서 result==1이면 삭제할 수 있다. result==0이면 삭제할게 없다는 뜻으로 예외처리 해주기
            int result = pstmt.executeUpdate(); // 서버에 전송할꺼다
            System.out.println("Deleted Data..." + result);
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
