package DSA.Arrays.Medium.OldTry;

public class Rearrange_array_elements_by_sign{
    public static void print_result(int result[]){
        for(int i = 0 ; i < result.length; i ++ ){
            System.out.print(result[i]+",");
        }
    }
    public static int [] Rearrange_array( int arr[],int n){//this will be take o(2n)
        int pos[]=new int [n/2];
        int neg[]=new int [n/2];
        int p_cnt=0;
        int n_cnt=0;
        for(int i = 0 ; i < n ; i ++ ){
            if(arr[i]>0){
                pos[p_cnt++]=arr[i];

            }else{
                neg[n_cnt++]=arr[i];
            }
        }
        int result[]=new int [n];
        for(int i=0; i < n/2 ; i++){
            result[i*2]=pos[i];
            result[i*2+1]=neg[i];
        }
        return result;

    }
    public static int [] optimal_rearrange(int arr[],int n){
        int result[]=new int [n];
        int pos_index=0;
        int neg_index=1;
        for(int i = 0 ; i < n ; i ++ ){
            if(arr[i]<0){
                result[neg_index]=arr[i];
                neg_index+=2;

            }else{
                result[pos_index]=arr[i];
                pos_index+=2;

            }

        }
        return result;
    }
    public static void main (String args[]){
        int arr[]={1, -1, -3, -4, 2, 3};
        int n = arr.length;
//        int result[] = Rearrange_array(arr, n);
        int result[] = optimal_rearrange(arr, n);
        print_result(result);
    }
}
