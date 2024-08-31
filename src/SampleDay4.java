import java.sql.SQLOutput;
import java.util.Scanner;

public class SampleDay4 {
    public static void main(String args[]){


//        // FOR LOOPS
//        for (int i=0;i<11;i++){
//            System.out.print(i+" ");
//        }
//        System.out.println();


//        // WHILE LOOP
//        int j=0;
//        while(j<11){
//            System.out.print(j+" ");
//            j++;
//        };
//        System.out.println();

//        // DO WHILE
//        int k=0;
//        do{
//            System.out.print(k+" ");
//            k++;
//        }while(k<11);


//        // QUESTION
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the value of 'N' you want to print the sum of natural number");
//        int n=sc.nextInt();
//        int sum=0;
//        for (int i=1;i<=n;i++){
//            sum=sum+i;
//        }
//        System.out.println("Sum of number: "+sum);
        //  QUESTION
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want to print the table:");
        int n= sc.nextInt();
        System.out.println("Table of "+n+" is :");
        for(int i=1;i<=10;i++){
            System.out.print(n*i+" ");
        }



        }
}
