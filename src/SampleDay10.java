import java.util.Scanner;
public class SampleDay10 {

    // FUNCTION PROGRAM OF LINEAR SEARCH USING
    public static int linear(int a[],int x) {
        for (int i=0;i<a.length;i++){
            if (a[i]==x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){

//        int marks[]=new int[3];
//        marks[0]=29;
//        marks[1]=20;
//        marks[2]=25;
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        System.out.println("Size of array is :"+marks.length);
//        for (int i=0;i<marks.length;i++){
//            System.out.println(marks[i]);
//        }

//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the size of array:");
//        int size= sc.nextInt();
//        int arr[]=new int[size];
//        for (int i=0;i<arr.length;i++){
//            System.out.println("Enter the element :");
//            arr[i]= sc.nextInt();
//        }
//        System.out.println("Array element is:");
//        for (int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }



        // PROGRAM OF LINEAR SEARCH
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the size of array:");
//        int size= sc.nextInt();
//        int arr[]=new int[size];
//        int index=-1;
//        for (int i=0;i<arr.length;i++){
//            System.out.println("Enter the element :");
//            arr[i]= sc.nextInt();
//        }
//        System.out.println("Enter the element 'X' you want to search:");
//        int x=sc.nextInt();
//        for (int i=0;i<arr.length;i++){
//            if (arr[i]==x){
//                index=i;
//                break;
//            }
//        }
//        if (index==-1){
//            System.out.println("Element is not found");
//        }
//        else {
//            System.out.println("Element is found at index: "+index);
//        }



        // PROGRAM OF LINEAR SEARCH USING FUNCTION
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size= sc.nextInt();
        int arr[]=new int[size];
        for (int i=0;i<arr.length;i++){
            System.out.println("Enter the element :");
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the element 'X' you want to search:");
        int x=sc.nextInt();
        int index=linear(arr,x);

        if (index==-1){
            System.out.println("Element is not found");
        }
        else {
            System.out.println("Element is found at index: " + index);
        }

    }
}
