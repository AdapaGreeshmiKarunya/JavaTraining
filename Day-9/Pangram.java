/*A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

 

Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
Example 2:

Input: sentence = "leetcode"
Output: false
 

Constraints:

1 <= sentence.length <= 1000
sentence consists of lowercase English letters.*/

public class Pangram {
    public static void main(String[] args) {
        String s1 = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(isPangram(s1));
    }
    public static boolean isPangram(String s) {
        int[] hash = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ') {
                hash[c - 'a']++;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (hash[i] == 0) {
                return false;
            }
        }
        return true;
    }
}
