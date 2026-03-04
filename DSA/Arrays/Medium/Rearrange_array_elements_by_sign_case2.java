package DSA.Arrays.Medium;

public class  Rearrange_array_elements_by_sign_case2{
    public static void print(int arr[]){
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
    public static void rearrange_unequal(int arr[],int n ){
        // Step 1: Count positives & negatives
        int posCount = 0, negCount = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] > 0)
                posCount++;
            else
                negCount++;
        }

        int pos[]=new int [posCount];
        int neg[]=new int [negCount];
        int p_idx=0;
        int n_idx=0;
        for(int i = 0 ; i < n ; i++){//to devide and store positiv and negative
            if(arr[i]>0){
                pos[p_idx]=arr[i];
                p_idx++;
            }
            else{
                neg[n_idx]=arr[i];
                n_idx++;
            }
        }

        if(pos.length>neg.length){//now combining alernate pos - neg
            for(int i = 0 ; i < neg.length; i++){
                arr[i*2]=pos[i];
                arr[i*2+1]=neg[i];
            }
            int idx=neg.length*2;
            for(int i = neg.length;i<pos.length;i++){//remaining poasitve ele
                arr[idx]=pos[i];
                idx++;
            }

        }
        else{
            for(int i = 0 ; i < pos.length; i++){
                arr[i*2]=pos[i];
                arr[i*2+1]=neg[i];
            }
            int idx=pos.length*2;
            for(int i = pos.length;i<neg.length;i++){
                arr[idx]=neg[i];
                idx++;
            }

        }

    }

    public static void main (String args[]){
        int arr[]={-1,2,3,4,-3,1};
        int n = arr.length;
        rearrange_unequal(arr, n);
        print(arr);

    }
}
