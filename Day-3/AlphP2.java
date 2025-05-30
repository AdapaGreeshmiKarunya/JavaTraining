public class AlphP2 {
    public static void main(String[] args) {
        int n = 5;
        char ch = 'a';
        boolean isLower;
        int count = 1;
        for (int i = 1; i <= n; i++) {
            isLower = (i % 2 != 0);
            for (int j = 1; j <= i; j++) {
                if (isLower) {
                    System.out.print(Character.toLowerCase(ch) + " ");
                } else {
                    System.out.print(Character.toUpperCase(ch) + " ");
                }
                ch++;
                isLower = !isLower;
            }
            System.out.println();
        }
    }
}