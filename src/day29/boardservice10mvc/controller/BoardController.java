package day29.boardservice10mvc.controller;

import day29.boardservice10mvc.model.BoardDao;
import day29.boardservice10mvc.model.BoardDto;

import java.util.ArrayList;

public class BoardController {

    // 싱글톤
    private static BoardController boardController = new BoardController();
    private BoardController(){}
    public static BoardController getInstance(){
        return boardController;
    }

    // 1. 게시물 등록 제어 함수
    public boolean boardWrite( String content, String writer,int pwd ){
        // 1. 다양한 데이터 검사=유효성검사 , 오늘은 생략
        // 2. 유효성검사 통과 했으면 서로다른 데이터를 하나(객체)로 만들기
        BoardDto boardDto = new BoardDto( content , writer , pwd );
        // 3. 입력받은 객체를 저장하기 위해 Dao 전달하고 결과를 응답 받기
        return BoardDao.getInstance().boardWrite( boardDto );
    }

    // 2. 게시물 출력 제어 함수
    public ArrayList<BoardDto> boardPrint( ){
        // void : 메소드 호출시 반환되는 값이 없다는 뜻 가진 키워드
        // - void 대신 여러개 게시물 반환받고 싶어.
        // void ---> ArrayList<Board>
        // * dao 에게 게시물 전체출력 함수를 호출해서 결과를 받는다.
        // 1. BoardDao의 메소드를 호출하기 위해 객체 생성한다.
        // 2. dao 에게 메소드를 호출하고 응답(모든게시물) 받기
        ArrayList<BoardDto> result = BoardDao.getInstance().boardPrint();
        // 3. dao 에게 응답받은 결과를 view 응답하기
        return result; // - return 현재 메소드가 종료되면서 반환되는 값
    } // e end

}














