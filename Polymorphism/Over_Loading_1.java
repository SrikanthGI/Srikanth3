package Polymorphism;

public class Over_Loading_1 {
    //method over loading

        void add(int a,int b){
            System.out.println(a+b);
        }
        void add(int a,int b,int c) {
            System.out.println(a + b + c);
        }

        public static void main(String[] args) {


            Over_Loading_1 ol = new Over_Loading_1();
            ol.add(2, 3);
            ol.add(3, 4, 5);
        }
    }

