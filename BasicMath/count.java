// package BasicMath;

import java.util.ArrayList;
import java.util.Scanner;

class countproblem{
    public static void sol(int n){
        int counter = 0;
        while(n>0){
            n = n/10;
            counter++;

        }   
        System.out.println(counter);
    }
}


class reversenumber{
    public static void reverse(int n){
        int x = 0;
        for(int i=n;i>0;i=i/10){
            System.out.println(i + " " + i%10);
            x = x * 10 + i%10;
           
        }
        System.out.println(x);
    }
}


class palindrome{
    public static void sol(int n){
        int x = 0;
        for(int i=n;i>0;i=i/10){
            x = x*10+ i%10;
        }
        if(x ==n){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}

class gcd{
    public static void sol(int n,int m){
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for(int i=1;i<=n;i++){
            if(n%i==0){
                arr.add(i);
            }
        }
        int ans = 1;
        for(int i=1;i<=m;i++){
            if(m%i==0){
                if(arr.contains(i)){
                    ans = i;
                }
            }
        }

        System.out.println(ans);
    }

    public static void brute(int n,int m){
        int gcd = 1;
        for(int i=1;i<=Math.min(n,m);i++){
   if(n%i ==0 && m%i==0){
            gcd = i;
        }
        }
     

        System.out.println(gcd);
    }

    public static void average(int n,int m){
        int gcd =1;
        for(int i=Math.min(n,m);i>=1;i--){
            if(n%i ==0 && m%i==0){
                gcd = i;
                        System.out.println(gcd);

                return ;
            }
        }
    }

    // n = 20 m = 15
    public static void best(int n,int m){
        while(m!=0){
            int temp = n;
            n = m%n;
            m= temp;

        }
        System.out.println();
    }
}
public class count {

    public static void main(String[] args){
        // System.out.println("HI");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>0){
            int i =sc.nextInt();
            int j = sc.nextInt();
        // countproblem.sol(i);
        // reversenumber.reverse(i);
        // palindrome.sol(i);
        gcd.average(i, j);

        

            n--;
        }
    }   
}
