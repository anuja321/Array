import java.util.*;
public class deletePostision {
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

        int result [] = delete(arr,pos);
        for (int i =0; i<result.length; i++){
         System.out.print(result[i]+" ");

        }
    }
        public static int[] delete(int arr[],int pos ){
            int n = arr.length;
            int arr1[ ] = new int [n-1];

            for(int i =0; i<pos; i++ ){
                arr1[i] =arr[i] ;
            }for (int i =pos+1;i<n ; i++ ){
                arr1[i-1] = arr[i];
            }
            return arr1;

        }
    }
