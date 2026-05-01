import java.util.*;
public class practice {
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
      
        //for input ;
        for(int i =0; i<n;i++){
            arr[i] = sc.nextInt();
        
        }


      /*   int count1 =0;
        int count=0;
        for(int i =0; i<n; i++){
            int t  = arr[i];
            int temp = t;
            // if(temp == 0){
            //         System.out.println("0");
            //         continue;
            //     }

             int []bit = new int[32];
            int idx=0;
            while(temp!=0){
                bit[idx] = temp % 2;
                idx++;
                temp = temp/2;
            }
            int []bit1 = new int [32];

            for (int j =0; j<32; j++){
                if(bit[j]==1){
                   bit1[j]= bit [idx];
                }
                 System.out.println(bit1[j]);
            }
           // System.out.println(bit1[j]);
        }
          // System.out.println();

          
*/

    /*// first digidt sum
    
    int sum =0;
        for (int i =0; i<n; i++){
            int t = arr[i];

            while(t>=10){
                int rem = t%10;
                t=t/10;
            }
            sum = sum +t;

        }
        System.out.println(sum);
*/

       /*  //sum of the array
       int sum =0;
        for (int i =0; i<n ; i++){
            sum =sum+arr[i];

        }
        System.out.println(sum);
        */

  /* //sort the array in decending order
      
      sort(arr);
         for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
         } 
    }

    public static void sort(int arr[]){
        int n = arr.length;
        for (int i =0; i<4; i++){
            for(int j =i+1; j<4; j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
            */
    

    }
    
}
