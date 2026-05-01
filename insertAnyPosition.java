import java.util.Scanner;

public class insertAnyPosition {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the index number");
        int n = sc.nextInt();
         System.out.println("Enter the key number");
        int k = sc.nextInt();
         System.out.println("Enter the position of the number"); 
        int pos = sc.nextInt();
        int []arr = new int [n];

        for (int i =0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int []result =  insertPosition(arr,pos,k);
        for (int i =0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }

    }
        static int[] insertPosition (int arr[],int pos, int k ){
            int n = arr.length;
            int arr1[] = new int [n+1];
            arr1 [pos]= k; 

            for (int i =0; i<pos ;i++ ){
                arr1[i]= arr[i];
            }
            for (int i = pos; i<n ; i++){
                arr1[i+1] = arr[i];   
            }
            return arr1;

        }
}
