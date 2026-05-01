/*Question = 40;
WAP in C to left rotate array 1 times in same array.
 i/p: int a[7]={11,21,31,41,51,61,71};
 o/p: int a[7]={21,31,41,51,61,71,11};
*/



import java.util.Scanner;

public class rotateZeroLeft {
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the index no :");
        int n = sc.nextInt ();
        int arr[]  = new int [n];

        for (int i =0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        rotate(arr);
       for (int i =0; i< arr.length; i++){
        System.out.print (arr[i]+" ");
       }


      }  
      public static void rotate(int arr[]){
        int n = arr.length;
        int temp = arr[0];
        
         for (int i =1; i<n; i++){
            arr[i-1]= arr[i];
         }
        arr[n-1] = temp;
         

     }   

    }
    



