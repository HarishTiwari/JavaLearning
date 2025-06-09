package test;


//String s1 = "[()]{}{[()()]()}"; -> Balanced
//String s2 = "{([]}"; -> Not balanced
public class Test {

    public static void main(String[] args) {

        String s1 = "[()]{}{[()()]()}"; // balace
        String s2 = "{([]}"; // unbalance

       boolean isValid = isBalanced(s2);
        System.out.println(isValid);

    }

    public static boolean isBalanced(String str){
        StringBuilder s = new StringBuilder();

        for(char ch : str.toCharArray()){
            if(ch == '(' || ch =='{' || ch == '['){
                s.append(ch);
            }else{// },) , ]
                if(s.length()==0) return false;

                if(ch==')' && s.charAt(s.length()-1) != '(' || ch=='}' && s.charAt(s.length()-1) != '{' || ch==']' && s.charAt(s.length() -1) != '[') {
                    return false;
                }
                s.deleteCharAt(s.length() -1);
            }
        }

        return s.length()==0;
    }
}
