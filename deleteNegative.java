import java.util.Scanner;

public class deleteNegative {
     public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        System.out.print("Enter the position : ");
        int pos = sc.nextInt();

        int []arr = new int [n];
        for (int i =0; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int result [] = delete(arr);
        for (int i =0; i<result.length; i++){
         System.out.print(result[i]+" ");

        }
    }
        public static int[] delete(int arr[]){
            int n = arr.length;
            int count = 0;
          
             for (int i =0; i<n; i++){
                if( arr[i ]<0){
                    count++;
             }
            }
            int arr1[ ] = new int [count];
            int idx =0;
             for (int i =0; i<n; i++){
                if( arr[i ]<0){
                     arr1[idx] =  arr[i];
                     idx++;
             }
                
                   
                }
                return arr1;
         }
           

}


    

