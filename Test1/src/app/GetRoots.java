package app;

import java.util.Scanner;

//从键盘输入一元二次方程的三个系数，计算方程ax^2+bx+c=0的根

public class GetRoots {
    public static void main(String[] args) throws Exception {
        Scanner parameterInput = new Scanner(System.in);
        System.out.println("请输入方程的系数ax^2+bx+c=0的系数a, b, c(参数之间以空格分隔):");
        String parameter = parameterInput.nextLine();
        String[] strParameterArray = parameter.split(" ");
        int a = Integer.parseInt(strParameterArray[0]);
        int b = Integer.parseInt(strParameterArray[1]);
        int c = Integer.parseInt(strParameterArray[2]);
        int delta = (b * b) - (4 * a * c);
        if (delta < 0) {
            System.out.println("Delta小于0, 此方程无解");
        } else {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("方程组的根分别为x1=%.2f, x2=%.2f %n", root1, root2);
        }

        parameterInput.close();
    }
}