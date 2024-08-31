import java.util.Scanner;

public class SampleDay3 {
    public static  void main(String args[]){

//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter your age:");
//        int age= sc.nextInt();
//        if(age>=18){
//            System.out.println("ADULT");
//        }
//        else {
//            System.out.println("NOT ADULT");
//        }




//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter your NUMBER:");
//        int num= sc.nextInt();
//        if (num%2==0){
//            System.out.println("Even");
//        }
//        else {
//            System.out.println("Odd");
//        }




//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the value of a:");
//        int a=sc.nextInt();
//        System.out.println("Enter the value of b:");
//        int b= sc.nextInt();
        // NESTED CONCEPT
//        if (a==b){
//            System.out.println("a=b");
//        }
//        else {
//            if (a>b){
//                System.out.println("a is grather than b");
//            }
//            else {
//                System.out.println("a is less than b");
//            }
//        }

        // CONDITIONAL CONCEPT
//        if (a==b){
//            System.out.println("a=b");
//        }
//        else if (a>b) {
//            System.out.println("a is grather than b");
//        }
//        else {
//                System.out.println("a is less than b");//  }




    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the button number:");
        int btn=sc.nextInt();

        // CONDITIONBAL CONCEPT
//        if (btn==1){
//            System.out.println("Hello");
//        }
//        else if (btn==2) {
//            System.out.println("Namaste");
//        }
//        else if (btn==3) {
//            System.out.println("Bonjour");
//        }
//        else{
//            System.out.println("invalid button");
//        }


        // SWITCH COMCEPT
        switch (btn){
            case 1:{
                System.out.println("Hello");
                break;
            }
            case 2:{
                System.out.println("Namaste");
                break;
            }
            case 3:{
                System.out.println("Bonjour");
                break;
            }
            default :{
                System.out.println("Inalid");
            }
        }




}
}

