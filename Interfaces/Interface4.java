package Interfaces;
interface ATM{
    void deposit();

}
interface ATM1 extends ATM{
    void withdraw();
}
class User implements ATM1{
    @Override
    public void deposit() {
    System.out.println("deposit your money");
    }

    @Override
    public void withdraw() {
    System.out.println("withdraw your money");
    }
}
public class Interface4 {
    public static void main(String[] args) {
        User u=new User();
        u.deposit();
        u.withdraw();
    }
}
