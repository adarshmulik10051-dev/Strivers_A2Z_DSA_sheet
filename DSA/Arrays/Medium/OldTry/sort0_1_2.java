package DSA.Arrays.Medium.OldTry;

public class sort0_1_2 {
    public static void print_arr(int arr[]){
        for(int i = 0 ; i < arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
    public static void sort012(int arr[]){
        int low=0;
        int mid=0;
        int high=arr.length-1;

        while(mid<=high){
            if(arr[mid]==0){
                int temp = arr[low];
                arr[low]=arr[mid];
                arr[mid]= temp;
                mid++;
                low++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int temp = arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
    }
    public static void main(String args[]){
       int arr[]={0,1,1,0,1,2,2,0,0,0};
       sort012(arr);
       print_arr(arr);
    }
}
