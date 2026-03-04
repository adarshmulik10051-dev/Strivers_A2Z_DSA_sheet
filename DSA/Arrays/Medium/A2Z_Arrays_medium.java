
package DSA.Arrays.Medium;
public class A2Z_Arrays_medium {
    public static void Two_sum(int nums[],int target){
        for(int i = 0 ;i<nums.length-1;i++){
            for(int j = i+1; i<nums.length;i++){
                if(nums[i]+nums[j]==target){
                    System.out.println("["+i+","+j+"]");
                }
            }
        }
    }

    public static void kadans_algo(int nums[]){
        int curr_sum = 0 ;
        int max_sum = Integer.MIN_VALUE;
        for(int i = 0 ; i< nums.length; i++){
            curr_sum+=nums[i];
            if(curr_sum<0){
                curr_sum =0 ;
            }
            max_sum=Math.max(max_sum,curr_sum);
        }
        System.out.print(max_sum);
    }

    public static void find_missing(int nums[]){
        int n = nums.length + 1 ;
        int curr_sum = 0 ;
        int natural_sum = n *(n+1)/2;
        for (int i = 0 ; i < nums.length ; i++){
            curr_sum += nums[i];
        }
        System.out.println(natural_sum-curr_sum);
    }

    public static void union_two_array_sorted(int nums1[],int nums2[], int n ,int m ){
        //make n+m siz array
        int union []= new int [n+m];
        int k = 0 ;//for union
        int i = 0 ; //for nums1
        int j = 0 ; //for nums2
        while(i < n && j < m) {

            if (nums1[i] < nums2[j]) {
                if (k == 0 || union[k - 1] != nums1[i]) {
                    union[k++] = nums1[i];
                }
                i++;
            } else if (nums2[j] < nums1[i]) {
                if (k == 0 || union[k - 1] != nums2[j]) {
                    union[k++] = nums2[j];
                }
                j++;
            } else {//nums[i]==nums[j]
                if (k == 0 || union[k - 1] != nums1[i]) {
                    union[k++] = nums1[i];
                }
                i++;
                j++;
            }
        }
             while(i<n){
                 if( k==0 || union[k-1] != nums1[i] ){
                     union[k++] = nums1[i];
                 }
                 i++;
             }
             while(j < m){
                 if(k==0  || union[k-1]!=nums2[j]){
                     union[k++]= nums2[j];
                 }
                 j++;
            }
             System.out.print("union is :");
             for(int x = 0 ; x < k ; x++){
                 System.out.print(union[x]);
             }


    }

    public static void main(String args[]){

//     1) int nums[]={1,6,2,10,3};
//        int target = 7 ;
//        Two_sum(nums,target);

//      2)  int nums[]={2,3,5,-2,7,-1};
//          kadans_algo(nums);

//      3) int nums [] = {1,2,3,5,6,7};
//         find_missing(nums);

//        4) UNION
//        int nums1[]={1,2,4,5};
//        int nums2[]={2,3,5,6};
//        int n = nums1.length;
//        int m = nums2.length;
//        union_two_array_sorted(nums1 ,nums2 ,n , m);

    }
}
