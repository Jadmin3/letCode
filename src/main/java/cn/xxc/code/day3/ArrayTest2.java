package cn.xxc.code.day3;

import java.util.*;

public class ArrayTest2 {



    public boolean containsDuplicate(int[] nums) {

        Set<Integer> data = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            data.add(nums[i]);
        }
        if (data.size() == nums.length) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("dev分支的内容");
    }

}
