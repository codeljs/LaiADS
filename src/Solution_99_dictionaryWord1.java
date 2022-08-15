import java.util.HashSet;

import java.util.*;
public class Solution_99_dictionaryWord1 {
    static public boolean canBreak(String input, String[] dict) {
        // Write your solution here
        Set<String> set = new HashSet<String>();
        for (String str : dict) {
            set.add(str);
        }
        int n = input.length();
        boolean[] M = new boolean[n+1];
        M[0] = true;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if(M[j] && set.contains(input.substring(j,i))){
                    M[i] = true;
                    break;
                }
            }
        }
        String one = "123123";
        one.charAt(1);
        return M[n];
    }
}
