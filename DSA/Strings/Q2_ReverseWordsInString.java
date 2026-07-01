
package DSA.Strings;
import java . util.*;


public class Q2_ReverseWordsInString {
    public static String revers_the_Strings(String str, int n ){
        StringBuilder result = new StringBuilder();
        int i = n-1;
       while(i>=0){

        while(i>=0&&str.charAt(i)==' '){//trim last spaces of str 
            i--;
        }
        if(i<0){//if outoff stringg  break
            break;
        }
        int j = i ;// get end of the word

        while(i >= 0 && str.charAt(i)!=' '){//find start of the word
            i--;
        }

       String word=str.substring(i+1,j+1);//get word

        if(n>0){//add the space if not empty
             result.append(" ");
        }
        result.append(word);//append the word

       }
       return result.toString();
        
    }
    public static void main(String args[]){
        String str = "Hello I Am Adarsh";
        int n = str.length();
       System.out.println( revers_the_Strings(str, n));
    }
}
