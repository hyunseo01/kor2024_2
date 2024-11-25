package day29.boardservice10mvc.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/*
    boardservice8mvc 패키지를 복사하여 boardservice10mvc 으로 변경해서 진행
    1. JAVA 와 DB 연동 하는 JDBC 라이브러리 준비
        1. JDBC 라이브러리 설치 : https://dev.mysql.com/downloads/connector/j/
        2. Select Operating System: Platform Independent[선택]
            1. Platform Independent (Architecture Independent), ZIP Archive	9.1.0	5.1M	[Download]클릭
            2. No thanks, just start my download.클릭
            3. 다운로드 후 압축풀기 , [강의 카톡방에도 있음]
            4. 폴더내 mysql-connector-j-9.1.0.jar 파일 확인

    2. 현재 프로젝트내 JDBC 라이브러리 등록/추가
        1. 준비된 mysql-connector-j-9.1.0.jar 파일을 현재 프로젝트내 폴더로 이동/복사
        2. 이동/복사된 mysql-connector-j-9.1.0.jar 파일을 오른쪽 클릭 -> 가장 하단 [라이브러리 추가] 클릭
        3. [OK]
    3. 현재 프로젝트내 외부 라이브러리 목록 확인
        - [file] -> [project structure] -> 왼쪽 탭 [library]클릭
        - 주의할점 : PC가 변경되면 경로가 변경되므로 다시 등록해야될 경우가 있다.
    =================================================================================
    [1] JDBC 라이브러리 이용한 D[Data]A[Access]O[Object]에 DB 내 데이터에 접근 하는 객체 만들기
        1. dao 생성자에서 연동 코드 작성

*/

public class BoardDao {
    private Connection connection; // DB 연동 인터페이스 // DB 연동 결과를 가지고 있어서 DB조작이 가능한 인터페이스
    // 싱글톤
    private static BoardDao boardDao = new BoardDao();

    private BoardDao(){
        // DB 연동 시 필요한 코드 2줄
        try {
            // [1] 외부라이브(JDBC) 폴더내 com폴더->mysql폴더->cj폴더->jdbc폴더-> Driver 클래스 호출 , * 일반 예외
            // forName() 특정한 클래스를 호출 하는데 사용되는 함수 , 만일 클래스가 존재하지 않으면 어떻게 해야 하는지 일반 예외에서 발생
            Class.forName("com.mysql.cj.jdbc.Driver");
            // [2] DB연동 인터페이스 만들기 , DriverManager.getConnection("MYSQLSERVER_URL/DB명" , "계정명" , "비밀번호");
            // DriverManager.getConnection() : DB SERVER 와 연동을 성공 했을때 연동된 결과의 객체를 반환 * 일반 예외
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb1122" , "root" , "1234");
            // [3] 확인
            System.out.println("[3] DB 연동 성공 ");
            // 연동에 실패하는 이유 : 1. 프로젝트에 jdbc 라이브러리 등록 안했다. 2. DB연동url 경로
        }
        catch ( ClassNotFoundException e ){  e.getMessage(); }
        catch ( SQLException e){ e.getMessage(); }

    }

    public static BoardDao getInstance(){ return boardDao; }

    // 여러개 게시물 저장하는 리스트
    ArrayList<BoardDto> boardDB = new ArrayList<>();

    // 1. 게시물 등록 접근 함수
    public boolean boardWrite( BoardDto boardDto){
        //boardDB.add( boardDto );
        try {
            // [1] connection.prepareStatement( DML(SQL) 작성 ) : 연동된 DB에 SQL를 서명할 준비하는 함수. * 일반 예외
            PreparedStatement ps = connection.prepareStatement("insert into board(bcontent,bwriter,bpwd)values( '여기는JAVA' , '유재석' , '1234' )");
            // [2] 서명된 SQL 실행
            ps.execute();
        } catch (SQLException e) {
           e.getMessage();
        }
        return true;
    }

    // 2. 게시물 출력 접근 함수
    public ArrayList<BoardDto> boardPrint( ){
        return boardDB;
    }

}
