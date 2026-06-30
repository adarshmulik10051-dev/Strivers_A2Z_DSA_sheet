package DSA.Arrays.Easy;

public class Q11_LongestSubarrayWithSumK {
    public static int   LongestSubarrayWithSumK(int arr[],int k,int n ){
            int left = 0 ; 
            int right =0 ;
            int sum =  sum=arr[0]; ; 
            int length = 0;
            

          /*1 */ while(right<n){
           /*5 */ while(left<=right&&sum>k){
                sum-=arr[left];
                left++;
            }
           /*6*/ if(sum==k){
                length=Math.max(length,right-left);
            }
          /*2 */  right++;
          /*4 */ if(right<n)/*3 */ sum+=arr[right];
           }
          return length;
            

    }
    public static void main (String args[]){
        int arr[]={1,2,3,1,1,1,1,3,3};
        int k = 6;
        int n = arr.length;
        int length=LongestSubarrayWithSumK(arr,k,n);
        System.out.println("Longest Subarray With Sum K is :"+length);

    }
    
}
