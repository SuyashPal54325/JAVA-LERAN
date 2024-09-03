
import java.util.Scanner;

public class SampleDay11 {
    public static void main(String args[]){


//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number of row:");
//        int r= sc.nextInt();
//        System.out.println("Enter the number of column:");
//        int c= sc.nextInt();
//        int arr[][]=new int[r][c];
//        for (int i=0;i<r;i++){
//            for (int j=0;j<c;j++){
//                System.out.println("Enter the element:");
//                arr[i][j]= sc.nextInt();
//            }
//        }
//        System.out.println("Element of array: ");
//        for (int i=0;i<r;i++){
//            for (int j=0;j<c;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }



        // LINEAR SEARCH PROGRAM IN 2-D ARRAY
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of row:");
        int r= sc.nextInt();
        System.out.println("Enter the number of column:");
        int c= sc.nextInt();
        int arr[][]=new int[r][c];
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
            System.out.println("Enter the element:");
                arr[i][j]= sc.nextInt();
            }
        }

        System.out.println("Element of array: ");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Enter the element you want to search ");
        int x=sc.nextInt();
        int indexRow=-1;
        int indexColumn=-1;

        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                if (arr[i][j]==x){
                    indexRow=i;
                    indexColumn=j;
                    break;
                }
            }
        }

        if (indexRow==-1&&indexColumn==-1){
            System.out.println("Element is not found");
        }
        else {
            System.out.println("Element is found at index "+"("+indexRow+","+indexColumn+")");
        }
    }
}
