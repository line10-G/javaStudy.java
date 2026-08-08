/**
 * 测试static
 */
public class TestStatic {
    int id;//id
    String name;//用户名

    static String company = "北京尚学堂";//公司名称
    public TestStatic(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void login(){
        System.out.println(name);
        System.out.println(company);//非静态可以调用静态
    }
    public static void printCompany(){
        //login();//静态调用非静态成员，编译器会报错
        System.out.println(company);
    }
    public static void main(String[] args) {
        TestStatic u = new TestStatic(101,"line10");
        TestStatic.printCompany();
        TestStatic.company = "北京阿里爷爷";
        TestStatic.printCompany();
    }
}
