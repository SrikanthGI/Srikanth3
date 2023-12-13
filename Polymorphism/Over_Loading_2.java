package Polymorphism;

public class Over_Loading_2 {

    void StudentDetails(String name,String Study,int rollno){

        System.out.println("name : "+name+" ; education : "+Study+" ; ROllNo : "+rollno);
    }
    void StudentDetails(String name,String Study,int rollno,String branch){
        System.out.println("name : "+name+" ; education : "+Study+" ; ROllNo : "+rollno+" ; Branch : "+branch);
    }

    public static void main(String[] args) {
        Over_Loading_2 ol2=new Over_Loading_2();
        ol2.StudentDetails("RAM","Btech",16547);
        ol2.StudentDetails("Basha","Btech",54763,"ECE");
    }
}
