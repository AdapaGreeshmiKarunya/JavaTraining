import javax.swing.event.SwingPropertyChangeSupport;

public class Panagram {
    public static void main(String[] args) {
        String s1 = "the quick brown fox jumps over the lazy dog";
        System.out.println(isPanagram(s1));
    }
    public static boolean isPanagram(String s) {
        /*boolean[] alphabet = new boolean[26];
        int index = 0;
        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                index = c - 'a';
            } else if (c >= 'A' && c <= 'Z') {
                index = c - 'A';
            }
            alphabet[index] = true;
        }
        for (boolean b : alphabet) {
            if (!b) {
                return false;
            }
        }
        return true;*/
        s=s.toLowerCase();
        int hash[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (s.charAt(i)!= ' '){
                hash[s.charAt(i) - 'a']++;
            }
            }
        }
    }
    System.out.println(Arrays.toString(hash));
    for (int i = 0; i < 26; i++) {
            if (hash[i] == 0) {
                return false;
            }
        }
        return true;
    }
}