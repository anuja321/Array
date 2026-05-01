import java.util.*;
public class printBinaryElement {
    public static void main (String []args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int []arr  = new int [n];

        //for input 
        for (int i=0; i<n; i++){
             arr[i]= sc.nextInt();
        }

     /* //using string methods 
        //for output
        for(int i =0; i<n; i++){
            int num = arr[i];

            if(num == 0){
                System.out.println("0");
                continue;
            }

            String bin ="";
            while (num!=0){
                int rem =num%2;
                bin=rem+bin; 
                num =num/2;

            }
           System.out.println(bin);
            System.out.println(" ");
            
        }*/

            //using bit arrays
            //for output 
            for(int i =0; i<n ; i++){
                int num = arr[i];

                if(num == 0){
                    System.out.println("0");
                    continue;
                }
                int []bit= new int[32];
                int idx=0;
                    while(num!=0){
                        bit[idx]= num%2;
                        idx++;
                        num = num/2;

                }
                //reverse the array 
                for (int j= idx-1 ; j>=0;j--){
                    System.out.print(bit[j]);
                }
                System.out.println();
            }

    }
    
}
         