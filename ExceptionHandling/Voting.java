package ExceptionHandling;

import java.util.Scanner;

public class Voting {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the age");
            int age=sc.nextInt();
            if (age<18){
                throw new YoungAgeException("you cant vote");
            }
            else {
                System.out.println("you can vote");
            }
            System.out.println("Srikanth");
        }
    }



