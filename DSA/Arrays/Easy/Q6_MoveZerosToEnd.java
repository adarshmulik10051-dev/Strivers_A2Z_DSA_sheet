package DSA.Arrays.Easy;

public class Q6_MoveZerosToEnd {
    public static void MoveZerosEnd(int arr[] , int n){
        int j = -1 ;
        for(int i = 0 ; i <n ; i ++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        for(int i = j+1 ; i < n ; i++){
            if(arr[i]!=0){
               int temp =  arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                j++;
            }
        }
    }
     public static void printarr(int arr[],int length){
        for(int i = 0 ; i < length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr []={1,0,2,3,0,0,0,4,3};
        int n = arr.length;
        MoveZerosEnd(arr,n);
        printarr(arr, n);
    }
}
