package DSA.Arrays.Easy;
import java.util.*;
public class A2Z_array_easy {
    public static void largest_in_array(int array[]){
        int largest = Integer.MIN_VALUE;
         for ( int i = 0 ; i<array.length ;i++){
             if(largest < array[i]){
                 largest = array[i];
             }
         }System.out.println("largest in array is :"+largest);
    }
    public static void Sec_largest(int array[]) {
        int largest = Integer.MIN_VALUE;
         int sec_largest = 0 ;
         for(int i =0 ; i < array.length;i++ ){
             if(largest<array[i]){
                 sec_largest = largest ;
                 largest = array[i];

             }else if(sec_largest<array[i]&&sec_largest!=largest){
                 sec_largest= array[i];
             }

         }
        System.out.print("sec_largest is :"+sec_largest);
    }
    public static boolean cheak_arrayissorted(int array[]){
        //for decending order
        for(int i = 0 ; i< array.length-1; i++){
            if(array[i]>array[i+1]){
                return false;
            }
        }return true;
    }
    public static int remove_all_duplicate(int nums[]){
        int j = 0 ;
        int n = nums.length;
        for(int i = 0 ; i< n- 1 ; i++ ){
            if(nums[i]!=nums[i+1]){
                nums[j++]=nums[i];
            }
        }
        nums[j++]=nums[n-1];
        return j ;
    }
    public static int move_zero_to_end(int nums[]){
        int j = 0 ;
                int n= nums.length;
        for(int i = 0 ; i < n-1 ; i++ ){
            if (nums[ i ] !=0){
                nums[j++]= nums[i];
            }
        }
        nums[j++]=nums[n-1];
        while(j<n){
            nums[j++]=0;
        }
        return j ;
    }
    public static void linear_search(int array[], int key){

        for(int i = 0 ; i< array.length; i++){
            if(array[i]== key ){
                System.out.println("key is found ata index = "+i);
            }

        }



    }
    public static void max_consective_one(int arr[]){
        int count = 0 ;
        int max_count = 0 ;
        for(int i = 0 ; i <arr.length ; i++ ){
            if( arr[i] == 1 ){
                count ++ ;
              max_count=  Math.max(count, max_count);

            }else {
                count = 0;
            }

        }
        System.out.println(max_count);
    }
    public static void main(String args[]){
        int array [] ={1,2,3,4,5,6,7,8};

//      1)  largest_in_array(array);


//      2)  Sec_largest(array);


//      3) boolean result = cheak_arrayissorted(array);
//       System.out.println(result);


//      4)  int nums[]= {1,2,2,3,4,4,5,5,6};
//        int num2= remove_all_duplicate(nums);
//        for(int i = 0  ; i <num2; i++){
//            System.out.print(nums[i]+",");
//        }


//      5)  int nums[] = {1,0,2,0,0,0,3,0,4,4} ;
//        int j = move_zero_to_end(nums);
//        for(int i = 0 ; i < nums.length; i++ ){
//            System.out.print(nums[i]+",");
//        }


//        6)   int key = 5;
//           linear_search(array,key);


//       7)/ int arr [] = {1,1,0,0,1,1,1};
//        max_consective_one(arr);





    }
}
