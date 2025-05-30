public class PatternNum6 {
    public static void main(String[] args) {
        int n = 5;
        int k = 1;
        for (int i = 1; i <= n; i++) {
            k=k+(i-1);
            int current=k+(i-1);
            for(int j = 1; j <= i; j++) {
                System.out.print(current-- + " ");
            }
            System.out.println();
        }
    }
}