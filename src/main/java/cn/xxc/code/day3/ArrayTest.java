package cn.xxc.code.day3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayTest {


    public static void main(String[] args) {
    }

    /**
     * 示例 2：
     *
     * 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
     * 输出：[9,4]
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        //用来存放数组里的元素
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num:nums1) {
            set1.add(num);
        }
        for (int num2:nums2) {
            set2.add(num2);
        }

        return getIntersection(set1, set2);
    }

    public int[] getIntersection(Set<Integer> set1, Set<Integer> set2) {
        //首先根据题解知道是找交集  那就是集合更小的去集合更大的地方一个一个对比  如果符合就把这个数找出来

        //这里是如果结果相反则集合对调
        if (set1.size() > set2.size()) {
            return getIntersection(set2, set1);
        }
        //设置一个存放交集的集合
        Set<Integer> setResult = new HashSet<>();
        for (Integer s:set1) {
            //如果集合2包含集合1的元素则添加到结果集
            if (set2.contains(s)) {
                setResult.add(s);
            }
        }
        //因为返回结果为数组类型 需要将集合类型转存为数组
        int index = 0;
        int[] result = new int[setResult.size()];
        for (Integer s1: setResult) {
            result[index++] = s1;
        }
        return result;
    }

}
