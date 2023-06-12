package com.green.dao;

import com.green.dao.model.BoardDetailVo;
import com.green.dao.model.BoardSelDto;

public class MyConntest2 {
    public static void main(String[] args) {
        BoardDao boardDao = new BoardDao();

        BoardSelDto dto = new BoardSelDto();

        dto.setIboard(1041);

        BoardDetailVo result = boardDao.selBoardDetail(dto);
        System.out.println("result : " + result);
    }
}
