package cn.xxc.code.day3;

public class Hannoi {


    /**
     * 汉诺塔问题
     * @param n
     * @param a
     * @param b
     * @param c
     */
    public static void hannuo(int n, String a, String b, String c) {
        if (n > 0) {
            hannuo(n-1,a,c,b);
            System.out.println("move from a to c:"+a+":"+c);
            hannuo(n-1,b,a,c);
        }
    }

    public static void main(String[] args) {
        hannuo(3,"A","B","C");
    }
}
