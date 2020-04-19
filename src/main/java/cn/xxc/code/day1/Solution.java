package cn.xxc.code.day1;



import java.util.HashMap;

/**
 * @author Jadmin
 * @Date 2020-04-19
 */
public class Solution {
    /**
     * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
     *
     * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
     *
     *  
     *
     * 示例:
     *
     * 给定 nums = [2, 7, 11, 15], target = 9
     *
     * 因为 nums[0] + nums[1] = 2 + 7 = 9
     * 所以返回 [0, 1]
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/two-sum
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    private static int[] sum(int[] nums, int target){
        int[] indexs = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>(16);
        for (int i = 0; i < nums.length; i++) {
            //下次在遍历如果包含 就把这个数的下标放在map里 则结束
            if (hashMap.containsKey(nums[i])) {
                indexs[0] = i;
                indexs[1] = hashMap.get(nums[i]);
                return indexs;
            }
            //目标值减去下标位 并存到map
            hashMap.put(target - nums[i], i);
        }
        return indexs;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int[] sum = sum(nums, 13);
        for (int i = 0; i < sum.length; i++) {
            System.out.println(sum[i]);
        }
    }



}
