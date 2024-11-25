package boardservice9mvc.model;

public class Dto {
    private String id;
    private int pwd;

    public Dto(String id, int pwd) {
        this.id = id;
        this.pwd = pwd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPwd() {
        return pwd;
    }

    public void setPwd(int pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "Dto{" +
                "id='" + id + '\'' +
                ", pwd=" + pwd +
                '}';
    }
}
