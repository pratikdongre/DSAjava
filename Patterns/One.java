
public class One{

    public static void one(){
          for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
        System.out.print("* ");

            }
            System.out.println();
        }
    }

    public static void two(){
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void three(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print( j + " ");
            }
            System.out.println();
        }
    }
      public static void four(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print( i + " ");
            }
            System.out.println();
        }
    }

    public static void five(){
        for(int i=1;i<=5;i++){
            for(int j =5;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
      public static void six(){
        for(int i=1;i<=5;i++){
            for(int j =5;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void seven(){
        for(int i=1;i<=5;i++){
            for(int j=i;j<=5;j++){
                System.err.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void eight(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
             for(int x=1;x<i;x++){
                System.out.print("* ");
            }
            System.out.println();
        }   
    }

    public static void nine(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<i;j++){
            System.out.print(" ");
            }
            for(int k=1;k<=5-i+1;k++){
                System.out.print("*");
            }

            for(int x = 1;x<=5-i;x++){
                System.out.print("*");
            }
            

            
          
        

        System.out.println();
        }
        
    }

    public static void fourteen(){
           
            for(int i=1;i<=5;i++){

                 char print = 'A';
                for(int j=1;j<=i;j++){
                    System.out.print(print++);
                }
                System.out.println();
            }
    }

    public static void fifteen(){
        for(int i=1;i<=5;i++){
            char print = 'A';
            for(int j=1;j<=5-i+1;j++){
                System.out.print(print++);
            }
            System.out.println();
        }
    }

    public static void sixteen(){
         char print ='A';
        for(int i=1;i<=5;i++){
           
            for(int j=1;j<=i;j++){
                System.out.print(print);
            }
            System.out.println();
            print++;
        }
    }

    public static void seventeen(){
        for(int i=1;i<=4;i++){
            char print = 'A';
            for(int j=1;j<5-i;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print(print++);
            }
            print--;
             
            for(int j=1;j<i;j++){
                System.out.print(--print);
            }

            System.out.println();
        }

    }

    public static void eighteen(){
        char print = 'E';
        for(int i=1;i<=5;i++){
            char printing = print;
            for(int j=1;j<=i;j++){
                System.out.print(printing++);
            }
            System.out.println();
            

            print--;
            printing = print;
        }
    }

    public static void nineteen(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i+1;j++){
                System.out.print("*");
            }
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=5-i+1;j++){
                System.out.print("*");
            }

            System.out.println();
            
        }
        for(int x=1;x<=5;x++){
                for(int j=1;j<=x;j++){
                    System.out.print("*");
                }
                for(int j=1;j<=5-x;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=5-x;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=x;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
    }

    public static void twenty(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
        for(int i=1;i<5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print("*");
            }

            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
             for(int j=1;j<=i;j++){
                System.out.print(" ");
            }

             for(int j=1;j<=5-i;j++){
                System.out.print("*");
            }

            System.out.println();
        }

    }

    public static void twoone(){
        int n=15;
        for(int i=1;i<=n;i++){
            if(i==1 || i==n){
                for(int j=1;j<=n;j++){
                    System.out.print("*");
            }
            System.out.println();
            }

            else {
                for(int j=1;j<=n;j++){
                    if(j==1 || j==n){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }

                }
                                                            System.out.println();

            }
            
        }
    }


    public static int twoonecopy(int n, int print){
        if(n<1){
            return 0;
        }
            n = n-1;
        for(int i=1;i<=n;i++){
            if(i==1 || i==n){
                for(int j=1;j<=n;j++){
                    System.out.print(print);
            }
            System.out.println();
            }

            else {
                for(int j=1;j<=n;j++){
                    if(j==1 || j==n){
                        System.out.print(print);
                    }
                    else {
                                twoonecopy(n-2, --print);

                        // System.out.print(" ");
                    }

                }
                                                            System.out.println();

            }
            
        }
       

       
        return 0;
    }
    public static void twotwo(){
        int n =8;
        int print = n/2;
        for(int i=1;i<n;i++){
                for(int j=1;j<n;j++){
                //    if(i==1 || i==n-1 || j==1 || j==n-1){
                //     System.out.print(n/2);
                //    } 
                //    else if(j==2 && j==n-2 || i==2 || i==3)   {
                    
                //     System.out.print(--print);

                //    }
                //    else if (j>=3 && j<=5){
                //     System.out.print(--print);
                //    }
                //    else {
                //     System.out.print(n/2);
                //    }
                int min = Math.min(Math.min(i, j),
                   Math.min(print-1-i, print-1-j));

System.out.print(print - min +1);
}

                                   System.out.println();

        }





    }

    public static void fill(int arr[][],int start,int end,int val){
        // val = 4 , start 1 end 7
        // System.out.println(end);
        if(val ==0){
            return ;
        }

        // top
        for(int i=start;i<=end;i++){
            arr[start][i] = val;
        }


        // left
        for(int j=start;j<=end;j++){
            arr[j][start] = val;
        }

        //right
        for(int j=start;j<=end;j++){
            arr[j][end] = val;
        }

        for(int j=start;j<=end;j++){
            arr[end][j] = val;
        }

        fill(arr,start+1,end-1,val-1);

    }


    public static void lastone(){
        int n = 4;
        int size = (n*2) -1;
        int arr[][] = new int[size][size];

        fill(arr,0,size-1,n);

        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(arr[i][j]);
            }

            System.out.println();
        }
    }
    public static void main(String[] args){
        // one();
        // two();
        // three();
        // four();
        // five();
        // six();
        // seven();
        // eight();
        // nine();
        // sixteen();
        // seventeen();
        // eighteen();
        // nineteen();
        // twenty();
        // twoone();
        // int n=8;
        // int print = n/2;
        
        // int m = twoonecopy(n, print);
        // twotwo();

        lastone();
    }

}