import java.util.*;

public class InsertionBubble{
    // 5,4,3,2,1
    public void solution(int arr[],int n){

        if (n==1){
            return ;
        }

        boolean isSwapped =false;
        for(int i=0;i<n-2;i++){
            if(arr[i] > arr[i+1]){
                int temp = arr[i-1];
                arr[i-1] = arr[i];
                arr[i] = temp;
                isSwapped = true;
             }
        }

        if(!isSwapped){
            return;
        }

      solution(arr,n-1 );




    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }



    solution(arr,n);

    }
}