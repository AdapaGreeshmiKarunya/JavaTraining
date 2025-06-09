import java.util.Scanner;
public class NumOfComma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        sc.close();
        int count = 0;
        for(int i =999;i<=n;i++){
            String s = String.valueOf(i);
            count = count + (s.length()-1)/3;
        }
        System.out.println(count);
    }
}