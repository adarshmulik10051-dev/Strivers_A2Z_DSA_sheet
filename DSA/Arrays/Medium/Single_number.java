package DSA.Arrays.Medium;

public class Single_number {
    // for find siz of freq array
    public static int max_element(int nums[],int n){
        int max_ele =Integer.MIN_VALUE;
        for(int i = 0 ; i < n; i++){
            if(max_ele<nums[i]){
                max_ele=nums[i];
            }
        }
        return max_ele;
    }

    public static void single_element(int nums[],int n){
        //if size of array is 1
        if(n==1){
            System.out.println("singlr element in array: "+ nums[0]);
            return;
        }
        //count freq of each element using the freq array
        int maxE=max_element(nums,n);
        int freq[]= new int [maxE+1];
        for(int i = 0 ; i < n ; i ++){
            freq[nums[i]]++;
        }
        // cheak which element is single or not
        for(int i = 0 ; i < freq.length ; i ++){
         if(freq[i]==1){
             System.out.println("singlr element in array: "+ i);
         }
         else{
             System.out.println("no one single element present");
             break;
         }
        }
    }
    public static void main(String args[]){
        int nums[] = {5};
        int n = nums.length;
        single_element(nums,n);
    }
}
