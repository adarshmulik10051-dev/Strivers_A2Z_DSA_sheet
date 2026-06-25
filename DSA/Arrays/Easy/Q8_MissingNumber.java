package DSA.Arrays.Easy;

public class Q8_MissingNumber {

    //approch: natural no 1 to infinite
    //1.calculate array sum  (n = arr.length)
    //2.calculate natural (sum n=arr.length+1;)
    //2.1formula: n*(n+1)/2;
    //3. return naturalsum-currarrsum
    public static int MissingNumberOP1(int nums[],int n){
        int currSum=0;
        int naturalSum=0;
        for(int i = 0; i < nums.length ; i ++){
            currSum+=nums[i];
        }
        naturalSum=(n*(n+1))/2;

        return naturalSum-currSum;
    }
    public static int MissingNumberOP2(int nums[],int n){

        //approch: 
        //1.calculate xor1 with natural numbers, (1-->n)  n= arr.length+1 1-->n 
        //2.calculate xor2 with given arr 
        //3. missing num = xor1^xor2
        //(1 ^ 2 ^ 3 ^ 4 ^ 5) ^ (1 ^ 2 ^ 4 ^ 5)
        //1^1 ^ 2^2 ^ 4^4 ^ 5^5 ^ 3
        int xor1 = 0 ;
        int xor2= 0 ;
         for(int i = 1 ; i <=n ; i++){
            xor1^=i;
         }
         for(int i = 0 ; i < nums.length ; i ++){
            xor2^=nums[i];
         }
        return xor1^xor2;
    } 
    public static void main(String args[]){
        int nums[]={8, 2, 4, 5, 6, 7, 1};
        int n = nums.length+1; 
        System.out.println(MissingNumberOP1(nums, n));
        System.out.println(MissingNumberOP2(nums, n));

    }
}
