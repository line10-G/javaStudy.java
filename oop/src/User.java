/**
 * 测试构造方法的重载
 */
public class User {
    int id;
    String name;
    String pwd;


    public User() {
    }
    public User(int id) {
        this.id = id;
    }
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public User(int id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    public static void main(String[] args) {
        User u = new User();
        User u1 = new User(1001,"line10");
        User u2 = new User(1002,"line10","123456");
    }

}
