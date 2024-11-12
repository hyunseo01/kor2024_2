//내용과 작성자로 구성된 게시물을 최대 100개까지 저장하는 서비스 구축
//조건 : main함수 1개와 배열을 최대 2개까지 사용 구현
//구축 : 게시물 쓰기 와 출력 기능 구현

package day21;

import java.util.Scanner;

public class BoardService2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        String[] content = new String[100];
        String[] writer = new String[100];
        while (true){
            System.out.print("1. 게시물 쓰기 2. 게시물 출력 3. 종료 : "); int choose = scan.nextInt();
            if(choose == 1){
                System.out.print("게시글 제목 : "); String cont = scan.next();
                System.out.print("게시글 작성자 : "); String writ = scan.next();
                boolean save = false;
                for (int index = 0; index<= content.length-1; index++){
                    content[index] = cont; writer[index] = writ;
                    save = true; //만약에 저장 성공 했으면 save 변수에 true 값으로 변경
                    break;
                }
                if(save){
                    System.out.println("게시물 쓰기 성공");
                } else {
                    System.out.println("빈공간이 없습니다.");
                }
            } if (choose == 2){
                for (int index = 0; index<=content.length-1;index++){
                    if (content[index]!= null){
                        System.out.printf("작성자 : %s, 내용 : %s\n", writer[index], content[index]);
                    }
                }
            } if(choose == 3){
                break;
            }
        }

    }
}
