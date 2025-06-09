package tamilnadu.chennai;

public class Office {
    public static void main(String[] args) {
        Office office=new Office();
        office.work();
    }
    public void work(){
        System.out.println("Working in the office");
    }
    public void wfh(){
        System.out.println("Working from home");
    }
    void recruit(){
        System.out.println("Recruiting new employees");
    }
    private void do_business_Plan()
    {
        System.out.println("planning....");
    }
}