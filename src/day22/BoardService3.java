package day22;

import java.util.Scanner;

public class BoardService3 { //실행 클래스
    public static void main(String[] args) {
        //입력 객체
        Scanner scan = new Scanner(System.in);

        Board[] boardlist = new Board[100]; // - 고정 길이 Board 객체 100개를 저장할 수 있는 배열 선언

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

                for (int index = 0; index <= boardlist.length-1; index++){
                    if(boardlist[index] == null){ //index번째 게시물이 비어있으면 게시물 객체 생성
                        Board board = new Board();
                        board.content = content; board.writer = writer; board.pwd = pwd;
                        boardlist[index] = board;
                        break;
                    }
                }


            } else if (choose == 2) {
                for (int index = 0; index <= boardlist.length-1; index++){
                    if(boardlist[index] != null){
                        System.out.printf("작성자 : %s, 내용 : %s %n", boardlist[index].writer, boardlist[index].content);
                    }
                }


            }
        }



    }
}
