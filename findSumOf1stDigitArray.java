import java.util.Scanner;

public class findSumOf1stDigitArray {
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        // For input
         for (int i =0 ;i<n ; i++ ){
            arr[i] = sc.nextInt();
        }

        //for output
        int s,rem,sum =0;
        for (int i =0 ;i<n ; i++ ){
            s = arr[i];
            while (s>10){
                rem = s%10;
                s = s/10;
            }
            sum = sum+s;
        }
        System.out.println(sum);

}
}