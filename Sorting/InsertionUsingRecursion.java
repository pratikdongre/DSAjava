import java.util.*;
import java.util.Scanner;

public class InsertionUsingRecursion {

    public static void insertionrec(int arr[],int ele,int n){
        if(ele ==n) return;
        
        int j = ele;

        while(j>0 && arr[j-1] >arr[j]){
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
            j--;
        }

        insertionrec(arr, ele+1, n);
    }

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i] = sc.nextInt();
    }

    InsertionUsingRecursion.insertionrec(arr,1,n);

    System.out.println(Arrays.toString(arr));

}    
}
