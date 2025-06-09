package emp;

public class Palindrom {

    public static void main(String[] args) {
        String input1 = "121";
        String input2 = "345";

        boolean isPalindrome = isPalindrom(input2);
        System.out.println(isPalindrome);
    }

    public static boolean isPalindrom(String str){
        if(str == null) return false;

        String temp = str.replaceAll("\\s+","").toLowerCase();
        return temp.equals(new StringBuilder(temp).reverse().toString());
    }
}
