package Polymorphism;

public class Over_Loading_3 {
void me(String s,int i){
    System.out.println("name : "+s+"id : "+i);
    }
    void me(String r,int j,int k){
    System.out.println("name : "+r+" ; id : "+j+" ; Age : "+k);
    }

    public static void main(String[] args) {
        Over_Loading_3 ol3=new Over_Loading_3();
        ol3.me("Sri",546);
        ol3.me("Rajan",873256,20);
    }

}
