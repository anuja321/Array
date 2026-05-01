/* 50. WAP in C to delete all strong num from array .
i/p: int a[6]={2,145,2,14,3,2};
o/p: int a[6]={14,3};

 */
import java.util.*;

public class deleteStrong {
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int []arr = new int [n];

        for (int i =0; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int result [] = delete(arr);
        for (int i =0; i<result.length; i++){
         System.out.print(result[i]+" ");

        }

    }
    public static int [] delete(int arr[]){
        //non strong nuber;
        int n = arr.length;
        int count =0;
         
         for (int i =0; i<n; i++){
            int temp = arr[i];
            int a = temp ;
            int sum =0;

            while(a!=0){
                int rem = a%10; 
                 int multi = 1;

                for (int j=1; j<=rem; j++){
                    multi = multi *j;
                
                }
                 sum = sum + multi;
                    a = a/10;
            }

            if(sum != temp){
                arr[i] = temp;
               count ++;
            }
         }

        //crate the array

         int result[] =new int [count] ;
         int idx =0; 

        //copy the non strong number 

         for (int i =0; i<n; i++){
                        int temp = arr[i];
            int a = temp ;
            int sum =0;

            while(a!=0){
                int rem = a%10; 
                 int multi = 1;

                for (int j=1; j<=rem; j++){
                    multi = multi *j;
                
                }
                 sum = sum + multi;
                    a = a/10;
            }

            if(sum != temp){
                result[idx] = temp;
               idx++;
            }
         }
         return result; 
           

        }

    } 


    

