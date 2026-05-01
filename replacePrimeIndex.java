/*48. WAP in C to replace prime index ele with 0 in array.
 i/p: int a[8]={11,22,33,44,55,66,77,88};
 o/p: int a[8]={11,22,,0 ,0 ,55,0 ,77,0 };

 */


import java.util.*;
public class replacePrimeIndex {
    public static void main (String []args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int []arr  = new int [n];

        //for input 
        for (int i=0; i<n; i++){
             arr[i]= sc.nextInt();
        }
        int[] result = prime(arr);
        for(int i =0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }


    
}
        public static int[] prime(int []arr){
            int n =arr.length;
            int idx =0;
            for(int i =0; i<n; i++){
                int temp = idx;
                int count =0;

                for(int j =1; j<=temp; j++){
                    if(temp %j ==0){
                        count ++;

                    }

                }if(count == 2){
                    arr[idx]=0;
                }
                idx++;
            }
            return arr;
        }
}