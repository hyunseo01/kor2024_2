package day22;

import java.util.Scanner;

public class BoardService4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Board[] boardList = null; // - 고정 길이 Board 객체 100개를 저장할 수 있는 배열 선언

        int count = 0;

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

                count++;
                Board[] newBoardList = new Board[count];
                //기존 배열내 게시물들을 새로운 배열에 이동하기 배열 복사
                if (count != 1){
                    for (int index = 0; index <= boardList.length-1; index++){
                        newBoardList[index] = boardList[index];// 기존 배열내 게시물들을 새로운 배열에 대입
                    }
                }
                newBoardList[newBoardList.length-1] = board;
                boardList = newBoardList;

                //새로운 배열의 마지막 인덱스의 새로운 객체 등록



            } else if (choose == 2) {
                for (int index = 0; index <= boardList.length-1; index++){
                    //if(boardList[index] != null){
                        System.out.printf("작성자 : %s, 내용 : %s %n", boardList[index].writer, boardList[index].content);
                    //}
                }


            }
        }

    }
}
