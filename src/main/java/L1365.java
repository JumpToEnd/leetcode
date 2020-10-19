public class L1365 {

    public int[] smallerNumbersThanCurrent(int[] nums) {


        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                count = i != j && nums[i] > nums[j] ? count + 1 : count;
            }
            result[i] = count;
        }

        return result;
    }
}
