import java.util.*;
public class insertZero {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int []arr = new int [n];

        for (int i =0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
            int[] result = insert(arr,k);
            for (int i =0; i<result.length; i++){
            System.out.print(result[i]);

            }
            

        
    }
        public static int[] insert(int arr[],int k){
            int n = arr.length;
            int arr1[]= new int [n+1];
            arr1[0]= k;
            for (int i = 0; i<n; i++){
                arr1[i+1 ]= arr[i];
            }
            return arr1;

        }

    }
    

