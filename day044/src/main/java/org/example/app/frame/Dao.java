package org.example.app.frame;

import java.util.List;

public interface Dao<K,V> {
//    int i = 0; // public static final int i=0;
//    public static final int ii = 10;
//
//    // 인터페이스에는 일반함수는 선언 불가! => 그래서 앞에 default를 붙임
//
//    // 1. 추상함수
//    public abstract int method1(); // abstract안붙여도 추상메소드
//
//
//    //public안써도 인터페이스 파일 안에 있기 때문에 갖다 쓸 수 있음
//    // 2. default함수
//    default int method2(){ // 같은 패키지에 있으면 마음대로 default메소드 사용 가능
//        return 0;
//    }
//
//    // 3. static함수
//    static int method3(){ // static선언은 주인이 Dao이기 때문에 오버라이딩 불가! Dao.methode()이런식으로 써야 함
//        return 0;
//    }


    int insert(V v); // == public static int insert와 같다!
    int delete(K k);
    int update(V v);
    V select(K k); // 가져와라
    //Object select(Object obj);
    //List<Object> select();
    List<V> select();
}
