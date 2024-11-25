package boardservice9mvc.controller;

import boardservice9mvc.model.Dao;
import boardservice9mvc.model.Dto;

import java.util.ArrayList;

public class Controller {
    //싱글톤
    private static Controller controller = new Controller();
    private Controller(){}
    public static Controller getInstance(){
        return controller;
    }

    //회원가입
    public boolean register(String id, int pwd){
        Dto dto = new Dto(id, pwd);
        return Dao.getInstance().register(dto);
    }

    //로그인
    public ArrayList<Dto> login(){

        ArrayList<Dto> result = Dao.getInstance().login();
        return result;
    }




}
