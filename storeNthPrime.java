/*46.WAP in C to store 1st 7 prime number in array .
 i/p: int a[7];
 o/p: int a[7]={2,3,5,7,11,13,17};*/

 import java.util.*;
 public class storeNthPrime{
 public static void main (String []args ){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the index");
    int n = sc.nextInt();
    int []arr = new int[n];
    
    int idx=0;
    int num =2;
    
     
    while(idx<n){
        int count =0;
        for (int j =1; j<=num; j++){
            if(num% j == 0){
                count ++;
            }
    }

        if(count == 2){
                arr[idx]=num;
                 System.out.print(arr[idx]+" ");
                  idx++;
        }
        num++;
    }
    
    }
    }


