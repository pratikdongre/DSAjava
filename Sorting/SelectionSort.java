import java.util.*;

// minimum
public class SelectionSort {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        int arr[] = new int[n];
       
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

                System.out.println(Arrays.toString(arr));

        for(int i=0;i<n;i++){
            
        int minIndex = i;

            for(int j=i;j<n;j++){
                if (arr[j] < arr[minIndex]){
                minIndex = j;
                
                     }
            }

             int temp = arr[i];
            arr[i] = arr[minIndex];

            arr[minIndex] = temp;
        System.out.println(Arrays.toString(arr));
            
        }

        System.out.println(Arrays.toString(arr));
        // System.out.println(min);

        
    }
    

}
