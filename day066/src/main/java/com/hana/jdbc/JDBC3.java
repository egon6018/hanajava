package com.hana.jdbc;

import java.sql.*;

public class JDBC3 { // SELECT
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
        String selectSql = "SELECT * FROM db_cust WHERE id = ?";
        ResultSet rset = null; // resultset에 select 조회 결과를 받는다

        try{
            pstmt = con.prepareStatement(selectSql);
            pstmt.setString(1,"id02"); // 첫번째 물음표에 아이디 값을 넣겠다

            // 4단계. 전송
            rset = pstmt.executeQuery();

            // 5단계. 결과 출력 -> 여기서는 한 건만 가져옴
            rset.next(); // 반드시 한번 next로 보내야 함. 왜나하면 처음 초기에는 그 값의 앞을 가리키고 있기 때문에
            // 예를 들면 첫번째 id값을 가져오는 건데, 0번째 인덱스를 가리키고 있다는 뜻

            String custId = rset.getString("id");
            String custPwd = rset.getString("pwd");
            String custName = rset.getString("name");
            System.out.printf("%s %s %s \n", custId, custPwd, custName);

            // 여러건을 가져오고 싶을때는 아래처럼
//            while(rset.next()){
//                String custId = rset.getString("id");
//                String custPwd = rset.getString("pwd");
//                String custName = rset.getString("name");
//                System.out.printf("%s %s %s \n", custId, custPwd, custName);
//            }
        } catch (SQLException e) {
            System.out.println("SQL Error");
            e.printStackTrace(); // error원인을 알려줌
        } finally {
            if(rset != null){
                try {
                    rset.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
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
