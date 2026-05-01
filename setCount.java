import java.util.*;
public class setCount {
     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr  = new int [n];
      
        for (int i=0; i<n; i++){
             arr[i]= sc.nextInt();
        }
         //using bit arrays
                //for output

        int[] b = new int[n]; // final output array

        for(int i = 0; i < n; i++){
            int num = arr[i];
            int set = 0; // reset for each number

            int[] bit = new int[32];
            int idx = 0;

            while(num != 0){
                bit[idx] = num % 2;
                if(bit[idx] == 1) set++;  // count set bits here
                num = num / 2;
                idx++;
            }

            b[i] = set; // store count in b array
        }

        // print b array
        for(int i = 0; i < n; i++){
            System.out.print(b[i]+" ");
        }
        } 
        }         
