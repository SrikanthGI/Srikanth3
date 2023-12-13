package Inheritance;
class Bank2
{
    String AcName="Rohan";
    int acNo=89898989;
    double avabal=100;
    public void details()
    {
        System.out.println("Acc name:"+AcName+"\n Accno :"+acNo);
    }
}
class Deposit2 extends Bank2
{
    double depamt=100;
    public void depamt1()
    {
        System.out.println("Deposit amt : "+depamt);
        avabal=avabal+depamt;
        System.out.println("Total Ava bal is:"+avabal);
    }
}
class Withdrawl2 extends Bank2

        {
        double amt=100;
public void withamt()
        {
        if(amt>avabal)
        {
        System.out.println("You cannot withdrawl‐balance exceeds");
        }
        else{
        System.out.println("Collect Amount");
        }
        }}


public class Hierarical_3 {
    public static void main(String args[])
    {
        System.out.println("Deposit process");
        Deposit2 s1=new Deposit2();
        s1.details();
        s1.depamt1();
        System.out.println("Withdrawl Process");
        Withdrawl2 d1=new Withdrawl2();
        d1.details();
        d1.withamt();
    }
}
