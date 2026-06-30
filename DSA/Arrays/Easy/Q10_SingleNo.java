package DSA.Arrays.Easy;

public class Q10_SingleNo {
    //approch:XOR^
    //1.itrate the overall array. 
    //2.calculate XOR with each element.
    //3.stored in XOR variables these is the single element.
    public static int  single_No(int nums[],int n){
        int XOR = 0 ;
        for(int i = 0 ; i < n ; i ++){
            XOR^=nums[i];
        }
        return XOR;
    }
    public static void main(String args[]){
        int nums[]={1,2,3,3,1,4,5,4,5};
        int n = nums.length;
        System.out.println("The number appers at ones in arr is :"+single_No(nums,n));
    }
}
