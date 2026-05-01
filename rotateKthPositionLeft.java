/*
Queation=41
WAP in C to left rotate array 2 times in same array.
 i/p: int a[7]={11,21,31,41,51,61,71};
 o/p: int a[7]={31,41,51,61,71,11,21};
 */



import java.util.Scanner;

public class rotateKthPositionLeft {
         public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the index no :");
        int n = sc.nextInt ();
        int arr[]  = new int [n];

        for (int i =0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        rotate(arr,3);
       for (int i =0; i< arr.length; i++){
        System.out.print (arr[i]+" ");
       }


      }  
      public static void rotatePosition(int arr[]){
        int n = arr.length;
        int temp = arr[0];
        
         for (int i =1; i<n; i++){
            arr[i-1]= arr[i];
         }
        arr[n-1] = temp;
        }

      
     static void rotate(int []arr,int k) {
        k = k% arr.length;
        if(k<0){
            k = k+arr.length;
        }
        for (int i =0; i<k; i++){
            rotatePosition(arr);

        }

     }

    
}


