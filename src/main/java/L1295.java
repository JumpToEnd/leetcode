public class L1295 {

    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            count = String.valueOf(num).length() % 2 == 0 ? count + 1 : count;
        }
        return count;
    }
}
