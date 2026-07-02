package DSA.Arrays.Medium.OldTry;

import java.util.*;

public class Two_sum {

    public static int[] two_sum(int nums[],int key){
        HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
        for(int i =  0;  i <nums.length; i++){
            int req_no= key-nums[i];
            if(hm.containsKey(req_no)){
                return new int []{hm.get(req_no),i};

            }
            hm.put(nums[i],i);

        }
        return new int[]{-1,-1};
    }
    //when only return  yes or no
    public static boolean two_sum_without_index(int nums[],int key){
        Arrays.sort(nums);//sort first
        int left = 0 ;
         int right = nums.length-1;
        while(left<right){
            if(nums[left]+nums[right]==key){
                return true;
            }
            else  if(nums[left]+nums[right]<key){
                left++;
            }
            else{
                right--;
            }
        }
        return false;
    }
    public static void main (String  args[]){
        int nums[]={2,6,5,8,11};
        int key=14;
    int index []= two_sum(nums,key);
    System.out.print(index[0]+","+index[1]);
    // when you want only true or false 
    System.out.println(two_sum_without_index(nums,key));
    }
}
