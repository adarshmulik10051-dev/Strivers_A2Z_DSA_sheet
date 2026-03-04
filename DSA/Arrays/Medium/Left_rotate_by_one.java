package DSA.Arrays.Medium;

public class Left_rotate_by_one {
    public static int [] left_rotate_by_one(int array[],int n){

        int temp = array[0];
        for(int i = 1 ; i < n ; i++){
            array[i-1]= array[i];
        }
        array[n-1]=temp;
        return array;
    }
    public static void print_arr(int array[],int n ){
        for(int i = 0 ; i< n ;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String args[]){
        int array[] = {1,2,3,4,5};
        int n = array.length;
        left_rotate_by_one(array,n);
        print_arr(array,n);

    }
}
