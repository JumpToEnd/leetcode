import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class L771 {


    public int numJewelsInStones(String J, String S) {

        return solution2(J, S);
    }

    /**
     * 使用Set
     * 1 ms	36.8 MB
     */
    private int solution2(String J, String S) {
        Set<Character> characterSet = new HashSet<>();

        for (char c : J.toCharArray()) {
            characterSet.add(c);
        }

        int count = 0;

        for (char c : S.toCharArray()) {
            if(characterSet.contains(c)){
                count++;
            }
        }

        return count;
    }


    /**
     * 暴力求解
     *
     * 	3 ms	36.4 MB
     */
    private int solutaion1(String J, String S) {
        Map<Character,Integer> helpMap = new HashMap<>();

        for (char c : S.toCharArray()) {
            helpMap.merge(c, 1, Integer::sum);
        }

        int count = 0;
        for (char c : J.toCharArray()) {
            if(helpMap.get(c) != null){
                count += helpMap.get(c);
            }
        }

        return count;
    }
}
