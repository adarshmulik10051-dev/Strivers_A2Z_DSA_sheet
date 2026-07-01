package DSA.Strings;

public class Q3_LargestOddSubString {

    public static String laongest_OddOsubstring(String str,int n){

        //aprroch:0(n)
        //1.find first odd no from right of str
        //2.stroed in idx break ;
        //cheack i ==-1 return""
        //3.skip leadinng  zeros using while  i 
        //4.return substring from i to idx+1 
        //why from right if you start trim from left no become smalle smaller 
       
       int idx=-1;
       int i = 0;
        for( i = n-1; i >= 0 ; i --){
            if((str.charAt(i)-'0')%2==1){
               idx=i;
               break;
            }
        }
        if(idx==-1){
            return "";
        }

        i=0;
        while(i<=idx&&str.charAt(i)=='0'){
            i++;
        }
        return str.substring(i,idx+1);//+1beacause end is excluid inn sub func;
    }
    public static void main (String args[]){
        String str = "136470";
        int n = str.length();
        System.out.println("the largest odd substring is:"+laongest_OddOsubstring(str, n));

    }
    
}
