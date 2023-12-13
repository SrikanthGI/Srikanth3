package Polymorphism;


    class Z
    {
        public void run(){
            System.out.println("A class Method");
        }
    }

public class Over_Riding_3 extends Z{
    public void run(){
        System.out.println("B class Method");
    }
        public static void main(String args[])
        {
          Over_Riding_3 o=new Over_Riding_3();
          o.run();

        }
    }

