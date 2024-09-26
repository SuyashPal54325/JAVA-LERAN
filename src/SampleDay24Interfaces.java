interface  Animals{
    int eyes=2;
    public void walk();

}
interface Herbivores{

}
class Horses implements Animals,Herbivores{
    public void walk(){
        System.out.println("Walk 4");
    }
}

public class SampleDay24Interfaces {
    public static void main(String args[]){
        Horses h1=new Horses();
        h1.walk();
    }
}
