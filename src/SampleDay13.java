public class SampleDay13 {
    public  static void main(String args[]){
//    StringBuilder sb=new StringBuilder("Suyash Pal Suryavanshi");

    // CHARAT
//        System.out.println(sb.charAt(0));



        // SETCHAT AT
//        sb.setCharAt(0,'A');
//        System.out.println(sb);

        // INSERT
//        sb.insert(0,'A');
//        System.out.println(sb);

        //DELECT
//        sb.delete(0,1);
//        System.out.println(sb);

        // APEND
//         sb.append(" Thakur");
//        System.out.println(sb);

//        System.out.println(sb);
        StringBuilder sb=new StringBuilder("Hello");
        for (int i=0;i<sb.length()/2;i++){
            int frontIndex=i;
            int backIndex=sb.length()-1-i;

            char frontChar=sb.charAt(frontIndex);
            char backChar=sb.charAt(backIndex);

            sb.setCharAt(frontIndex,backChar);
            sb.setCharAt(backIndex,frontChar);
        }
        System.out.println(sb);

    }
}
