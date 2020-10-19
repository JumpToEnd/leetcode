public class L1389 {

    public int[] createTargetArray(int[] nums, int[] index) {
        for (int i = 0; i < index.length; i++) {
            int idx = index[i];
            int temp = nums[i];
            for (int j = i; j > idx; j--) {
                nums[j] = nums[j-1];
            }
            nums[idx] = temp;
        }

        return nums;
    }
}
