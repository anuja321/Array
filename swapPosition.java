import java.util.*;
public class swapPosition{
    public static void main (String []args){
      Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        // For input
         for (int i = 0 ;i<n ; i++ ){
            arr[i] = sc.nextInt();
        }
        swapPosition(arr);
         for (int i = 0 ;i<n ; i++ ){
           System.out.print( arr[i] +" ");
        }

    }
        public static void swapPosition(int arr[]){
        //for output
        if (arr.length < 5) {
            System.out.println("Array size must be >= 5");
            return;
        }

       int temp;
        temp = arr[3] ; 
        arr[3] = arr[4];
        arr[4] = temp;    
        }
       
}
