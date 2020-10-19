import org.junit.Test;

public class L1528 {

    @Test
    public void test(){
        System.out.println(restoreString("codeleet",new int[]{4,5,6,7,0,2,1,3}));
    }

    public String restoreString(String s, int[] indices) {
        char[] result = new char[indices.length];
        char[] chars = s.toCharArray();

        for (int i = 0; i < indices.length; i++) {
            result[indices[i]] = chars[i];
        }

        return String.valueOf(result);
    }
}
