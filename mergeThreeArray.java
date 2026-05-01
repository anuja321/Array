  import java.util.*;
public class mergeThreeArray {
   public static void main (String []args ){

    //Write a Java program to merge three arrays into a single array.”
    
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the first array index");
    int n1 = sc.nextInt();

    System.out.println("Enter the first array index");
    int n2 = sc.nextInt();

    System.out.println("Enter the first array index");
    int n3 = sc.nextInt();

    int arr1 [] = new int [n1];
    int arr2 [] = new int [n2];
    int arr3 [] = new int [n3];

    //for input

    for (int i =0; i<n1; i++){
        arr1[i] = sc.nextInt();
    }
    for (int i =0; i<n2; i++){
        arr2[i] = sc.nextInt();
    }
    for (int i =0; i<n3; i++){
        arr3[i] = sc.nextInt();
    }

    //for output

    int n = n1+n2 +n3;
    int arr [] = new int [n];

    for(int i =0; i<n1; i++ ){
        arr[i]=arr1[i];
    } for(int i =0; i<n2; i++ ){
        arr[i+n1]=arr2[i];
    } for(int i =0; i<n3; i++ ){
        arr[i+n1+n2]=arr3[i];
    } 

    for (int i=0; i<n; i++){
        System.out.print(arr[i]+" ");
    }

     /*     //-----------------------------------
             //  MERGING USING METHOD 1 (k pointer)
            //-----------------------------------
        int k = 0;

        // Copy arr1
        for (int x : arr1) {
            arr[k++] = x;
        }
        // Copy arr2
        for (int x : arr2) {
            arr[k++] = x;
        }
        // Copy arr3
        for (int x : arr3) {
            arr[k++] = x;
        }

        // Print merged array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
*/

   }
    
}
