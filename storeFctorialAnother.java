/* . in C to store factorial of array in another array.
 i/p: int a[4]={ 4, 5, 6, 4};
 o/p: int b[4]={24,120,720,24}
*/
import java.util.*;
public class storeFctorialAnother {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];

        for (int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }

        int result[] = factorial(arr);
        for (int i =0; i<result.length; i++){
            System.out.println(result[i]);
        }

    }   
public static int[] factorial(int arr[]){
    int n = arr.length;
    int arr1[] = new int [n];
    
    for (int i =0; i<n; i++){
        int temp = arr[i];
        int p = temp;
        int fact = 1;

    for (int j =1; j<=p; j++){
        fact = fact*j;
    }
    arr1[i] = fact;

}
    return arr1;
    }

}

