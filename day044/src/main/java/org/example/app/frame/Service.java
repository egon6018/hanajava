package org.example.app.frame;

import java.util.List;

public interface Service<K,V> { // K: key, V: value
    int add(V v); // == public static int insert와 같다!
    int del(K k);
    int modify(V v);
    V get(K k); // 가져와라
    //Object select(Object obj);
    //List<Object> select();
    List<V> get();
}
