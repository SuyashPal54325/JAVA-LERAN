public class SampleDay6 {
    public static  void main(String args[]){


        // QUESTION
//        int r=4;
//        for (int i=1;i<=r;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//        for (int k=2*(r-i);k>=1;k--){
//            System.out.print(" ");
//        }
//        for (int l=1;l<=i;l++){
//            System.out.print("*");
//        }
//            System.out.println();
//        }
//
//        for (int i=r;i>=1;i--){
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            for (int k=2*(r-i);k>=1;k--){
//                System.out.print(" ");
//            }
//            for (int l=1;l<=i;l++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }




//        int r=5;
//        for (int i=1;i<=r;i++){
//            for (int j=(r-i);j>=1;j--){
//                System.out.print(" ");
//            }
//            for (int k=1;k<=r;k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }




//        int r=5;
//        for (int i=r;i>=1;i--){
//            for (int j=(r-i);j>=1;j--){
//                System.out.print(" ");
//        }
//            for (int k=1;k<=r;k++){
//                System.out.print("*");
//            }
//            System.out.println();
//    }


//        int r=5;
//        for (int i=1;i<=r;i++){
//            for (int j=(r-i);j>=1;j--){
//                System.out.print(" ");
//            }
//            for (int k=1;k<=i;k++){
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }


//        int r=5;
//        for (int i=1;i<=r;i++){
//            for (int j=(r-i);j>=1;j--){
//                System.out.print(" ");
//            }
//            for (int k=i;k>=1;k--) {
//                System.out.print(k);
//            }
//            for (int l=2;l<=i;l++){
//                System.out.print(l);
//            }
//
//            System.out.println();
//        }



//        int r=5;
//        for (int i=1;i<=r;i++){
//            for (int j=(r-i);j>=1;j--){
//                System.out.print(" ");
//            }
//            for (int k=i;k>=1;k--) {
//                System.out.print(k);
//            }
//            for (int l=1;l<=i;l++){
//                System.out.print(l);
//            }
//
//            System.out.println();
//        }


        int r=4;
        for (int i=1;i<=r;i++){
            for (int j=(r-i);j>=1;j--){
                System.out.print(" ");
            }
            for (int k=(2*i-1);k>=1;k--){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=r;i>=1;i--){
            for (int j=(r-i);j>=1;j--){
                System.out.print(" ");
            }
            for (int k=(2*i-1);k>=1;k--){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
