package day29.boardservice10mvc.view;

import day29.boardservice10mvc.controller.BoardController;
import day29.boardservice10mvc.model.BoardDto;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardView {
    // ----------- 싱글톤 --------------- //
    //1. 지정한 클래스의 private static 객체를 생성한다.
    private static BoardView boardView = new BoardView();
    //2. 지정한 클래스는 외부로부터 객체 생성을 차단한다.
    private BoardView(){}
    //3. 내부의 객체를 외부로 부터 직접접근이 아닌 간접접근 할수 있도록 getter 함수를 만들어준다.
    public static BoardView getInstance(){
        return boardView;
    }
    // --------------------------------- //
    Scanner scan = new Scanner( System.in); // 입력객체

    public void mainPage(){ // view 시작 함수
        while (true){
            System.out.print("1.게시물등록 2.게시물출력 : ");
            int choose = scan.nextInt();
            if( choose == 1 ){
                boardWrite();
            }
            else if( choose == 2 ){
                boardPrint();
            }
        } // w end
    } // m end

    // view가 해야하는 역할 : 입력과 출력만 한다. ( 관례적인 약속 )
    // 1. 게시물 등록 함수
    void boardWrite( ){
        scan.nextLine(); // 1. 입력
        System.out.print("게시물 내용: "); String content = scan.nextLine();
        System.out.print("게시물 작성자: "); String writer = scan.next();
        System.out.print("게시물 비밀번호: "); int pwd = scan.nextInt();
        // 2. 입력받은 값을 컨트롤러에게 전달
        boolean result = BoardController.getInstance().boardWrite( content , writer , pwd );
        // 3. 컨트롤러에게 전달후 결과를 받아 출력하기.
        if( result ){    System.out.println("게시물 등록 성공"); }
        else{   System.out.println("게시물 등록 실패"); }
    } // m end

    // 2. 게시물 출력 함수
    void boardPrint( ){
        // 1. 컨트롤러에게 모든 게시물정보를 요청한다.
        // 2. 컨트롤러에게 전달받은 결과를 출력한다.
        ArrayList<BoardDto> result  = BoardController.getInstance().boardPrint();
        // 출력
        for( int index = 0 ; index<= result.size()-1 ; index++ ){
            System.out.print("게시내용 : " + result.get( index ).getContent() );
            System.out.println("작성자 : " + result.get( index ).getWriter() );
        } // for end
    } // m end

    /*
        게시물 1개 = BoardDto 객체 1개
        게시물 여러개 = Board[]  배열 또는 컬렉션프레임워크 ArrayList<BoardDto>
    */

} // class end






