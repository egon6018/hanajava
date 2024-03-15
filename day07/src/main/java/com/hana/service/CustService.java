package com.hana.service;

import com.hana.data.CustDto;
import com.hana.exception.DuplicatedIdException;
import com.hana.exception.NotFoundIdException;
import com.hana.frame.ConnectionPool;
import com.hana.frame.Service;
import com.hana.repository.CustRepository;
import lombok.RequiredArgsConstructor;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

//@RequiredArgsConstructor // lombok이 객체를 만들어줌
public class CustService implements Service<String, CustDto> {

     //final CustRepository repository; // 반드시 final로 선언을 해줘야 lombok이 객체를 만들어줌
    CustRepository repository; // final을 안해주는건 아래 constructor을 따로 생성해서 그런가?
    ConnectionPool cp;

    public CustService(){
        repository = new CustRepository();
        try {
            cp = ConnectionPool.create();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public CustDto add(CustDto custDto) throws DuplicatedIdException, Exception {
        Connection con = cp.getConnection();

        // 트랜잭션(commit, rollback)은 서비스에서 실행!
        try {
            con.setAutoCommit(false);
            repository.insert(custDto, con);
            con.commit();
        } catch(DuplicatedIdException e){
            con.rollback();
            throw e;
        } catch(Exception e){
            con.rollback();
            throw e;
        } finally{
            cp.releaseConnection(con);
        }
        return null;
    }

    @Override
    public CustDto modify(CustDto custDto) throws DuplicatedIdException, Exception {
        return null;
    }

    @Override
    public Boolean remove(String s) throws NotFoundIdException, Exception {
        return null;
    }

    @Override
    public List<CustDto> get() throws Exception {
        return null;
    }

    @Override
    public CustDto get(String s) throws NotFoundIdException, Exception {
        return null;
    }
}
