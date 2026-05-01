import java.util.Scanner;

public class sortRange {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr  = new int [n];
        int set=0;
        int reset =0;

        //for input

        for (int i=0; i<n; i++){
             arr[i]= sc.nextInt();
        }
        sortRange(arr);
          for (int i=0; i<n; i++){
            System.out.print( arr[i]+" ");
        }


    }
        public static void sortRange(int arr[]){
            for (int i =0 ; i<3; i++){
                for (int j =i+1; j<3; j++){
                    if(arr[i] >arr[j] ){
                    int temp =arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp;
                    
                    }
                }
            }

        }
    

}