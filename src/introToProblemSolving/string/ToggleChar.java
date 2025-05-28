package introToProblemSolving.string;

public class ToggleChar {

    public void toggleChar(char[] arr){
        for (int i = 0; i < arr.length; i++) {
            char x = arr[i];
            if (x >= 65 && x <= 90) { // Check for uppercase letters
                arr[i] = (char) (x + 32); // Convert to lowercase
            } else if (x >= 97 && x <= 122) { // Check for lowercase letters
                arr[i] = (char) (x - 32); // Convert to uppercase
            }
            // No change for non-alphabetic characters
        }
    }

    public  String toggleChar(String str){
        String result = "";

        for(int i=0 ; i < str.length() ; i++){
            char ch=str.charAt(i);
            if (ch >= 65 && ch <= 90) {
                ch = (char) (ch + 32); // Convert to lowercase
            } else if (ch >= 97 && ch <= 122) { // Check for lowercase letters
                ch = (char) (ch - 32); // Convert to uppercase
            }

            result += ch;

        }

        return result;
    }
}
