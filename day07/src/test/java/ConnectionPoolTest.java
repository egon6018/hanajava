import com.hana.frame.ConnectionPool;

import java.sql.SQLException;

public class ConnectionPoolTest {
    public static <Connection> void main(String[] args) {
        ConnectionPool cp = null; // cp가 try문 안에서 선언하면 blocking되는거니까 변수 선언은 try문 밖에서 하기

        try {
            cp = ConnectionPool.create();
            System.out.println(cp.getSize());

            // static영역이기 때문에 2번 생성해도 getSize()는 똑같음
            cp = ConnectionPool.create(); // static함수는 new로 객체 만드는거 아님
            System.out.println(cp.getSize());

//            cp.getConnection(); // 필요하면 가져오면 되고
//            cp.releaseConnection(); // 필요없으면 제거
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        // Connection con =
    }
}