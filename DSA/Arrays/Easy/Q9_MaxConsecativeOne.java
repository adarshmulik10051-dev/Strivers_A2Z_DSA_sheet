package DSA.Arrays.Easy;
public class Q9_MaxConsecativeOne{

    //Approch
    //1.intialize count variable 
    //2.itrate overall arr 
    //3.cheack if ele==1 yes--> then increse count
    //4. if-->no counter become 0
    //5.before the count =0 cheak and assign max vaule 
    
    public static int MaxConsecativeOnes(int arr [],int n){
        int count = 0 ;
        int max =0;
        for(int i = 0 ; i < n ; i++){
            if(arr[i]==1){
                count++;
            }
            else{
                max = Math.max(count,max);
                count=0;
            }
           
        }
        
        return max ;
    } 
    public static void main(String args[]){
        int arr[]= {1,0,0,0,1,1,1,1,1,2,3,4,1,1};
        int n= arr.length;
        System.out.println(MaxConsecativeOnes(arr, n));
    }
}