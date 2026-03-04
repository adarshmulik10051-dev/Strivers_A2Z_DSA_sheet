package DSA.Arrays.Medium;

public class Longest_subarray_sum_k {
    public static int longest_subarray_sum_k(int arr[],int k){ // when you apply 2 pointer imagine as
                                                              // ray that reach case then start increas
        int right=0;
        int left= 0;
        int n = arr.length;
        int length = 0;
        int sum = arr[0];

        while(right<n){
            while(left<=right && sum>k){ // step 2
                sum-=arr[left];
                left++;
            }
            if(sum==k){// make step 3
                length= Math.max(length,right-left+1);
            }
            right++;// you make first
            if(right<n){
                sum+=arr[right];
            }

        }
      return length;
    }
    public static void main (String args[]){
       int arr [] ={1,2,3,1,1,1,1,3,3};
       int k = 6;
       int length = longest_subarray_sum_k(arr,k);
       System.out.println("longest subarray with sum "+k+" is "+length);
    }
}
