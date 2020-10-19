import java.util.ArrayDeque;
import java.util.Deque;

public class L1021 {

    public String removeOuterParentheses(String S) {

        char[] chars = S.toCharArray();
        Deque<Character> stack = new ArrayDeque<>();
        int flag = 0;
        for (int i = 0; i < chars.length; i++) {
            if(stack.isEmpty()){
                flag = chars[i] == '(' ? flag += 1 : 0;
                stack.push(chars[i]);
            }

        }


        return null;
    }
}
