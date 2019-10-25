package app;
import java.util.Scanner;

public class Circle {
    public static final double PI = 3.14;
    public static void main(String[] args) throws Exception {
        Scanner circle = new Scanner(System.in);
        System.out.println("请输入圆的半径r:");
        int r = circle.nextInt();
        System.out.printf("圆的周长为: %g %n", 2*r*PI );
        System.out.printf("圆的面积为: %g %n", r*r*PI );
        circle.close();
    }
}