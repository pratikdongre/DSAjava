import java.util.*;
public class Insertion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        // System.out.println();
        // for(int ele : arr){
        //     System.out.print(ele + " ");
        // }

        // 7 4 1 5 3
        // p 4     
        // j 0 

        // 7 4 1 5 3 
        // p 4
        // j 1 
        int ans[] = new int[n];

        for(int i=0;i<arr.length;i++){
            int p = arr[i];
            int j = i-1;

            while(j>=0 && arr[j]>p){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = p;
            

        }
        System.out.println("printing sorted ");
        for(int ele : arr){
            System.out.println(ele);
        }
        
    }    
}
