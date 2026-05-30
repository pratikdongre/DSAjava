import java.util.Scanner;
import java.util.*;

public class one {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int hash[] = new int[12];

        for(int i=0;i<n;i++){
             int num = arr[i];
             hash[num]++;
        }

        // System.out.println(Arrays.toString(hash));

        int t=  sc.nextInt();
        while(t>0){
            int number;
            number = sc.nextInt();
            System.out.println("for " + number + " " +  hash[number]);

            
            t--;
        }

    }    
}
