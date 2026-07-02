package DSA.Arrays.Medium.OldTry;

public class Print_max_sum_subarray {
    public static void print_suarray(int arr[],int n){
        int curr_sum=0;
        int max_sum=Integer.MIN_VALUE;
        int start=-1;
        int end=-1;

        for(int i = 0 ; i < n; i++){
            if(curr_sum==0){
                start=i;
            }
            curr_sum+=arr[i];
            if(max_sum<=curr_sum){
                end =i;
                max_sum=curr_sum;
            }
            if(curr_sum<0){
                curr_sum=0;
            }

        }
        System.out.println("maxsum is : "+max_sum);
        System.out.print("the subarray is: ");

        for(int i= start;i<=end;i++){
            System.out.print(arr[i]+", ");
        }
    }
    public static void main (String args[]){
        int arr[]={2,3,5,-2,7,-4};
        int n = arr.length;
        print_suarray(arr,n);
    }
}
