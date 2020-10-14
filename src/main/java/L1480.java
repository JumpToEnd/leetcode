import org.junit.Test;

import java.util.Arrays;

/**
 * 给你一个数组 nums 。数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i]) 。
 *
 * 请返回 nums 的动态和。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [1,2,3,4]
 * 输出：[1,3,6,10]
 * 解释：动态和计算过程为 [1, 1+2, 1+2+3, 1+2+3+4] 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/running-sum-of-1d-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class L1480 {

    @Test
    public void test(){
        int[] nums = {1,2,3,4};
        int[] ints = runningSum(nums);
        System.out.println(Arrays.toString(ints));
    }

    public int[] runningSum(int[] nums) {
        return violentSolution(nums);
    }

    // 暴力求解    O(n^2)
    private int[] violentSolution(int[] nums){
        int[] sums = new int[nums.length];
        for(int i = 0; i< nums.length;i++){
            int tempSum = 0;
            for(int j = i; j >= 0; j--){
                tempSum += nums[j];
            }
            sums[i] = tempSum;
        }
        return sums;
    }
}

