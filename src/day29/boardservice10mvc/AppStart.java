package day29.boardservice10mvc;

import day29.boardservice10mvc.view.BoardView;

public class AppStart {
    public static void main(String[] args) {
        // 메인 뷰 요청
        // - 다른 클래스의 존재하는 함수를 호출하는 방법
        // -- 1.객체를 생성한 후 객체명.메소드명()
        // -- 단 패키지가 다르면 public 함수로 선언한다.

        /* 싱글톤을 사용하기 전 */
            // BoardView view = new BoardView();
            // view.mainPage();

        /* 싱글톤을 사용했을때 */
        BoardView.getInstance().mainPage();
            // BoardView.getInstance() ==> boardView
            // boardView.mainPage();

    } // m end
} // c end
