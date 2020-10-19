public class L1313 {


    public int[] decompressRLElist(int[] nums) {

        int length = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                length += nums[i];
            }
        }

        int[] result = new int[length];
        int m = 0;
        for (int i = 1; i < nums.length; i += 2) {
            for (int j = 0; j < nums[i - 1]; j++) {
                result[m++] = nums[i];
            }
        }

        return result;
        /*List<Integer> list = new ArrayList<>();
        int times = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                times = nums[i];
            } else {
                for (int j = 0; j < times; j++) {
                    list.add(nums[i]);
                }
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;*/
    }
}
