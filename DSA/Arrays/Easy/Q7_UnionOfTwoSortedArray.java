package DSA.Arrays.Easy;
public class Q7_UnionOfTwoSortedArray {
    public static int [] union_of_two_Arr(int[] arr1,int[]arr2){
        //approch: Two Pointer :
        //1.intialize pointers
        //2.comapere both arrays
        //3.Three cdn are obtain  (for all cheak k-1 cdn also k==0 cdn) for all 
        //3.1 arr1==arr2-->union[k]=anyone -->both incremaneti,j&k
        //3.2 arr1<arr2 -->union[k]=i-->increment i,k
        //3.3 arr1>arr2-->union[k]=j-->increment j,k
        //4.asiign all remaining  element in arr1 into union; 
        //5.asiign all remaining  element in arr2 into union; 
        //6.make new result arr= union arr of size k reutrn it 
        int n1= arr1.length;
        int n2= arr2.length;
        int j = 0 ; 
        int i = 0 ; 
        int k = 0 ;
        int union []=new int [n1+n2];

        while(i < n1 && j < n2){
            if(arr1[i]==arr2[j]){
                if(k==0||union[k-1]!=arr1[i]){
                    union[k++]=arr1[i];
                }
                i++;
                j++;
            }
           else if(arr1[i]<arr2[j]){
               if(k==0||union[k-1]!=arr1[i]){
                union[k++]=arr1[i];
               } 
               i++;
            }
            else{
                if(k==0||union[k-1]!=arr2[j]){
                 union[k++]=arr2[j];
               } 
               j++;
            }
        }
        while(i<n1){
            if(k==0||union[k-1]!=arr1[i]){
                 union[k++]=arr1[i++];
                }
           
        }
        while(j<n2){
            if(k==0||union[k-1]!=arr2[j]){
            union[k++]=arr2[j++];
            }
        }

        int result[]= new int[k];
        for(int x= 0 ; x < k ; x++){
            result[x]=union[x];
        }
        return result ;
    }
      public static void printarr(int union[]){
        int length = union.length;
        for(int i = 0 ; i < length ; i++){
            System.out.print(union[i]+" ");
        }
    }
    public static void main (String args[]){
        int arr1[]={1,2,3,4,5,6};
        int arr2[]={2,3,4,4,5,6};
       int[] union=  union_of_two_Arr(arr1, arr2); 
        printarr(union);

    }
    
}
