public class ReversePalindrome {
    /*public static void main(String[] args) {
        String s = "A MAN , A PLAN , A CANAL: PANAMA";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        for(int i = 0, j = s.length() - 1; i < j; i++, j--) {
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) i++;
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) j--;
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }
        }
        return true;
    }*/
    //REVERSE WITH STRING PALINDROME
    public static void main(String[] args) {
        String s = "A MAN , A PLAN , A CANAL: PANAMA";
        System.out.println(isPalindrome(s));

    }
    public static boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder sb = new StringBuilder(cleaned);
        return cleaned.equals(sb.reverse().toString());
    }
}