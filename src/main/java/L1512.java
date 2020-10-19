public class L1512 {

    public int numIdenticalPairs(int[] nums) {
        return violentSolution(nums);
    }

    /**
     * 执行时间：1ms
     * 内存消耗：35.6 MB
     *
     * O(n^2)
     *
     * @param nums
     * @return
     */
    private int violentSolution(int[] nums){
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    count ++;
                }
            }
        }

        return count;
    }
}
