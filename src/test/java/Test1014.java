public class Test1014 {


    public void test(int[] nums) {

        boolean flag = false;
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                continue;
            }
            if (nums[i] == nums[i - 1] && !flag) {

            }

            if (nums[i] == nums[i - 1] && flag) {
                flag = true;
            }


        }
    }

    private void swap(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;
    }
}
