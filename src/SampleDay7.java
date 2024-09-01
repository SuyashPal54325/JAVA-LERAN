import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class SampleDay7 {

    // FUNCTION TO PRINT THE NAME OF USER
    public static  void printMyName(String name){
        System.out.println("Your name is "+name);
    }

    // FUNCTION ADDITION OF TWO NUMBER
    public static int sum(int a,int b){
        return a+b;
    }


    // FUNCTION MULTIPLICATION OF TWO NUMBER
    public static int mul(int a,int b){
        return a*b;
    }

    // FFUNCTION OF FACTORIAL OF NUMBER
    public static int printFact(int n){
            int fact=1;
            for (int i=1;i<=n;i++){
                fact=fact*i;
            }
            return fact;


    }

    public  static void main (String args[]){

        // PRINT THE NAME OF USER
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter your name :");
//        String inputName= sc.nextLine();
//        printMyName(inputName);


        // ADDITION OF TWO NUMBER
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the 1st number:");
//        int num1= sc.nextInt();
//        System.out.println("Enter the 2nd number:");
//        int num2= sc.nextInt();
//
//        System.out.println("Sum of Number :"+sum(num1,num2));


        // MULTIPLICATION OF TWO NUMBER
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the 1st number:");
//        int num1= sc.nextInt();
//        System.out.println("Enter the 2nd number:");
//        int num2= sc.nextInt();
//
//        System.out.println("Multiplication of Number :"+mul(num1,num2));


        // FACTORIAL OF NUMBER
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number :");
        int num= sc.nextInt();
        if (num<=0){
            System.out.println("INVALID NUMBER Please enter a positive number");
        }
        else {
            System.out.println("Factorail of Number :"+printFact(num));
        }

    }
}
