import java.util.Scanner;

public class insertZerofirst {
  
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the index :");
        int n = sc.nextInt();
         System.out.println("Enter the first index :");
         int k1 = sc.nextInt();
         System.out.println("Enter the second index :");
         int k2 = sc.nextInt();

        int []arr = new int[n];
        // For input
         for (int i =0 ;i<n ; i++ ){
            arr[i] = sc.nextInt();
        }
        int result[] = insert(arr,k1,k2);
        for (int i =0; i<result.length; i++){
            System.out.print(result[i]+"  ");

        }


    }
    public static int[] insert(int arr[],int k1 ,int k2){
        int n = arr.length;
        int arr1[] = new int [n+2];
         arr1[0]= k1;
         arr1[1]= k2;
         
        for (int i =0; i<n; i++){
            arr1[i+2] = arr[i];
        
        }
        return arr1;
}
}