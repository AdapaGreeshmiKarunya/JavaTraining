public class StringBuffer {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.reverse();
        sb.append(" World");
        System.out.println(sb.toString());
    }
}