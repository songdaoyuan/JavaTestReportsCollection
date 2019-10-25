package app;

import java.util.Scanner;

/*
3. 幻方是一个奇数阶矩阵，每个元素值不同，且它的每一行之和、每一列之和、左对角线之和以及右对角线之和都等于一个相同的数。编写一个程序验证输入的3阶矩阵是否为幻方。
       4	9	2                 49	113	   17
       3	5	7                 29    59     89
       8	1	6                 101   5      71

*/

public class IsMagicSquare {
    public static void main(String[] arg) {
        int a[][] = new int[3][3];
        int x[] = { 0, 0, 0 };
        int y[] = { 0, 0, 0 };
        int q = 0, w = 0;
        Scanner magicSquareScanner = new Scanner(System.in);
        System.out.println("请输入一个三阶矩阵:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                a[i][j] = magicSquareScanner.nextInt();
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                x[i] = x[i] + a[i][j];
            }
        if ((x[0] - x[1]) == 0 && (x[0] - x[2] == 0)) {
            q = x[0];
            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 3; j++) {
                    y[i] = y[i] + a[j][i];
                }
            if ((y[0] - y[1]) == 0 && (y[0] - y[2] == 0)) {
                w = y[0];
                if (w == q) {
                    if ((a[0][0] + a[1][1] + a[2][2]) == (a[0][2] + a[1][1] + a[2][0])
                            && (a[0][0] + a[1][1] + a[2][2]) == q)
                        System.out.println("该矩阵为幻方");
                    else
                        System.out.println("该矩阵不是幻方");
                } else
                    System.out.println("该矩阵不是幻方");
            } else
                System.out.println("该矩阵不是幻方");
        } else
            System.out.println("该矩阵不是幻方");
        magicSquareScanner.close();
    }
}
