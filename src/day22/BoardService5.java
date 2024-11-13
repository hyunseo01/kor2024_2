package day22;

import java.util.ArrayList;
import java.util.Scanner;

/*ArrayList 클래스
        대표함수
        .add(새로운 객체)
        .get(인덱스) : 리스트내 지정한 인덱스에
        .size() : 리스트내 저장한 총 객체 수 반환 함수
        .remove(인덱스) : 리스트내 지정한 인덱스에 객체 삭제 하는 함수

 */

public class BoardService5 {
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
