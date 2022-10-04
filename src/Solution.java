import java.security.KeyStore.Entry;
import java.util.HashSet;

public class Solution {
    //all posssible permutation
    public void permutate(String s){
        //corner case: if s is null or s has less than 1 length, then just return.
        if(s == null|| s.length()<=1){
            //there is only one possible permutation
            System.out.println(s);
        }

        //preprocessing
        char[] aux = s.toCharArray();
        int index = 0;
        HashSet<String> set = new HashSet<String>();// store the result
        int n = aux.length;
        StringBuilder builder = new StringBuilder();
        dfs(aux,index,n,builder,set);
        myprint(set);

    }


    public void dfs(char[] aux,int index, int n,StringBuilder builder,HashSet set){
        //corner case: if reach n level, we store the result into result set.
        if(index == n){
            String temp = new String(builder.toString());
            set.add(temp);
            return;
        }
        // start swap and switch
        for (int i = index; i < n; i++) {
           swap(aux,index,i);
           builder.append(aux[index]);
           dfs(aux,index+1,n,builder,set);
           builder.deleteCharAt(builder.length()-1);
           swap(aux,index,i);

        }

    }


    //swap index i and j in the char array aux
    void swap(char[] aux, int i, int j){
        char temp = aux[i];
        aux[i] = aux[j];
        aux[j] = temp;
    }

    //print the final result
    void myprint(HashSet<String> set){
        for (String i : set) {
            System.out.println(i);
        }
    }



    public static void main(String[] args) {
        String str = "AAB";
        Solution s = new Solution();
        s.permutate(str); 
    }
}
