import java.util.Scanner;

public class countStrong {
     public static void main (String []arg){
    Scanner sc = new Scanner (System.in);
        System.out.print("Enter the index number: ");
        int s= sc.nextInt();

        System.out.println("Enter the arry number: ");
        int []arr = new int[s];

        // for input
        for (int i =0; i<s; i++){
            arr[i]= sc.nextInt();
        }
        // }
    //     int[] result = count(arr);
    //     int count =0;
    //     for (int i =0; i<result.length; i++){
    //          if (result[i] != 0) {   
    //             count ++;
    //     System.out.print(result[i]+" ");
    //          }
    //     }
    //     System.out.println(count);
    
    // }
    //     //for output
    //     public static int[]count(int arr[]){
    //         int n = arr.length;

    //          int arr1 []=new int[n];

    //     for (int i =0; i<n; i++){
    //         int temp = arr[i];
    //         int count =0;

    //         if(temp<= 0 ){
    //             continue;
    //         }

    //         for (int j =1; j<=temp; j++){
    //             if(temp%j == 0){
    //                 count ++;
    //             } 
    //          }
    //          if(count==2){
    //             arr1[i] = temp;
    //         }
            
    // }
    // return arr1;
    

        int count =0;
    for (int j =0; j<arr.length;j++){
        int res =arr[j];
        int n =res; 
        int sum =0;
        
        //int real =n;
    while(n!=0){
        int rem = n%10;
        int temp = rem;
        int fact=1;
        for (int i=1 ;i<=temp; i++){
           fact = fact*i;

        }
       sum = sum+fact;
         n= n/10;
    }
        if(sum == arr[j]){
            count++;
          System.out.print(sum + " ");
        }

    }
    System.out.println( "") ;
    System.out.println( count + " is a count number") ;
}
    
}   


    

