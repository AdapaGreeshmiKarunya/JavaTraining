import java.util.Scanner;
public class PrintFromMiddle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        sc.close();
        int len = s.length();
        int mid = len / 2;
        StringBuilder sb = new StringBuilder();
        for ( int i = mid ; i < s.length(); i++){
            sb.append(s.charAt(i));
            System.out.println(sb);
        }
        for ( int i = 0 ; i < mid; i++){
            sb.append(s.charAt(i));
            System.out.println(sb);
        }
    }
}