import java.util.Scanner;

public class sortRangeArray {
    public static void main (String []args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        // For input
         for (int i =0 ;i<n ; i++ ){
            arr[i] = sc.nextInt();
        }
       // Sorting (Selection Sort)
        for (int i = 0; i < 4; i++){
            for (int j = i+1; j< 4 ; j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp;


                }

            }
        }
        // Printing sorted array
    for(int i = 0; i < n; i++){
        System.out.print(arr[i] + " ");

    } 

    
}
}
