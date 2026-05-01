import java.util.*;
public class setReset {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr  = new int [n];
        int set=0;
        int reset =0;

        //for input

        for (int i=0; i<n; i++){
             arr[i]= sc.nextInt();
        }
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
                //count the bits
               for(int j = 0; j < 32; j++){
                if(bit[j] == 1) set++;
                else reset++;
            }
        }

        System.out.println("Set count = " + set);
        System.out.println("Clear count = " + reset);
    }
          
    }
   

    

   