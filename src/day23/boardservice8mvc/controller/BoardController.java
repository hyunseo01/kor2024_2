package day23.boardservice8mvc.controller;

import day23.Board;
import day23.boardservice8mvc.model.BoardDao;
import day23.boardservice8mvc.model.BoardDto;

import java.util.ArrayList;

public class BoardController {

    //싱글톤
    private static final BoardController boardController = new BoardController();
    private BoardController(){}
    public static BoardController getInstance(){
        return boardController;
    }

    // 1. 게시물 등록 제어 함수
    public boolean boardWrite(String content, String writer,int pwd){
        // 1. 다양한 데이터 검사=유효성검사 , 오늘은 생략
        // 2. 유효성검사 통과 했으면 서로다른 데이터를 하나(객체)로 만들기
        BoardDto boardDto = new BoardDto(content , writer , pwd);
        // 3. 입력받은 객체를 저장하기 위해 Dao 전달하고 결과를 응답 받기
        //BoardDao boardDao = new BoardDao();
        return BoardDao.getInstance().boardWrite(boardDto);
    }

    // 2. 게시물 출력 제어 함수
    public ArrayList<BoardDto> boardPrint(){
        //void : 메소드 호출 시 반환되는 값이 없다는 뜻을 가진 키워드
        //void 대신 여러개 게시물 반환받고 싶어
        //void -> ArrayList
        //dao에게 게시물 전체출력 함수를 호출해서 결과를 받는다.
        //1. dao에게 게시물 전체출력 함수를 호출한다
        //BoardDao boardDao = new BoardDao();
        //2. 메소드 호출
        ArrayList<BoardDto> result = BoardDao.getInstance().boardPrint();
        //3. dao에게 응답받는 결과를 view 응답하기.
        return result;// - return 메소드가 종료되면서 반환되는 값
    }
}
