package Inheritance;
class Bank1{

    int accno=23456;
    String accname="John";
    double availbal=2000;
    public void details()
    {
        System.out.println("Acc name : "+accname+" ; Acc no : "+accno);
    }
}
class Deposit1 extends Bank1
{
    double amt=6000.5;
    public void deposit()
    {
        availbal = availbal + amt;
        System.out.println("Amount deposited : "+availbal);

    }
}
class Withdrawl extends Deposit1 {
    double wamt = 3000;

    public void witamt() {
        availbal = availbal - wamt;
        System.out.println("Withdrawl amount : " + availbal);
    }

}
public class Multi_level_3 {
    public static void main(String args[]) {
        Withdrawl w1 = new Withdrawl();
        w1.details();
        w1.deposit();
        w1.witamt();
    }
}

