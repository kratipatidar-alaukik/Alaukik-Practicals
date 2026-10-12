package Day11;

public class TextProcessingUtility {


    void reverse(String str) {
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        System.out.println("Reversed text: " + rev);
    }

   
    void count(String str) {
        System.out.println("Character count: " + str.length());
    }

  
    void countwords(String str) {
        str = str.trim();

        int words = str.isEmpty() ? 0 : str.split("\\s+").length;

        System.out.println("Word count: " + words);
    }

    
    void palindrome(String str) {
        String text = str.replaceAll("\\s+", "").toLowerCase();
        String rev = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            rev = rev + text.charAt(i);
        }

        if (text.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }

    
    void removeDuplicates(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (result.indexOf(ch) == -1) {
                result = result + ch;
            }
        }

        System.out.println("Without duplicates: " + result);
    }

    public static void main(String[] args) {
        TextProcessingUtility obj = new TextProcessingUtility();

        String str = "madam";

        obj.reverse(str);
        obj.count(str);
        obj.countwords(str);
        obj.palindrome(str);
        obj.removeDuplicates(str);
    }
}
