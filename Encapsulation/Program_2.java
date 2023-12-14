package Encapsulation;
class Hi{
    int Id;
    public void setId(int id){
        this.Id=id;
    }
    public int getId(){
        return Id;
    }
}
public class Program_2 {
    public static void main(String[] args) {
        Hi h=new Hi();
        h.setId(220);
        System.out.println(h.getId());
    }
}
