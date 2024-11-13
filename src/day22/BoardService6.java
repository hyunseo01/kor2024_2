package day22;
/*
추가조건 : NewBoard 클래스 객체들을 캡슐화(점근제어자) 하시오.
1. NewBoard 는 앞선 Board 와 동일하게 내용[String 타입]과 작성자와 비밀번호로 구성된 게시물 클래스
2. NewBoard 의 모든 필드는 private 으로 선언한다
3. 외부에서 객체 생성시 생성자를 사용한다
4. 게터 세터 toString 함수들을 이용하여 모든 필드의 데이터를 간접 접근한다.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class BoardService6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //컬렉션 프레임워크중 arraylist 클래스를 이용한 배열 대체한다.
        //배열(고정길이)
        ArrayList<Board> boardList = new ArrayList<>();
        //ArrayList<제네릭 타입> : 리스트 객체를 저장할 여러개 객체들의 타입

        while (true){
            System.out.print("1. 글쓰기 2. 글출력 : "); int choose = scan.nextInt();
            if (choose == 1){
                // .next() 공백 x, .nextLine() 공백 o
                scan.nextLine();
                System.out.print("내용 : "); String content = scan.nextLine();
                //nextLine() 사용 시 주의할 점 : nextLine() 앞에 다른 next...()이 존재하면
                //의미 없는 nextLine() 작성해준다.
                System.out.print("작성자 : "); String writer = scan.next();
                System.out.print("비밀번호 : "); int pwd = scan.nextInt();

                Board board = new Board();
                board.content = content; board.writer = writer; board.pwd = pwd;

                boardList.add(board);

                //새로운 배열의 마지막 인덱스의 새로운 객체 등록



            } else if (choose == 2) {
                for (int index = 0; index <= boardList.size()-1; index++){
                    //if(boardList.get(index) != null){
                    System.out.printf("작성자 : %s, 내용 : %s %n", boardList.get(index).writer, boardList.get(index).content);
                    //}
                }


            }
        }
    }
}
