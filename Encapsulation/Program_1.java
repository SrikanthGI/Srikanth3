package Encapsulation;
class First{
    int i;
   public void setId(int id){
        this.i=id;
    }
   public int getId(){
        return i;
    }
}
public class Program_1 {
    public static void main(String[] args) {
        First f=new First();
        f.setId(401);
        System.out.println(f.getId());
    }
}
