package day23.boardservice8mvc.model;

import java.util.ArrayList;

public class BoardDao {

    ArrayList<BoardDto> boardDB = new ArrayList<>();

    // 1. 게시물 등록 접근 함수
    public boolean boardWrite( BoardDto boardDto){
        boardDB.add( boardDto );
        return true;
    }

    // 2. 게시물 출력 접근 함수
    public void boardPrint( ){

    }

}
