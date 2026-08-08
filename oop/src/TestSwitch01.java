/**
 * 测试switch语句的用法
 */
public class TestSwitch01 {
    public static void main(String[] args) {
        int grade = (int)(Math.random()*4)+1;

        switch (grade) {
            case 1:
                System.out.println("大一！不要迷茫，好好学，差距就是大一开始的！");
                break;
            case 2:
                System.out.println("大二！不要玩游戏了，开始加油吧！");
                break;
            case 3:
                System.out.println("大三！真快啊！");
                break;
            case 4:
                System.out.println("大四！时间真快，马上要工作了");
                break;

        }

        if(grade==1){
            System.out.println("大一");
        }else if(grade==2){
            System.out.println("大二");
        }else if(grade==3){
            System.out.println("大三");
        }else if(grade==4){
            System.out.println("大四");
        }
    }
}
