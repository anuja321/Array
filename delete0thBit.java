import java.util.Scanner;

public class delete0thBit {
     public static void main (String []args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int []arr  = new int [n];

        //for input 
        for (int i=0; i<n; i++){
             arr[i]= sc.nextInt();
        }
     
        // Process each number
        for(int i = 0; i < n; i++){
            int num = arr[i];

            if(num == 0){
                System.out.println(0);
                continue;
            }

            int[] bit = new int[32];  // store bits
            int idx = 0;

            // Convert to binary (store in reverse order)
            while(num != 0){
                bit[idx] = num % 2;
                num = num / 2;
                idx++;
            }

            // Delete 0-th bit by skipping bit[0] and reconstruct decimal
            int result = 0;
            int power = 1;  // 2^0
            for(int j = 1; j < idx; j++){ // start from 1 to skip LSB
                result += bit[j] * power;
                power *= 2;
            }

            System.out.println(result);
        }
    }
}


    

