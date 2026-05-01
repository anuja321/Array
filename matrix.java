 import java.util.*;
public class matrix {
    public static void main (String []args){
         Scanner sc = new Scanner (System.in);
         System.out.print("Enter the no of row");
        int r = sc.nextInt();

         System.out.print("Enter the no of column:");
        int c = sc.nextInt();

        int arr[][] = new int [r][c];

        for (int i=0 ; i<r; i++){
            for (int j=0 ; j<c; j++){
            arr[i][j]= sc.nextInt();
            }
        }
        int magicalrow =0;
        for (int i=0 ; i<r; i++){
            int sum=0;
            for (int j =0; j<c; j++){
                if(arr[i][j]%2!=0){
                    sum = sum+arr[i][j];
                }
            }
        if(sum%2==0 && sum!=0){
            magicalrow++;
        }
        
        }
        System.out.println(magicalrow);
        
    }
}

        
    
    

    

