package cn.xxc.code.day3;

import java.util.*;

public class ArrayTest {


    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 5, 6};
        System.out.println(searchInsert(nums, 7));
        String s = "flower";
        System.out.println(s.startsWith("flowe"));
    }

    /**
     * 示例 2：
     * <p>
     * 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
     * 输出：[9,4]
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        //用来存放数组里的元素
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }
        for (int num2 : nums2) {
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
        for (Integer s : set1) {
            //如果集合2包含集合1的元素则添加到结果集
            if (set2.contains(s)) {
                setResult.add(s);
            }
        }
        //因为返回结果为数组类型 需要将集合类型转存为数组
        int index = 0;
        int[] result = new int[setResult.size()];
        for (Integer s1 : setResult) {
            result[index++] = s1;
        }
        return result;
    }

    public int[] intersection2(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                set.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            }
        }
        int[] res = new int[set.size()];
        int index = 0;
        for (int num : set) {
            res[index++] = num;
        }
        return res;
    }

    /**
     * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
     * <p>
     * 你可以假设数组中无重复元素。
     * <p>
     * 示例 1:
     * <p>
     * 输入: [1,3,5,6], 5
     * 输出: 2
     * <p>
     * 作者：力扣 (LeetCode)
     * 链接：https://leetcode-cn.com/leetbook/read/array-and-string/cxqdh/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     *
     * @param nums
     * @param target
     * @return
     */
    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            //如果等于直接返回下标 不然直接返回数组长度 因为下标从0开始 数组长度不是 默认加1就是目标的下标
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }

    /**
     * 编写一个函数来查找字符串数组中的最长公共前缀。
     * <p>
     * 如果不存在公共前缀，返回空字符串 ""。
     * <p>
     *  
     * <p>
     * 示例 1：
     * <p>
     * 输入：strs = ["flower","flow","flight"]
     * 输出："fl"
     *这里时间复杂度是O(n)
     * @param strs
     * @return
     */
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        //公共前缀比所有字符串都短
        String s = strs[0];
        for (String string : strs) {
            //判断是否有指定的前缀开始
            while (!string.startsWith(s)) {
                //公共前缀不匹配就让它变短！
                s = s.substring(0, s.length() - 1);
            }
        }
        return s;
    }



}
