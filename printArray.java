import java.util.*;
public class printArray {
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        // For input
         for (int i =0 ;i<n ; i++ ){
            arr[i] = sc.nextInt();
        }

        //for output

        for (int i =0 ;i<n ; i++ ){
            System.out.print(arr[i]+" ");
        }


    }
    
}
