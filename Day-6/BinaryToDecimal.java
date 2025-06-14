public class BinaryToDecimal {
    public static void main(String[] args) {
        String binary = "0001";
        int decimal=0;
        int power=0;
        for(int i = binary.length()-1;i >= 0; i--) {
            char bit = binary.charAt(i);
            if (bit == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }
        System.out.println("Decimal value of binary "+binary+" is: "+decimal);
    }
}