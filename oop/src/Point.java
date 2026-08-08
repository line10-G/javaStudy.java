/**
 * 定义一个“点”（point）类用来表示二维空间中的点（有两个坐标），要求如下：
 * 1.可以生成具有特定坐标的点和对象
 * 2.提供可以计算该“点”距另外一点距离的方法
 */
public class Point {
    double x,y;

    Point(double _x, double _y) {
        x = _x;
        y = _y;
    }

    public double getDistance(Point p) {
        return Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
    }

    public static void main(String[] args) {
        Point p1 = new Point(3.0,4.0);
        Point origin = new Point(0.0,0.0);
        System.out.println(p1.getDistance(origin));

    }

}
