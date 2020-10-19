import org.junit.Test;

import java.util.Arrays;

public class L977 {

    @Test
    public  void test(){
        System.out.println(Arrays.toString(sortedSquares(new int[]{-4,-1,0,3,10})));
    }

    public int[] sortedSquares(int[] A) {

        for (int i = 0; i < A.length; i++) {
            A[i] = A[i] * A[i];
        }
        Arrays.sort(A);
        return A;
    }
}
