package DSA.Arrays.Easy;

public class Q2RemoveDuplicates {
    //approch: two Pointers o(n)
    //1.set i =0 for the index of updated new array 
    //2.iterate &cheack arr[i]==aar[j] -->skip
    //3.if not--> arr[j] take infront i --> arr[i+1]
    //4.icrement pos of i
    //return i+1 for size of updated array 

    public static int remove_all_duplicate(int arr[],int n ){
       int i =0 ; 
       for(int j = 1 ; j < n ; j++){
        if(arr[i]!=arr[j]){
            arr[i+1]=arr[j];
            i++;
         }
       }
       return i+1;

    }
    public static void printarr(int arr[],int length){
        for(int i = 0 ; i < length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
         int arr []= {1,2,2,2,3,3,4,4,5,6};
        int n = arr.length;
        int length = remove_all_duplicate(arr, n);
        printarr(arr, length);
    }
    
}
