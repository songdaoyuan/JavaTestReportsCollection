package app;
/*
写一个方法判断一个数是否为素数，返回布尔值。利用该方法验证哥德巴赫猜想：
任意一个不小于3的偶数可以拆成两素数之和。
不妨将验证范围缩小到3~100。
*/

/*
本程序中用于判断素数的算法如下:
    定理: 如果n不是素数, 则n有满足1< d <= sqrt(n)的一个因子d.
    证明: 如果n不是素数, 则由定义n有一个因子d满足1< d < n. 
    如果d大于sqrt(n), 则n/d是满足1< n/d <= sqrt(n)的一个因子.
    算法的时间复杂度为: O(Math.sqrt(n)/2)
    相对于使用定义直接判断(n%i == 0, i=2; i<n; i++)的时间复杂度 O(n)
    和去掉偶数的判断(n%i == 0,i=3; i<n; i+=2)的时间复杂的 O(n/2)均要快
*/
public class GoldbachConjecture {
    public static void main(String[] args) throws Exception {
        for (int i = 4; i < 100; i += 2) {
            System.out.println("满足条件的一个偶数为：" + i);
            split(i);
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2)
            return false;
        if (n == 2)
            return true;
        if (n % 2 == 0)
            return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    // 自定义一个专门用来拆分偶数的函数
    // 参数用于指定需要拆分的偶数
    // 将指定的偶数所有拆分形式都显示出来
    public static void split(int num) {
        for (int a = 2; a <= num / 2; a++) {
            int b = num - a;
            // 将a不是质数，b不是质数的情况排除
            if (isPrime(a) && isPrime(b)) {
                // 将拆分后的表达式显示出来
                System.out.println(num + "=" + a + "+" + b);
            }
        }
    }
}