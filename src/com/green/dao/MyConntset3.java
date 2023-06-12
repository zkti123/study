package com.green.dao;

import com.green.dao.model.BoardDetailVo;
import com.green.dao.model.BoardSelDto;
import com.green.dao.model.BoardVo;

import java.util.List;

public class MyConntset3 {
    public static void main(String[] args) {
        BoardDao dao = new BoardDao();
        int page = 2;
        int row = 30;
        int startIdx = (page - 1)*row;



        BoardSelDto dto = new BoardSelDto();


        dto.setStartIdx(startIdx);
        dto.setRow(row);

        List<BoardVo> vo = dao.selBoard(dto);

        for (BoardVo to : vo) {
            System.out.println(to);
        }



    }

}

