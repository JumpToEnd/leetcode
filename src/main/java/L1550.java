import org.junit.Test;

public class L1550 {

    @Test
    public void test() {
        System.out.println(threeConsecutiveOdds(new int[]{1, 2, 34, 3, 4, 5, 7, 23, 12}));
    }

    public boolean threeConsecutiveOdds(int[] arr) {
        int index = 3;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                index--;
            } else {
                index = 3;
            }

            if (index == 0) {
                return true;
            }
        }

        return false;
    }
}
