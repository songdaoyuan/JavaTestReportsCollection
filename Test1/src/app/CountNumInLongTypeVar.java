package app;

import java.util.Scanner;

//输入一个长整数，统计该数的数字系列中大于等于4的数字个数。

public class CountNumInLongTypeVar {
    public static void main(String[] args) throws Exception {
        Scanner LongNumInput = new Scanner(System.in);
        System.out.println("请输入一个长整数:");
        long num = LongNumInput.nextLong();
        String numString = String.valueOf(num);
        int count = 0;
        for (int i = 0; i < numString.length(); i++) {
            char ch = numString.charAt(i);
            if (Integer.parseInt(ch + "") > 4) {
                count++;
            }
        }
        System.out.println("输入的数的数字系列中大于等于4的数字个数为:" + count);
        LongNumInput.close();
    }
}