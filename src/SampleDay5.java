public class SampleDay5 {
    public static  void main(String args[]){


//        int n=4;
//        for (int i=0;i<4;i++){
//            for (int j=0;j<5;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        int n=4;
//        for (int i=0;i<r;i++){
//            for (int j=0;j<5;j++){
//                if (i==0||i==3||j==0||j==4){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

//        int r=4;
//        for (int i=0;i<r;i++){
//            for (int j=0;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        int r=4;
//        for (int i=r;i>=1;i--){
//            for (int j=i;j>=1;j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        int r=4;
//        for (int i=1;i<=r;i++){
//
//            for (int k=(r-i);k>=1;k--){
//                System.out.print(" ");
//            }
//            for (int j=i;j>=1;j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }



//        int r=5;
//        for (int i=1;i<=r;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

//        int r=5;
//        for (int i=1;i<=r;i++){
//            for (int j=1;j<=(r-i)+1;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }


//        int r=5;
//        int num=1;
//        for (int i=1;i<=r;i++){
//            for (int j=i;j>=1;j--){
//                System.out.print(num+" ");
//                num++;
//            }
//            System.out.println();
//        }


        int r=5;
        for (int i=1;i<=r;i++){
            for (int j=1;j<=i;j++){
                if ((i+j)%2==0){
                    System.out.print("1 ");
                }
                else {
                    System.out.print("0 ");
                }

            }
            System.out.println();
            }


    }
}
