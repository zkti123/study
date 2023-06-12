package com.green.dao;

import com.green.dao.model.BoardEntity;

import java.sql.Connection;
import java.sql.SQLException;

public class MyConnTest {
    public static void main(String[] args){
      BoardDao boardDao = new BoardDao();

        BoardEntity entity = new BoardEntity();
//        entity.setTitle("asa");
//        entity.setCtnt("dsa");
//        entity.setIuser(16);
//
//        int result = boardDao.insBoard(entity);
//        System.out.println("result : "+ result);


        entity.setTitle("수정");
        entity.setCtnt("완료");
        entity.setIboard(1042);
        entity.setIuser(16);

        int sel = boardDao.upBoard(entity);
        System.out.println("sel : " + sel);



    }
}
