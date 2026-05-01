import java.util.Scanner;

public class deleteTwoPosition {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        System.out.print("Enter the first position : ");
        int pos = sc.nextInt();

        System.out.print("Enter the second position : ");
        int pos1 = sc.nextInt();


        int []arr = new int [n];

        for (int i =0; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int result [] = delete(arr,pos,pos1);
        for (int i =0; i<result.length; i++){
         System.out.print(result[i]+" ");

        }

    } 
        public static int[] delete(int arr[],int pos,int pos1){
            int n = arr.length;
            int arr1[]= new int [n-2];

            for (int i =0; i<pos; i++){
                arr1 [i]= arr[i];

            }for (int i =pos +1 ; i<pos1; i++){
                arr1[i-1] = arr[i];
            }
            for (int i = pos1+1 ; i<n ; i++){
                arr1[i-2]= arr[i];
            }
            return arr1;
}
            
         /*public static int[] delete(int arr[], int pos2, int pos3) {
                int n = arr.length;
                int arr1[] = new int[n - 2];
                int idx = 0;
                for (int i = 0; i < n; i++) {
                    // skip the two positions
                    if (i == pos2 || i == pos3)
                        continue;
                    arr1[idx++] = arr[i];
                }
                return arr1;
            }
            */

 }
