/**
 * 测试if单分支结构
 * 写个掷骰子游戏
 *      1.如果三次的值加起来大于15，则手气不错
 *      2.如果三次的值加起来在：10-15.一般
 *      3.如果三次的值加起来在：10以下，不怎么样
 */
public class TestIf01 {

    public static void main(String[] args) {
        int i = (int)(Math.random()*6)+1;
        int j = (int)(Math.random()*6)+1;
        int k = (int)(Math.random()*6)+1;

        int count = i + j + k;

        if(count>15){
            System.out.println("今天手气不错！再来一把！");
        } else if (count>=10) {
            System.out.println("手气一般！再来两把！");
        }else{
            System.out.println("手气不行！回家吧！");
        }

        System.out.println("今天得分："+count);


    }

}
