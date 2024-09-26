abstract class Animal{
   abstract public void walk();
   public void  eat(){
        System.out.println("Animal eats");
    }
    Animal(){
        System.out.println("You are animal");
    }
}
class Horse extends Animal{
    public void walk(){
        System.out.println("Walk on 4 legs");
    }
    Horse(){
        System.out.println("You are a horse");
    }
}
class chicken extends Animal{
    public void walk(){
        System.out.println("Walk on 2 legs");
    }
}
public class SampleDay24Abstraction {
    public static void main(String args[]){
       Horse h1=new Horse();
       h1.walk();
       h1.eat();
//       Animal ani=new Animal();

    }
}
