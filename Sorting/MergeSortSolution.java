import java.util.*;

 class Solution{

    public void nowmerge(int arr[],int low,int mid,int high){

        List<Integer> temp = new ArrayList<>(); 

        int left = low,right = mid+1;

        while(left<=mid && right <=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left++]);
            }else temp.add(arr[right++]);
        }
        while(left<=mid){
            temp.add(arr[left++]);
        }
        while(right<=high){
            temp.add(arr[right++]);
        }

        for(int i=low;i<=high;i++){
            arr[i] = temp.get(i-low);
        }

    }

    public void mergeSort(int arr[],int low,int high ){
        if(low>=high) return;
        int mid = (low+high)/2;

        // left side 
        mergeSort(arr, low, mid);

        // rightside 
        mergeSort(arr, mid+1, high);

        nowmerge(arr,low,mid,high);
        
    }
}

public class MergeSortSolution {

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int arr[] = new int[n];

    for(int i=0;i<n;i++){
        arr[i]= sc.nextInt();
    }

    Solution sol = new Solution();


    sol.mergeSort(arr,0,arr.length-1);
    
  


    }

        


    }

    


    }
   

