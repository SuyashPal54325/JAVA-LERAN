import java.sql.SQLOutput;
import java.util.Scanner;

public class SampleDay17 {
//    FUMCTION WAP TO PRINT NUMBER FROM 5 TO 1
    public static  void printNUm(int n){
        if (n==0){
            return;
        }
        System.out.print(n+" ");
        printNUm(n-1);
    }

    //    FUMCTION WAP TO PRINT NUMBER FROM 1 TO 5
    public static  void printNum(int n){
        if (n==0){
            return;
        }
        printNum(n-1);
        System.out.print(n+" ");
    }

//    FUNCTION TO PRINT SUM OF n NATURAL NUMBER
    public static int printSum(int n){
        if (n==1){
            return n;
        }
    return n+printSum(n-1);
    }

    // FUNCTION TO PRINT FACTORIAL A NUMBER
    public static int printfactorial(int n){
        if (n==1){
            return n;
        }
        return n*printfactorial(n-1);
    }

//    FUNCTION TO PRINT FABONACCI SERIES
    public static  void printfab(int a,int b,int n){
        if (n==0){
            return;
        }
        int c=a+b;
        System.out.print(" "+c);
        printfab(b,c,n-1);

    }

    //  FUNCTION TO PRINT X^n (STACK HEIGHT =n)
    public static int stckheight(int x,int n){
        if (n==0){
            return 1;
        }
        if (x==0)
            return 0;
        return x * stckheight(x,n-1);
    }

//  FUNCTION TO PRINT X^n (STACK HEIGHT =logn)
public static int calPow(int x,int n){
    if (n==0){
        return 1;
    }
    if (x==0)
        return 0;
    if (n%2==0){
        return calPow(x,n/2)*calPow(x,n/2);
    }
    else{
        return calPow(x,n/2)*calPow(x,n/2)*x;
    }
}

    public static void main(String args[]){
        // WAP TO PRINT NUMBER FROM 5 TO 1
//        int n=5;
//        printNUm(n);


        // WAP TO PRINT NUMBER FROM 5 TO 1
//        int n=5;
//        printNum(n);

        // WAP A PROGRAM TO PRINT SUM OF n NATURAL NUMBER
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int n=sc.nextInt();
//        System.out.println("Sum of n natural number :"+printSum(n));

        // WAP A PROGRAM TO PRINT FACTORIAL A NUMBER
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int n=sc.nextInt();
//        System.out.println("Factorail of a number :"+printfactorial(n));

        // WAP A PROGRAM TO PRINT FABONACCI SERIES
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int n=sc.nextInt();
//        int a=0;
//        int b=1;
//        if(n==0){
//            System.out.println("Fabonacci series does not exist PLEASE ENTER A POSITIVE NUMBER");
//        }
//        else if (n==1) {
//            System.out.println("Fabonacci series is 0");
//        }
//        else if (n==2) {
//            System.out.println("Fabonacci series is 0 1");
//        }
//        else{
//            System.out.print("Fabonacci series is 0 1");
//            printfab(a,b,n-2);
//        }

        // WAP A PROGRAM TO PRINT X^n (STACK HEIGHT =n)
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the value of x :");
//        int x=sc.nextInt();
//        System.out.println("Enter the value of n :");
//        int n=sc.nextInt();
//        System.out.println("Calculate "+stckheight(x,n));


        // WAP A PROGRAM TO PRINT X^n (STACK HEIGHT =logn)
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x :");
        int x=sc.nextInt();
        System.out.println("Enter the value of n :");
        int n=sc.nextInt();
        System.out.println("Calculate "+calPow(x,n));


    }
}
