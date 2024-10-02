// ARRAY LIST
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SampleDay25 {
    public static void main(String args[]){
        // Integer -- If we want ot create a object of integer class then we have to use Integer class,
        // Float-- If we want ot create a object of integer class then we have to use Float class,
        // Boolean-- If we want ot create a object of integer class then we have to use Boolean class,
        // String-- If we want ot create a object of integer class then we have to use String class

    ArrayList<Integer> list=new ArrayList<Integer>();
//    ArrayList<String> liststr= new ArrayList<String>();
//        ArrayList<Boolean> boole= new ArrayList<Boolean>();


        // Addition of element in the arraylist
        list.add(0);
        list.add(2);
        list.add(3);
        list.add(5);
        System.out.println("Your list is "+list);

        // get element
        int element=list.get(1);
        System.out.println("Your element is "+ element);

        // Addition of element in between in the arraylist
        list.add(3,4);
        System.out.println("Your updated list is "+list);
        list.add(1,1);
        System.out.println("Your updated list is "+list);

        // Set element at a given index
        list.set(0,-1);
        System.out.println();
        System.out.println("Your updated list is "+list);

        // Delet element at a given index
        list.remove(0);
        System.out.println("Your updated list is "+list);

        // Find the size of Array list
        int size= list.size();
        System.out.println("SIZE OF  ARRAY LIST "+size);

        // Loops
        for (int i=0;i< list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        // Sorting

        list.add(3,45);
        System.out.println("Your updated list is "+list);
        Collections.sort(list);
        System.out.println("Your updated list is "+list);
    }
}
