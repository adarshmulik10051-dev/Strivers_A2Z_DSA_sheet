package DSA.Strings;

public class Q1_RemoveOutermostParentheses {
    public static String RemoveOutermostParentheses(String str ){
       
        int level = 0 ; 

        StringBuilder result = new StringBuilder();
       for(int i = 0 ; i < str.length(); i++){
        if(str.charAt(i)=='('){
            if(level>0){
                result.append(str.charAt(i));
            }
            level++;
        }else if(str.charAt(i)==')'){
            level--;
            if(level>0){
                result.append(str.charAt(i));
            }
        }
       }
       return result.toString();


    }
    public static void main (String args[]){
        String str = "(()())(())";
        System.out.println(RemoveOutermostParentheses(str));
    }
    
}
