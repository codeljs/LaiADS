class solution4{

    public String LargestPalindrone(String s){
        int [] num = new int[10];
        int [] aux = new int[10];
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            int j = Character.getNumericValue(array[i]);
            // System.out.print(j);
            num[j] ++;
        }
        for (int i = 0; i < num.length; i++) {
            aux[i] = (num[i]%2 == 0)?num[i]:num[i]-1;
        }

        StringBuffer str = new StringBuffer();

        for (int i = 9; i >= 0 ; i--) {
            if(num[i]!= 0 && num[i]>aux[i]){
                str.append(String.valueOf(i));
                break;
            }
        }
        for (int i = 0; i <10; i++) {
            for (int j = aux[i]; j > 0 ; ) {
           
                str.insert(0, String.valueOf(i));
                str.append(String.valueOf(i));
                j-=2;
            }
        }

        if(str.charAt(0) == '0'){
            return ""+str.charAt(str.length()/2);
            
        }
        return str.toString();

    }
}


public class LargestPadrolineNumberInString {
    public static void main(String[] args) {
        String[] a = {"009","12345", "89877334"};
        for (int i = 0; i < a.length; i++) {
             //System.out.print(a[i]);
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.println(new solution4().LargestPalindrone( a[i]));
       }

      
    }
}
