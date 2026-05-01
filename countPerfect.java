import java.util.Scanner;

public class countPerfect {
    public static void main (String []arg){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the index number: ");
        int n = sc.nextInt();

        System.out.println("Enter the arry number: ");
        int []arr = new int[n];

        // for input
        for (int i =0; i<n; i++){
            arr[i]= sc.nextInt();

        }
        int count =0;
        int[] result = count(arr);
        for (int i =0; i<result.length; i++){   
            if(result [i]!=0){
                System.out.print(result[i]+" ");
                count++;
            }      
       
        }
        System.out.println();
        System.out.println("count = "+count);  
    }
       
    
     //for output
        public static int[]count(int arr[]){
            int n = arr.length;
            int arr1 []=new int[n];

        for (int i =0; i<n; i++){
            int temp = arr[i];
            int sum =0;

            for (int j =1; j<temp; j++){
                if(temp%j == 0){
                  sum = sum+j;
                } 
            }
            if(sum==temp){
              //  System.out.println(sum+" is a perfect");
                arr1[i] = temp;
            }
            
    }
    return arr1;
      
    } 
    
}
