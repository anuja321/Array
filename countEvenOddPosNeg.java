import java.util.*;
public class countEvenOddPosNeg {
    public static void main (String []arg){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int []arr = new int[n];

        // for input
        for (int i =0; i<n; i++){
            arr[i]= sc.nextInt();

        }
        int count=0,count1=0, count2=0,count3 =0;

        //output
         for (int i =0; i<n; i++){
          if( arr[i]%2==0)
            count++;
          else
            count1++;
          if(arr[i]>0)
            count2++;
          else 
            count3++;
          

         }
        System.out.println(count+" is a even count ");
        System.out.println(count1+" is a odd count ");
        System.out.println(count2+" is a positive count ");
        System.out.println(count3+" is a negative count ");
    }

    
}
