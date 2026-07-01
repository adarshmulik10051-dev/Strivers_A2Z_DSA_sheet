package DSA.Strings;
import java.util.*;
public class Q4_LongestCommonPreifix {
    public static String LongestCommonPreifix(String str[],int n){
        //approch:o(n)

        //1.first sort the arr 
        //2.compare 1 and last string  size is first string
        //3.match ch add to prefix thne retrun overall pre
        //4. no match return  prefix.toString();or break also 
        Arrays.sort(str);
        String str1 =str[0];
        String str2 = str[n-1];
        StringBuilder prefix = new StringBuilder();
        

        for(int i = 0 ; i < str1.length() ; i ++ ){
            if(str1.charAt(i)==str2.charAt(i)){
                prefix.append(str1.charAt(i));
            }else{
                break;  
            }

        }
        return prefix.toString();
    }
    public static void main (String args[]){
        String str[] = {"flowers" , "flow" , "fly", "flight" };
        int n= str.length;
        System.out.println( LongestCommonPreifix(str, n))  ; 
     }
    
}
