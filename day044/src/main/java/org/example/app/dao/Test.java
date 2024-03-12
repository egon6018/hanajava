//package org.example.app.dao;
//
//import org.example.app.frame.Dao;
//
//public class Test implements Dao {
//
//    @Override
//    public int method1() {
//        int i = method2();
//        // 상위클래스의 default함수는 자유롭게 쓸 수 있음
//        // 인터페이스는 super.method2()이거 안됨!
//        return 0;
//    }
//    public int method2(){
//        // default는 재정의 가능!(오버라이딩) -> 이제 위에 method1()에 i값에는 100이 들어감
//        int i = Dao.method3(); // static함수는 오버라이딩 불가! 그대로 써야됨!!
//        return 100;
//    }
//}
