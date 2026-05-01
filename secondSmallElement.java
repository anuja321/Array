import java.util.Scanner;

public class secondSmallElement {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr  = new int [n];
        
        //for input

        for (int i=0; i<n; i++){
             arr[i]= sc.nextInt();
        }
       int result = secondSmallestElement(arr);
        System.out.println(result+ " is a second smallest number");


    }//for output 
            public static int secondSmallestElement(int arr[]){
                int min1 = Integer. MAX_VALUE;
                int min2 = Integer.MAX_VALUE  ;  
                
                int n= arr.length;
            for(int i =0; i<n ; i++){
               
                if(arr[i]<min1){
                    min2 = min1;
                    min1 = arr[i];
                   
                
                }else if(arr[i]  < min2 && arr[i] != min1) {
                     min2 = arr[i];    
                }
            }
           return min2;
     }
    
}


