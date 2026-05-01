/* 
44.WAP in C to shift all 0 to left side in same array.
 i/p: int a[7]={11,0,0,44,0,33,0};
 o/p: int a[7]={0,0,0,0,11,44,33}; */
import java.util.Scanner;

public class shiftAllZeroLeft {
     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr  = new int [n];
        
        //for input

        for (int i=0; i<n; i++){
             arr[i]= sc.nextInt();
        }
        sift(arr);
        for (int i =0 ; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
        public static void sift(int []arr){
            int n = arr.length;
          
        for (int i =0; i<n; i++){
            if(arr[i]==0){
                int temp = arr[i];
                int j =i;

                while (j>0 && arr[j-1]!=0){
                    arr[j]= arr[j-1];
                    j--;
                }
                arr[j]= temp;
            }
         
                
                }
            }
                }
            

