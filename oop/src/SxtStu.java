/**
 * 一个学生类
 */
public class SxtStu {
    int id;
    int age;
    String sname;

    public void study(){
        System.out.println("正在学习，勿扰！");
    }

    public void kickball(){
        System.out.println("踢球中，为我加油！");
    }

    public static void main(String[] args) {
        SxtStu s1 = new SxtStu();
        System.out.println(s1.id);
        System.out.println(s1.sname);
        s1.id = 1001;
        s1.sname = "line10";
        System.out.println(s1.id);
        System.out.println(s1.sname);

        s1.study();
        s1.kickball();
    }


}
