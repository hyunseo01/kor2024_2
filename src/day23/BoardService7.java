/*
    BoardService7 , 기능별 각 함수(메소드) 로 구현
        - BoardService6 코드를 가지고 이어서 진행
        - 추가 조건 : 등록 기능 과 출력 기능 코드를 main함수 밖으로 빼서 각 함수로 구현
        - 분리 하는 이유 :
            - 메소드는 기능 단위로 분리해서 하나의 함수로 묶으면/관리/사용 해서 추후에 복잡한 프로젝트에서 유지보수/식별/구분/재활용 쉽다.
                * 본인이 작성한 코드도 (한달만 지나도) 이해하기 힘들다.

        - static 이란 ? static 키워드가 존재하는 변수 혹은 메소드(함수)는 우선 할당(프로그램 실행시 메모리 적재) 이 된다.
            - static main 함수 내에서 다른 함수가 호출 되지 않는 이유( 다양한 이유 )
                1. static main 함수 안에서는 호출 할 함수가 static 이어야 한다.
                    - main함수가 먼저 실행 되므로 호출 할 함수의 정보를 모른다.
                2. static main 함수 안에서는 다른 클래스의 메소드를 호출하기 위해서는 객체가 필요하다.
                    - 객체를 생성하면서 static이 아닌 메소드 정보를 읽어드린다.

*/
package day23;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardService7 {

    static Scanner scan = new Scanner(System.in); // 정적(static)변수
    static ArrayList<Board> boardList = new ArrayList<>(); // 정적변수

    static void boardWrite(){ // 메소드 정의 // 정적(static)변수
        scan.nextLine();
        System.out.print("내용 : ");      String content = scan.nextLine();
        System.out.print("작성자 : ");    String writer = scan.next();
        System.out.print("비밀번호 : ");  int pwd = scan.nextInt();
        Board board = new Board( content , writer , pwd );
        boardList.add( board );
    } // m end

    static void boardPrint(){ // 메소드 정의  // 정적(static)변수
        for( int index = 0 ; index <= boardList.size()-1 ; index++ ){
            System.out.printf("작성자 : %s , 내용 : %s \n" ,  boardList.get( index).getContent() , boardList.get(index).getWriter() );
        } // for end
    } // m end

    public static void main(String[] args) {  // 정적(static)변수
        while (true){
            System.out.print("1.글쓰기 2.글출력 : ");
            int choose = scan.nextInt();
            if( choose == 1 ) { boardWrite(); // 등록 함수호출
            }else if( choose == 2 ) { boardPrint(); // 출력 함수호출
            }
        } // w end
    } // m end

} // class end













