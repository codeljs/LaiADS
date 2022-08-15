import java.util.*;
public class test {

    public static void shift(int[] array,int start,int end){
        int x = array[end];
        int y = array[end-1];

        array[start] = y;
        array[start+1] = x;
    }
     
    static void swap(int[] array, int i , int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int N = 2*n + 10;
        int[] array = new int[N];
        int start = N-1;
        int total = N-1;
        array[start--] = s.nextInt();
        array[start] = s.nextInt();
        swap(array, start,total);
   
        
        for (int i = 2; i < n; i++) {
            
            array[--start] = s.nextInt();
            start -= 2;
  
            shift(array,start,total);
            total -= 2;
        }
        start -= 2;
        shift(array,start,total);
        total -=2;
      
        s.close();
       
        for (int i = start; i < total+1; i++) {
            System.out.print(array[i]+" ");
        }
        return;
       
        
    }
}
