package DSA.Arrays.Easy;

public class Q3CheackArrayIsSorted {
    public static boolean isSorted(int arr[],int n){
        //approach :o(n);
        //1.traverse and cheak  i > i-1 ? fasle :true 
        //2. the cdn is based on asending or decendind cheak array 
        
        for(int i = 0 ; i < n-1 ; i ++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
  public static void main(String[] args) {
    int arr [] = {1,2,3,4,5,6};
    int n = arr.length;
    System.out.println("array is sorted:"+isSorted(arr, n));
  }  
}
