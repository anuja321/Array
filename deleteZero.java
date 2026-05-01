import java.util.Scanner;

public class deleteZero {
     public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
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
            int arr1[]= new int [n-1];
           
        for (int i = 1; i<n ; i++){
            arr1[i-1] = arr[i];
        }
        return arr1;
    }
        
    }
    


    

