import java.util.*;
import java.util.Scanner;


// pushing max to last using adjacent swaps
public class BubbleSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=n-1;i>=0;i--){
            boolean didSwap = false;
            for(int j=0;j<i;j++){
                int first = arr[j];
                int second = arr[j+1];
                if(first > second){
                    didSwap = true;
                    arr[j] = arr[j+1];
                    arr[j+1] = first;
                }
            }
            if(!didSwap){
                System.out.println("Swapped not happend ");
                break;
            }
            System.out.println(Arrays.toString(arr));
        }

        System.out.println(Arrays.toString(arr));

    }

}
