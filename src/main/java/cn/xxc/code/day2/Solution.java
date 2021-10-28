package cn.xxc.code.day2;

import java.util.Arrays;
import java.util.List;

/**
 * @author Jadmin
 */
public class Solution {

    /**
     *判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
     *
     * 示例 1:
     *
     * 输入: 121
     * 输出: true
     * 示例 2:
     *
     * 输入: -121
     * 输出: false
     * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
     * 示例 3:
     *
     * 输入: 10
     * 输出: false
     * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
     *
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        //字符串反转  暂时没有更好的解法
        String revorseString = new StringBuilder(x + "").reverse().toString();
        return (x+"").equals(revorseString);
    }

    public static boolean isPalin(int x) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilderAfter = new StringBuilder();
        List<Integer> integers = Arrays.asList(x);
        for (int i = 0; i < integers.size(); i++) {
            System.out.println(stringBuilder.append(integers.get(i)));

        }
        for (int i = integers.size()-1; i >= 0 ; i--) {
            System.out.println(stringBuilderAfter.append(integers.get(i)));
        }
        if (stringBuilder.toString().equals(stringBuilderAfter.toString())) {
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalin(-121));
        System.out.println("code dev");
    }
}
