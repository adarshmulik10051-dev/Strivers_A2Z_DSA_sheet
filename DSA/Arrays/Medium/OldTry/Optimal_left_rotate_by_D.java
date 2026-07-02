package DSA.Arrays.Medium.OldTry;

public class Optimal_left_rotate_by_D {
    public static void Reverse_the_array(int nums[],int start,int end ){
        while(start<end){
            int temp= nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start++;
                end--;
        }

    }
    public static void left_rotate_by_d(int nums[],int k ){
        int n = nums.length;
       if(n==0){

       }
       k = k % n ;
      // reverse the 0 to d places
       Reverse_the_array(nums,0,k-1);
       // revese next d places
       Reverse_the_array(nums,k,n-1);
       // reverse the whole array
       Reverse_the_array(nums,0,n-1);

    }

public static void print(int nums[]){
        for(int i = 0 ; i <nums.length;i++){
            System.out.print(nums[i]+" ");
        }
}
    public static void main(String args[]){
        int nums[] ={1,2,3,4,5,6,7};
        int d = 2;
        left_rotate_by_d(nums,d);
        print(nums);
    }
}
