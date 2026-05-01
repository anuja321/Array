import java.util.Scanner;

public class secondLargeEle {
     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr  = new int [n];
        
        //for input

        for (int i=0; i<n; i++){
             arr[i]= sc.nextInt();
        }
       int result = secondLargeElement(arr);
        System.out.println(result+ " is a second largest number");


    }
    //for output 
            public static int secondLargeElement(int arr[]){
                int max1=Integer.MIN_VALUE;
                int max2 = Integer.MIN_VALUE  ;  
                
                int n= arr.length;
            for(int i =0; i<n ; i++){
               
                if(arr[i]>max1){
                    max2 = max1;
                    max1 = arr[i];
                   
                
                }else if(arr[i] > max2 && arr[i] != max1) {
                     max2 = arr[i];    
                }
            }
           return max2;
     }
    
}
