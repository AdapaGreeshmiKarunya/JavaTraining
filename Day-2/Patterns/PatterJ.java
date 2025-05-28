public class PatterJ {
    public static void main(String[] args) {
        for(int row=0;row<7;row++)
        {
            for(int col=0;col<5;col++)
            {
                if(col==0 && row!=1 && row!=2 && row!=3 && row!=4 || col==1 && row!=1 && row!=2 && row!=3 && row!=4 && row!=5 || col==2 ||col==3 && row!=1 && row!=2 && row!=3 && row!=4 && row!=5 && row!=6 || col==4 && row!=1 && row!=2 && row!=3 && row!=4 && row!=5 && row!=6){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
