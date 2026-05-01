import java.util.Scanner;

public class sumAllElement {
    public static void main (String []args){
      Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        int sum = 0;
        // For input
         for (int i = 0 ;i<n ; i++ ){
            arr[i] = sc.nextInt();
        }

        //for output

        for (int i =0 ;i<n ; i++ ){
            sum = sum +arr[i];
        }
        System.out.println(sum+ " is a sum of arrays");

}
}