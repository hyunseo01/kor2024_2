package day23.boardservice8mvc.model;

import day23.Board;

import java.util.ArrayList;

public class BoardDao{

    //싱글톤
    private static final BoardDao boardDao = new BoardDao();
    private BoardDao(){}
    public static BoardDao getInstance(){
        return boardDao;
    }

    ArrayList<BoardDto> boardDB = new ArrayList<>();

    // 1. 게시물 등록 접근 함수
    public boolean boardWrite(BoardDto boardDto){
        boardDB.add(boardDto);
        return true;
    }

    // 2. 게시물 출력 접근 함수
    public ArrayList<BoardDto> boardPrint( ){
        return boardDB;
    }

}
