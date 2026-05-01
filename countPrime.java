import java.util.Scanner;

public class countPrime {
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
        int[] result = count(arr);
        int count =0;
        for (int i =0; i<result.length; i++){
             if (result[i] != 0) {   
                count ++;
        System.out.print(result[i]+" ");
             }
        }
        System.out.println(count);
    
    }
        //for output
        public static int[]count(int arr[]){
            int n = arr.length;

             int arr1 []=new int[n];

        for (int i =0; i<n; i++){
            int temp = arr[i];
            int count =0;

            if(temp<= 0 ){
                continue;
            }

            for (int j =1; j<=temp; j++){
                if(temp%j == 0){
                    count ++;
                } 
             }
             if(count==2){
                arr1[i] = temp;
            }
            
    }
    return arr1;
      
    } 
    
    

}