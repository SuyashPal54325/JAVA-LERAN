import java.util.Scanner;

public class SampleDay2 {
    public static void main(String[] args) {

//        System.out.println("*\n**\n***\n****");
//        System.out.println("*");
//        System.out.println("**");
//        System.out.println("***");
//        System.out.println("****");

//        Data types
//        String name="Suyash Pal";
//        int age =12;
//        double price=25.25;
//        int a=25;
//        int b=10;
//
//        b=20;
//        name="ironman";    // Value of string and integers can be changed


//        int a=10;
//        int b=25;
//        int sum=a+b;
//        int mul=a*b;
//        int diff=b-a;
//        System.out.println(sum);
//        System.out.println(mul);
//        System.out.println(diff);

//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter your name:");
//        String name=sc.next();

        // nextInt();  for input of integers
        // nextFloat();  for input of floats
//        String name=sc.nextLine();
//        System.out.println(name);

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1 value:");
        int a=sc.nextInt();
        System.out.println("Enter the 2 value:");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("Sum of number :"+sum);



    }
}