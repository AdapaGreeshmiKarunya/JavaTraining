public class PatternNum7 {
    public static void main(String[] args) {
        int n=10;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }
}