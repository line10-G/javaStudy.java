/**
 * 测试静态初始化块
 */
public class TestStatic2 {
    static String company;
    static{
        System.out.println("执行类的初始化工作");
        company = "百战程序员";
        printCompany();
    }
    public static void printCompany(){
        System.out.println(company);
    }

    public static void main(String[] args) {

    }
}
