/*51. WAP in C to delete odd palindrome number from array .
 i/p: int a[6]={22,141,222,45,33,77};
 o/p: int a[6]={22,222,45};*/

import java.util.Scanner;

public class deletePolidrome {
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int []arr = new int [n];

        for (int i =0; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int result [] = delete(arr);
        for (int i =0; i<result.length; i++){
            if(result [i]!=0){
         System.out.print(result[i]+" ");
        }

        }

     }
      public static int [] delete(int arr[]){
            int n = arr.length;
            int count =0;
            for (int i = 0; i<n; i++){
                int temp = arr[i];
                int s = temp;


                int rev=0;
               while(s!=0){
                int rem = s % 10;
                rev = rev*10+rem;
                s = s/10;

               }
               if(rev == temp){
                count ++;

               }

            }
            int result [] = new int [count ];
            int idx =0;

            for (int i = 0; i<n ; i++){
                int temp = arr[i];
                int s = temp;


                int rev=0;
               while(s!=0){
                int rem = s % 10;
                rev = rev*10+rem;
                s = s/10;

               }
            if (!(rev == temp && temp % 2 != 0)) {
            result[idx] = temp;
            idx++;

               }

            }
            return result;
            }
        


        }

    

