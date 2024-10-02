class  Pen{
    String color;
    String type;
    public void write(){
        System.out.println("Writting Essay");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;

//    public  void printInfo(){
//        System.out.println("Name of Student is : "+this.name);
//        System.out.println("Age of Student is : "+this.age);
//    }
    // Non Parametric Constructor
//    Student(){
//        System.out.println("Constructor called");
//    }

//    Parametric Constructor
//    Student(String name, int age){
//        this.name=name;
//        this.age=age;
//        }


    //    Copy Constructor
    Student(Student s2){
        this.name=s2.name;
        this.age=s2.age;
        }
    Student(){

    }


    // UNDERSTANDING OF POLYMORPHISM
    public void printInfo(String name){
        System.out.println("Your name is :"+name);
    }
    public void printInfo(int age){
        System.out.println("Your age is :"+age);
    }
    public void printInfo(String name,int age){
        System.out.println("Your name is :"+name+" and you are "+age+" year old");
    }
}


public class SampleDay24ObjectAndClass {
    public static void main(String args[]){
//        Pen pen1=new Pen();
//        pen1.color="blue";
//        pen1.type="gel";
//      pen1.write();


//        Pen pen2=new Pen();
//        pen2.color="black";
//        pen2.type="ballpoint";

//        pen1.printColor();
//        pen2.printColor();



//        Student s1=new Student();
//        s1.name="Suyash Pal";
//        s1.age=23;
//        s1.printInfo();

//        Student s3=new Student();
//        s3.name="Himanshu Verma";
//        s3.age=26;
//        s3.printInfo();

        // CONSTRUCTOR UNDERSTANDING   Non Parametric Constructor
//        Student s1=new Student();
//        s1.name="Suyash Pal";
//        s1.age=23;
//        s1.printInfo();

        // CONSTRUCTOR UNDERSTANDING   Parametric Constructor
//        Student s1=new Student("Suyash Suryavanshi",30);
//        s1.printInfo();

        // CONSTRUCTOR UNDERSTANDING   Copy Constructor
//        Student s1=new Student();
//        s1.name="Suyash Palss";
//        s1.age=24;
//
//        Student s2=new Student(s1);
//        s2.printInfo(s1.name, s1.age);



        // UNDERSTANDING OF POLYMORPHISM
        Student s1=new Student();
        s1.name="Suyash Pal";
        s1.age=24;

        s1.printInfo(s1.name);
        s1.printInfo(s1.age);
        s1.printInfo(s1.name,s1.age);

    }
}
