public class Pattern11 {
    public static void main(String[] args) {
        int n= 5;
        for(int row=1;row<=n*2;row++){
            int totalCol=(row>n)?2*n-row:row;
            for (int col=1;col<=totalCol;col++){
                System.out.print("*"); 
            }
            System.out.println();
        }
    }
}