package DSA.Arrays.Medium;

public class Max_Consecutiv_ones {
    public static void count_max_ones(int nums[],int n){
        int max_count = Integer.MIN_VALUE;
        int curr_count = Integer.MIN_VALUE;
        for(int i = 0 ; i<n-1; i++){
            if(nums[i]==1){
                curr_count+=nums[i];
                max_count=Math.max(max_count,curr_count);
            }
            else{
                curr_count=0;
            }
        }
        System.out.println("max consecutive_ones in given array is : "+max_count);
    }
    public static void main (String args[]){
        int nums[]={1,1,0,0,1,1,1,0,1};
        int n = nums.length;
        count_max_ones(nums,n);
    }
}
