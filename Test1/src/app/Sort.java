package app;

import java.util.Scanner;

public class Sort {
    public static void main(String[] args) throws Exception {
        Scanner numInput = new Scanner(System.in);
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个数字");
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
        System.out.println("从小到大输出为:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
