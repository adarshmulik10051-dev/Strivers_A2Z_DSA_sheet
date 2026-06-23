package DSA.Arrays.Easy;
public class Q5_LeftRotateByDPalces{

    public static void reverse (int arr[],int start, int end ){
            while(start<=end){
                int temp= arr[start];
                    arr[start]=arr[end];
                    arr[end]=temp;
                    start++;
                    end--;
            }
    }
    public static void left_rotate_by_D(int arr[],int n,int d){

        //approch:Based on observation
        //1.make revsese function
        //2.revese arr by 0 to d-1 place
        //3.reverse arr by d to n-1
        //4.reverse overall arr 0 to n
        
        d=d%n;
        reverse(arr, 0,d-1);
        reverse(arr, d,n-1 );
        reverse(arr, 0, n-1);

    }
     public static void printarr(int arr[],int n ){
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main (String args[]){
        int arr [] = {1,2,3,4,5,6};
        int n = arr.length;
        int d=3;
        left_rotate_by_D(arr, n, d);
        printarr(arr, n);

    }
}