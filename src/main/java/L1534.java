import org.junit.Test;

public class L1534 {

    @Test
    public void test(){
        countGoodTriplets(new int[]{5,5,2,6,4},5,4,5);
    }

    public int countGoodTriplets(int[] arr, int a, int b, int c) {

        int i = 0, j = 1, k = 2;

        int count = 0;
        while (i != arr.length - 3) {

            if (Math.abs(arr[i] - arr[j]) <= a && Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c) {
                System.out.println(String.format("%s-%s-%s",arr[i],arr[j],arr[k]));
                count++;
            }


            if (k != arr.length - 1) {
                k++;
            } else if (j != arr.length - 2) {
                j++;
                k=j+1;
            } else {
                i++;
                j=i+1;
                k=j+1;
            }
        }

        return count;
    }
}
