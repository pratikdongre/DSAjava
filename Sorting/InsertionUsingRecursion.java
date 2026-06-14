import java.util.*;
import java.util.Scanner;

public class InsertionUsingRecursion {

    public void insertionrec(int arr[],int ele,int n){
        if(ele ==n) return;
        for(int i=0;i<arr.length;i++){
            if(arr[ele] > arr[i]){
                int temp = arr[i];
                arr[i] = arr[ele];
                arr[ele] = temp;
            }
        }
    }

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i] = sc.nextInt();
    }

    insertionrec(arr,0,n);


}    
}
