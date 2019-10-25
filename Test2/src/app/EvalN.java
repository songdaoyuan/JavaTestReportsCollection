package app;
//计算n至少多大时，以下不等式成立：
//     1+1/2+1/3+...+1/n>6

public class EvalN {
    public static void main(String[] args) throws Exception {
        double n = 1;
        double sum = 0;
        while(sum < 6){
            sum = sum + 1/n;
            n+=1;
        }
        System.out.println("当n至少为" + n + "时,不等式成立.");
    }
}