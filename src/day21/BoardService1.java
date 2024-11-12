//BoardService1
//- 내용 과 작성자 로 구성된 게시물 3개 까지 저장하는 서비스 구축
//- 조건 : main 1개와 변수 6개와 반복문 사용
//- 구축 : 게시물 쓰기와 게시물 출력 기능 구현

package day21;

import java.util.Scanner;

public class BoardService1 {
    public static void main(String[] args) {
        //-저장소 설계 게시물 1개당 내용과 작성자(내용 2개), 게시물 3개면 내용 6개
        String content1 = ""; String writer1 = ""; //첫번쨰 게시물 내용
        String content2 = ""; String writer2 = ""; //두번쨰 게시물 내용
        String content3 = ""; String writer3 = ""; //세번쨰 게시물 내용

        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.print("1. 게시물 쓰기 2. 게시물 출력 선택 : ");
            int choose = scan.nextInt();
            if(choose == 1){
                System.out.print("새로운 게시물 내용 : "); String content = scan.next();
                System.out.print("새로운 게시물 작성자 : "); String writer = scan.next();
                //게시물을 작성 할 공간이 있는지 체크, 임의로 게시물이 존재하지 않는 뜻
                if(content1 == ""){
                    content1 = content; writer1 = writer;
                } else if (content2 == "") {
                    content2 = content; writer2 = writer;
                } else if (content3 == "") {
                    content3 = content; writer3 = writer;
                } else {
                    System.out.println("빈공간이 없습니다.");
                }
            } else if (choose == 2) {
                if (content1 != ""){//만약에 첫번째 게시물이 존재하면
                    System.out.printf("작성자 : %s, 내용 : %s\n", writer1, content1);
                } if (content2 != "") {
                    System.out.printf("작성자 : %s, 내용 : %s\n", writer2, content2);
                } if (content3 != "") {
                    System.out.printf("작성자 : %s, 내용 : %s\n", writer3, content3);
                }else {
                    System.out.println("게시물이 없습니다");
                }
            }

        }


    }
}
