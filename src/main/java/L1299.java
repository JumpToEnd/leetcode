import org.junit.Test;

public class L1299 {

    @Test
    public void test(){
        replaceElements(new int[]{
                17,18,5,4,6,9,15,-2,-6,-1,1});
    }

    public int[] replaceElements(int[] arr) {

        int max = arr[arr.length - 1];
        for(int i = arr.length - 1;i >= 0; i--){
            int t = arr[i];
            if(i == arr.length - 1){
                arr[i] = -1;
            }else{
                arr[i] = max;
            }

            max = Math.max(max, t);
        }
        return arr;
    }
}
