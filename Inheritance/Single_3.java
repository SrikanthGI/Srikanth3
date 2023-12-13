package Inheritance;
class Bank{
    String AcName="Dev";
    int AcNo=383671;
    int avlBal=1000;
    void details(){
        System.out.println("Name : "+AcName+" ; Account no : "+AcNo);
    }
}
class Deposit extends Bank{
    double d=1093.2;
    void availablebal(){
        System.out.println("Balance : "+avlBal);
    }
}
public class Single_3 {
    public static void main(String[] args) {
        Deposit d=new Deposit();
        d.details();
        d.availablebal();
    }
}
