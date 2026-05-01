import java.util.*;
public class sortArray {
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the index ");
        int n =  sc.nextInt();
        System.out.println("Enter the number ");
        int k =  sc.nextInt();
        int arr[]= new int[n];

        for (int i =0; i<n; i++){//.......................i didnot get;
            arr[i]= sc.nextInt();
        }
        // Number to insert
        int num = sc.nextInt();

        // New array (size increases by 1)
        int[] result = new int[n + 1];

        int i = n - 1;

        // Step 1: shift elements greater than num
        while (i >= 0 && arr[i] > num) {
            result[i + 1] = arr[i];
            i--;
        }

        // Step 2: insert number
        result[i + 1] = num;

        // Step 3: copy remaining left part
        for (int j = 0; j <= i; j++) {
            result[j] = arr[j];
        }

        // Print
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}

    

