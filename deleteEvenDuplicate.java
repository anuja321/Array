import java.util.ArrayList;
import java.util.Scanner;

public class deleteEvenDuplicate {

     public static void main(String []args){
      //  >>>>>>>>>>>>>.....................................................not completed
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        int []arr = new int [n];
        for (int i =0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> result = duplicate(arr);
                System.out.println("Array after removing duplicates:");
                for (int i = 0; i < result.size(); i++) {
                System.out.print(result.get(i) + " ");
        }
        
}
}      
