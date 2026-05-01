/*
45.WAP in C to print 1st perfect and pos form array .
 i/p: int a[5]={2,4,6,28,6};
 o/p: num= 6, pos= 2
 */



import java.util.*;
public class firstPerfectElementPosition {
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        int []arr = new int [n];
        for (int i =0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int result = perfect(arr);
        // for (int i =0; i<arr.length; i++){
            System.out.println(result);

        // }


    } 
    public static int perfect(int arr[]){
        int n = arr.length;
        int count =0;
        for(int i =0; i<n; i++){
            int temp = arr[i];
            int s = temp;
            int sum =0;
            
            for(int j =1; j<s; j++){
                if(s%j == 0){
                    sum =sum+j;
                }
            }if(sum == temp){
                 System.out.println(sum+" is a perfect nuber");
                break;
                
            }
            count ++;

        }
     //   System.out.println(sum);
        return count;
       
    }

    
}
