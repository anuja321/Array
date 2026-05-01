import java.util.*;

public class deleteDuplicateArray {
    public static void main(String []args){
        
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        int []arr = new int [n];
        for (int i =0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        
                ArrayList<Integer> result = removeDuplicates(arr);
                System.out.println("Array after removing duplicates:");
                for (int i = 0; i < result.size(); i++) {
                System.out.print(result.get(i) + " ");
        }

    }
     static ArrayList<Integer> removeDuplicates(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
 
        for (int i = 0; i < n; i++) {
            boolean duplicate = false;

            // check in list if element already exists
            for (int j = 0; j < list.size(); j++) {
                if (arr[i] == list.get(j)) {
                    duplicate = true;
                    break;
                }
            }
        // add only if NOT duplicate
        if (!duplicate) {
            list.add(arr[i]);
        }
    }

    return list;
}
             

 }
    

    

