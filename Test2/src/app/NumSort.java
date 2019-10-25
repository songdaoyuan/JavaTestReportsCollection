package app;

import java.util.Scanner;

//编写一个程序从键盘输入10个数，将最大、最小的整数找出来并输出

public class NumSort {
    public static void main(String[] args) throws Exception {
        Scanner numInput = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++){
            System.out.println("请输入第"+(i+1)+"个数字");
            array[i] = numInput.nextInt();
        }
        numInput.close();
        // 冒泡排序
        for (int a = 0; a < array.length - 1; a++) {
            for (int b = 0; b < array.length - 1 - a; b++) {
                if (array[b] > array[b + 1]) {
                    int tmp = array[b];
                    array[b] = array[b + 1];
                    array[b + 1] = tmp;
                }
            }
        }
        System.out.println("最大的整数为："+ array[array.length-1] + "最小的整数为：" + array[0]);
    }
}