import java.util.Scanner;

public class delete1DigitArrayElement {
     public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        // For input
         for (int i =0 ;i<n ; i++ ){
            arr[i] = sc.nextInt();
        }
        //for output
        for (int i =0; i<n; i++ ){
           int s,mul=1;
           s= arr[i];
            int num=s;

           while(num>10){
            num = num/10;
            mul*=10;

           }
         int result= s%mul;
           System.out.println(result+" ");
        }

}
}