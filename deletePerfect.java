/*47. WAP in C to delete perfect number from array .
 i/p: int a[6]={6,6,7,28,6,5,24};
 o/p: int a[6]={7,5,24}; */

import java.util.Scanner;

public class deletePerfect {

    public static void main (String []args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        int []arr = new int [n];
        for (int i =0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int []result = perfect(arr);
        for (int  i=0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }


    }
        public static int[] perfect(int arr[]){
            int n = arr.length;
            int count =0;

    // non perfect nuber ;
            for (int i =0; i<n; i++){
                int temp = arr[i];
                int sum =0;
                for (int j = 1; j<temp ; j++){
                    if(temp%j == 0){
                        sum = sum+j;

                    }
                }
                if(sum != temp ){
                     arr[i] = temp;
                    count ++;

                }

            }
    // 2. create new array
        int[] result = new int[count];
        int idx = 0;

        // 3. copy only NON-perfect numbers
        for (int i = 0; i < n; i++){
            int temp = arr[i];
            int sum = 0;

            for (int j = 1; j < temp; j++){
                if (temp % j == 0){
                    sum += j;
                }
            }

            if (sum != temp){   // not perfect
                result[idx] = temp;
                idx++;
            }
        }

        return result;


        }
    }
    

