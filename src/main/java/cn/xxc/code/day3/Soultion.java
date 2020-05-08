package cn.xxc.code.day3;

/**
 * @author Jadmin
 */
public class Soultion {

    public int removeDuplicates(int[] nums) {
        //防止不传东西
        if (nums.length==0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
