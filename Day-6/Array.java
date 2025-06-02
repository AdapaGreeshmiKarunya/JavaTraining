import java.util.Arrays;
import java.util.Scanner;
public class Array{
    public static void main(String[] args) {
        /* int size=217836547;
        int a[]=new int[size];
        System.out.println(a.length);
        a[0]=1; */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int a[] = new int[size];
        for (int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
    }
}