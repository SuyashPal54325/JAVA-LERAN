class Studenthh {
    String name;
    int age;

    public void displayInfo(String name) {
        System.out.println(name);
    }


    public void displayInfo(int age) {
        System.out.println("Your age is :"+age);
    }


    public void displayInfo(String name, int age) {
        System.out.println(name);
        System.out.println(age);
    }
}


public class Rough {
    public static void main(String args[]){
        Studenthh s1=new Studenthh();
        s1.name="GGFGyui";
        s1.age=56;
        s1.displayInfo(s1.age);
        
    }
}
