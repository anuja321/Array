/*42. WAP in C to shift all -ve elements to right side in
same array.
 i/p: int a[7]={-1,22,3,-4,-8,33,77};
 o/p: int a[7]={22,3,33,77,-1,-4,-8,}; */

import java.util.Scanner;

public class siftNegative {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a  = new int [n];
        
        //for input

        for (int i=0; i<n; i++){
             a[i]= sc.nextInt();
        }
        sift(a);
        for (int i =0 ; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
        public static void sift(int []a){
            int n = a.length;

        for (int i = 0; i < n; i++) {
            if (a[i] >= 0) {          
                int temp = a[i];
                int j = i;

                while (j > 0 && a[j - 1] < 0) {
                    a[j] = a[j - 1];
                    j--;
                }

                a[j] = temp;
            }
        }
                }
            }
        

/*  int n = arr.length;
            int j =0;
        for (int i =0; i<n; i++){

                if(arr[i]>=0){
                    int temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]=temp;
                    j++;
                }
            }
                */