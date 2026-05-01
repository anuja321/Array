/*Question 32.
 WAP in C to product of digit of all array elements.
 i/p: int a[5]={11,202,234,456,90};
 o/p: int a[5]={1, 0, 24,120, 0};
*/

import java .util.*;
public class productDigit {
    public static void main (String []args){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        int []arr = new int [n];
        for (int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int result[] = product(arr);
        for (int i =0; i<result.length;i++ ){
            System.out.println(result[i]);
        }

    }
        public static int[] product(int arr[]){
            int n = arr.length;
            int []arr1 =new int [n];

            for(int i =0; i<n; i++){
                int s= arr[i];
                int temp = s;
                int product= 1;

                while (temp!=0){
                    int rem = temp%10;
                    product = product*rem;
                    temp =temp/10; 
                }

                arr1[i] =product; 
            }
            return arr1;


        }

        
    }
    

