package com.hana.frame;

import com.hana.exception.DuplicatedIdException;
import com.hana.exception.NotFoundIdException;

import java.util.List;

public interface Repository<K, V> { // K: key, V: value
    V insert(V v) throws DuplicatedIdException, Exception;

    V update(V v) throws DuplicatedIdException, Exception;

    Boolean delete(K k) throws NotFoundIdException, Exception;

    List<V> select() throws Exception;
    V select(K k) throws NotFoundIdException, Exception;
}
