import java.util.Scanner;

public class SampleDay15 {

    public static int clearBit(int n,int p){
        int bitMask=1<<p;
        int notBitMask=~(bitMask);
        int newNumber=notBitMask  & n;
        return newNumber;

    }
    public static int setBit(int n,int p){
        int bitMask=1<<p;
        int newNumber=bitMask | n;
        return newNumber;
    }
    public static void getBit(int n,int p){
        int bitMask=1<<p;
        if ((bitMask & n)==0){
            System.out.println("Bit was 0");
        }
        else {
            System.out.println("Bit was 1");
        }
    }



    public static void main(String args[]){

        // FUNCTION CONCEPT

        // GET BIT
//        int num=5;
//        int pos=2;
//        getBit(num,pos);

        // SET BIT
//        int num=5;
//        int pos=1;
//        int nb=setBit(num,pos);
//        System.out.println(nb);

        // CLEAR BIT
//        int num=5;
//        int pos=2;
//        int nb=clearBit(num,pos);
//        System.out.println(nb);



  // NORMAL CONCEPT

        // GET BIT
//        int n=5;
//        int pos=2;
//        int bitMask=1<<pos;
//        if ((bitMask & n)==0){
//            System.out.println("Bit was 0");
//        }
//        else {
//            System.out.println("Bit was 1");
//        }

        // SET BIT
//        int num=5;
//        int pos=1;
//        int bitMask=1<<pos;
//        int newNumber=bitMask | n;
//        System.out.println(newNumber);


        // CLEAR BIT
//        int n=5;
//        int pos=2;
//        int bitMask=1<<pos;
//        int notBitMask=~(bitMask);
//
//        int newNumber=notBitMask & n;
//        System.out.println(newNumber);





    // UPDATE BIT
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n= sc.nextInt();
        System.out.println("Enter the position :");
        int pos=sc.nextInt();
        System.out.println("Enter the operation value \n PRESS 1 FOR CHNAGE BIT IN TO 1 \n PRESS 0 FOR CHNAGE BIT IN TO 0  :");
        int input= sc.nextInt();

        if (input==1){
            System.out.println(setBit(n,pos));
        }
        else {
            System.out.println( clearBit(n,pos));
        }

    }
}
