import java.util.Scanner;

public class SampleDay8 {

    //  FUNCTION PROGRAM TO PRINT AVERAGE OF 3 NUMBER
    public static float printAvg(float n1,float n2,float n3){
        float avg=(n1+n2+n3)/3;
        return avg;
    }

    public  static void sumOdd(int n){
        int count=0;
    for (int i=1;i<=n;i++){
        if (i%2!=0){
            count=count+i;
        }
    }
        System.out.println("Sum of all ODD number present between 1 and "+n+" is "+count);
    }


    //  FUNCTION TO FIND GRATEST NUMBER
    public  static void gratest(int a,int b){
        if (a==b)
            System.out.println(a+" is equal to "+b);
        else {
            if (a<b){
                System.out.println(a+" is less than "+b);
            }
            else {
                System.out.println(a+" is grather than "+b);
            }
        }
    }


    //    FUNCTION OF  CIRCUMFERENCE OF CIRCLE
    public static double Circumference(double r){
        double circum=2*Math.PI*r;
        return circum;
    }
    // FUNCTION OF  AREA CIRCUMFERENCE OF CIRCLE
    public static double Area(double r){
        double ar=Math.PI*Math.pow(r,2);
        return ar;
    }

        // FUNCTION ELIGIBILITY OF A PERSON TO VOTE
    public static void Vote(int a){
        if (a>=18)
            System.out.println("Person is able to vote");
        else
            System.out.println("Person is not able to vote");

    }


    // FUNCTION PRINT THE COUNT OF THE POSITIVE ,NEGATIVE , ZERO
        public static void showAllCount(int n){
        int postiveCount=0;
            int negativeCount=0;
            int zeroCount=0;
        for (int i=1;i<=n;i++){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your number:");
            int num= sc.nextInt();
            if (num>0){
                postiveCount++;
            }
            else if (num<0){
                negativeCount++;
            }
            else{
                zeroCount++;
            }
        }
            System.out.println("The number of zero entered is :"+zeroCount);
            System.out.println("The number of positive entered is :"+postiveCount);
            System.out.println("The number of negative entered is :"+negativeCount);
        }



    // FUNCTION OF POWER OF A GIVEN VALUE
        public static double printPower(double x,double n){
            double val=Math.pow(x,n);
            return val;
        }


        // FUNCTION  OF  FABNOCCI SERIES
    public  static void Fab(int n){
        if (n==1){
            System.out.println("Fabonaci series: 0");
        }

        else{
            System.out.print("Fabonaci series: 0 1 ");
            int n1 = 0;
            int n2 = 1;
            for (int i = 1; i <= n - 2; i++) {
                int next = n1 + n2;
                System.out.print(next + " ");
                n1 = n2;
                n2 = next;
            }
        }

    }


    public  static int GCD(int n1,int n2){
        while (n1%n2!=0){
            int rem=n1%n2;
            n2=rem;
            n1=n2;
        }
        return n2;
    }


    public static void main(String args[]){


        //  PROGRAM TO PRINT AVERAGE OF 3 NUMBER
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter your 1st number;");
//        float num1= sc.nextFloat();
//        System.out.println("Enter your 2nd number;");
//        float num2= sc.nextFloat();
//        System.out.println("Enter your 3rd number;");
//        float num3= sc.nextFloat();
//        System.out.println("Avrrage of number :"+printAvg(num1,num2,num3));


//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the value of 'n':");
//        int num=sc.nextInt();
//        sumOdd(num);


        // PROGRAM TO FIND GRATEST NUMBER
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the 1st value:");
//        int num1=sc.nextInt();
//        System.out.println("Enter the 2nd value:");
//        int num2=sc.nextInt();
//        gratest(num1,num2);

            // AREA AND CIRCUMFERENCE OF CIRCLE
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the RADIUS  of circle:");
//        double radius=sc.nextDouble();
//        System.out.println("Circumference of circle :"+Circumference(radius));
//        System.out.println("Area of circle :"+Area(radius));


        // ELIGIBILITY OF A PERSON TO VOTE
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the AGE of the person:");
//        int age=sc.nextInt();
//        Vote(age);


        // PRINT THE COUNT OF THE POSITIVE ,NEGATIVE , ZERO
//        Scanner sc=new Scanner(System.in);
//            System.out.println("How many time you want to enter the number:");
//            int n=sc.nextInt();
//            showAllCount(n);

        // POWER OF A GIVEN VALUE
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the value of 'x' :");
//        double x= sc.nextDouble();
//        System.out.println("Enter the value of 'n' :");
//        double n= sc.nextDouble();
//
//        System.out.println("The value x to the power n is :"+ printPower(x,n));

        // FABNOCCI SERIES
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the value of N YOU want to print the series :");
//        int n= sc.nextInt();
//        Fab(n);


        // GCD OF TWO NUMBER
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your 1st number:");
        int n1= sc.nextInt();
        System.out.println("Enter your 2nd number:");
        int n2= sc.nextInt();

        System.out.println("GCD of "+n1+" and "+n2+" is "+GCD(n1,n2));

    }
}
