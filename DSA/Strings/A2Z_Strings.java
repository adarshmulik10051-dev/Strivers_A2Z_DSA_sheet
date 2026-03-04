package DSA.Strings;
import java .util.*;
public class A2Z_Strings {
    public static boolean is_anagrams(String s1 , String s2){
         if(s1.length()!=s2.length()){
             return false;
         }else{
             int count []= new int [26];

             for(int i = 0 ; i < s1.length(); i++){

                 count[s1.charAt(i)-'a']++;
             }
             for(int i = 0 ; i < s2.length();i++){

                 count[s2.charAt(i)-'a']--;

             }
             for(int i  = 0 ; i < 26; i++){
                 if(count[i]!=0){
                     return false;
                 }
             }
         }
         return true ;
    }
    public static boolean one_Stringrotationofanother(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }

            String add = str1+str2;
        return add.contains(str2);
    }
    public static String longest_coomen_prefix(String str[]){
        Arrays.sort(str);
         String s1 = str[0];
         String s2 = str[str.length-1];
         int i = 0 ;
         while(i<str.length){
             if(s1.charAt(i)==s2.charAt(i)){
                 i++;
             }else{
                 break;
             }
         }
         return i==0?"":s1.substring(0,i);
    }

    public static  String largest_odd_no(String num){
         for(int i  = num.length()-1; i>=0 ;i--){
             if((num.charAt(i)-0)%2==1){
                  return num.substring(0,i+1);
             }
         }
         return "";
    }
    public static void roman_to_integer(String roman) {
        HashMap<Character,Integer>hm = new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        int num = 0;
        for(int i = 0 ; i < roman.length()-1;i++){
            if(hm.get(roman.charAt(i))<hm.get(roman.charAt(i+1))){
                num-=hm.get(roman.charAt(i));
            }
            else{
                num+=hm.get(roman.charAt(i));
            }
        }
        num = num + hm.get(roman.charAt(roman.length()-1));
        System.out.println(num);

    }
    public static void main (String args[]){
//         1) cheak Anagrams
//        String s1 = "anagras";
//        String s2 = "nagarams";
//        System.out.println(is_anagrams(s1,s2));

//          2) String rotation of another String
//        String str1  = "abcd";
//        String str2 = "cdab";
//        System.out.println(one_Stringrotationofanother(str1,str2));

//        3) longest common prefix
//        String str[] ={"flower","flow","flight"};
//        System.out.println(longest_coomen_prefix(str));

//        4) largest odd number in String
//        String num = "256782";
//        System.out.println(largest_odd_no(num));

//       5)roman to integer
//        String roman ="DCCCXC";
//        roman_to_integer(roman);

    }

}
