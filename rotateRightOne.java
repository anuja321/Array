/*Question = 38
WAP in C to right rotate array 1 times in same array.
 i/p: int a[7]={11,21,31,41,51,61,71};
 o/p: int a[7]={71,11,21,31,41,51,61};
*/
import java.util.*;
public class rotateRightOne {
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
        int temp = arr[n-1];
        
         for (int i =n-1; i>0; i--){
            arr[i]= arr[i-1];
         }
        arr[0] = temp;
         

     }   

    }
    

