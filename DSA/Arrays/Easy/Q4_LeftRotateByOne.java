package DSA.Arrays.Easy;

public class Q4_LeftRotateByOne{
    public static void LeftRotateByOne(int arr[],int n){
    //approch :o(n)
    //1.store first element of arr in temp
    //2.then iterate 1 to n and shift [i-1]=[i]
    //3.pushback temp in [n-1]
    //4.print arr 
    
        int temp = arr[0];
        for(int i = 1 ; i < n ; i ++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
    }


    public static void printarr(int arr[],int n){
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
         int arr [] = {1,2,3,4,5,6};
         int n = arr.length;
         LeftRotateByOne(arr,n);
         printarr(arr, n);
    }
}