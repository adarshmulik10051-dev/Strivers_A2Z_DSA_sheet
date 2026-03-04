package DSA.Arrays.Medium;

public class Majority_element_in_array {
    public static int majority_element(int arr[],int n){
        int ele=arr[0];
        int count = 0;
        //applythe moon's voting algo

        for(int i = 0 ; i < n ; i++){
            //first step and when count is zero & give prsent arr[i] in ele place
            if(count ==0 ){
                ele=arr[i];
            }
            else if(ele==arr[i]){
                count++;
            }
            else{
                count--;
            }
        }
        // the loop used for element cheak & increas count in full array
        // cheak the stored element is maj element
        int cnt= 0;
        for(int i = 0 ; i < n ; i ++ ){
            if(arr[i]==ele){
                cnt++;
            }

            //return maj element
            if(cnt>n/2){
                return ele;
            }
        }
        
        // if no any maj element
        return -1;
    }
    public static void main(String args[]){
     int arr []= {7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5};
     int n = arr.length;
     int me=majority_element(arr,n);
     System.out.println("majority element present in array is : "+me);
    }
}
