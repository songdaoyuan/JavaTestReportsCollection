/*
3. 编写Java应用程序，实现运输公司对用户计算运输费用。路程(s km）越远，每吨·千米运费越低。标准如下： 
    s < 250               没有折扣
    250≤s < 500               2％折扣
    500≤s < 1000              5％折扣
    1000≤s < 2000              8％折扣
    2000≤s < 3000              10％折扣
    3000≤s                     15％折扣

*/
package app;

import java.util.Scanner;

public class CostCalc {
    // 假定每吨·千米运费的基础值为10元
    public static final int FEE = 10;

    public static void main(String[] args) throws Exception {
        System.out.println("请输入总路程长度:");
        Scanner distanceInput = new Scanner(System.in);
        int sumDistance = distanceInput.nextInt();
        if (sumDistance < 250) {
            int sumFee = sumDistance * FEE;
            System.out.printf("总费用为: %d %n", sumFee);
        } else if (250 <= sumDistance && sumDistance < 500) {
            double sumFee = sumDistance * FEE * 0.98;
            System.out.printf("总费用为: %g %n", sumFee);
        } else if (500 <= sumDistance && sumDistance < 1000) {
            double sumFee = sumDistance * FEE * 0.95;
            System.out.printf("总费用为: %g %n", sumFee);
        } else if (1000 <= sumDistance && sumDistance < 2000) {
            double sumFee = sumDistance * FEE * 0.92;
            System.out.printf("总费用为: %g %n", sumFee);
        } else if (2000 <= sumDistance && sumDistance < 3000) {
            double sumFee = sumDistance * FEE * 0.9;
            System.out.printf("总费用为: %g %n", sumFee);
        } else {
            double sumFee = sumDistance * FEE * 0.85;
            System.out.printf("总费用为: %g %n", sumFee);
        }

        distanceInput.close();
    }
}