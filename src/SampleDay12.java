import java.sql.SQLOutput;
import java.util.Scanner;

public class SampleDay12 {
    public  static void main(String args[]){

//        Scanner sc=new Scanner(System.in);
//        String name="Suyash";
//        String fullName="Suyash Pal";
//        String sent="My name is Suyash Pal";
//        System.out.println(name);
//        System.out.println(fullName);
//        System.out.println(sent);

//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter your name:");
//        String name= sc.nextLine();
//        System.out.println("Your name is "+name);
//        System.out.println("Size of string: "+name.length());

//        String name1="Suyash";
//        System.out.println(name1.charAt(2));



        // COMPARE TO
//        String name1="Hello";
//        String name2="Wello";      grather

//        String name1="Hello";      grather
//        String name2="Cello";

//        String name1="Hello";
//        String name2="hello";      grather

//        String name1="Hello";
//        String name2="aello";
//        if (name1.compareTo(name2)==0){
//            System.out.println("Equal");
//        }
//        else if (name1.compareTo(name2)<0) {
//            System.out.println("String 2 is grather");
//        }
//        else if (name1.compareTo(name2)>0) {
//            System.out.println("String 1 is grather");
//        }

         //  SUBSTRING
        String sent="My name is Suyash Pal";
        String name=sent.substring(11,17);
        String fullName=sent.substring(11,sent.length());

        System.out.println(name);
        System.out.println(fullName);

    }
}
