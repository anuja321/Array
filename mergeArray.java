import java.util.Scanner;

public class mergeArray {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int []arr = new int [n];
        int []arr1 = new int [k];

        for (int i =0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
         for (int i =0; i<k; i++){
            arr1[i] = sc.nextInt();
        }
        int a = arr.length;
        int b = arr1.length;
        int idx = a+b;
        int []result = new int [idx];
        for (int i=0; i<n; i++){
        result[i] = arr[i];
        }

         for (int i=0; i<k; i++){
        result[n+i] = arr1[i];
        
         }
         for (int i = 0; i < result.length; i++) {
             System.out.print(result[i] + " ");
}
        }
       
           
}



