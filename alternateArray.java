import java.util.Scanner;

public class alternateArray {
     public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of first array :");
        int n = sc.nextInt();

        System.out.println("Enter the size of first array :");
        int k = sc.nextInt();

        int []arr = new int [n];
        int []arr1 = new int [k];

        for (int i =0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
         for (int i =0; i<k; i++){
            arr1[i] = sc.nextInt();
        }
        int[] result = new int[n + k];
        int i = 0, j = 0, idx = 0;


             while (i < n && j < k) {
            result[idx++] = arr[i++];
            result[idx++] = arr1[j++];
        }

        // Copy remaining elements of arr
        while (i < n) {
            result[idx++] = arr[i++];
        }

        // Copy remaining elements of arr1
        while (j < k) {
            result[idx++] = arr1[j++];
        }

        // Print result
        System.out.print("Alternate merged array: ");
        for (int x = 0; x < result.length; x++) {
            System.out.print(result[x] + " ");
        }
}
        }
    

