package com.hana.frame;

import com.hana.exception.DuplicatedIdException;
import com.hana.exception.NotFoundIdException;

import java.sql.Connection;
import java.util.List;

public interface Repository<K, V> { // K: key, V: value
    V insert(V v, Connection con) throws DuplicatedIdException, Exception;

    V update(V v, Connection con) throws DuplicatedIdException, Exception;

    Boolean delete(K k, Connection con) throws NotFoundIdException, Exception;

    List<V> select(Connection con) throws Exception;
    V select(K k, Connection con) throws NotFoundIdException, Exception;
}
