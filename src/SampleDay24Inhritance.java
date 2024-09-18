//  UNDERSTANDING OF INHRITANCE
//class Shape{
//    String color;
//
//    public void print(String color){
//        System.out.println("Color is :"+this.color);
//    }
//
//}
//class Triangle extends Shape{
//
//}


//  TYPES OF INHRITANCE


//  1. Singlr Level Inhritance
//class Shape{
//    public void area() {
//        System.out.println("Are is :");
//    }
//}
//class Triangle extends Shape{
//    int l;
//    int h;
//
//    public void area(int l,int h){
//        double area=0.5*(l*h);
//        System.out.println(area);
//    }
//}

//  2. Multi Level Inhritance
//class Shape{
//    public void area() {
//        System.out.println("Are is :");
//    }
//}
//class Triangle extends Shape{
//    int l;
//    int h;
//
//    public void area(int l,int h){
//        double area=0.5*(l*h);
//        System.out.println(area);
//    }
//}
//class Equilateral extends Triangle{
//    public void print(){
//        System.out.println("Multi Level Inhritance");
//    }
//}


class Shape{
    public void area() {
        System.out.println("Are is :");
    }
}
class Triangle extends Shape{
    int l;
    int h;

    public void area(int l,int h){
        double area=0.5*(l*h);
        System.out.println("Trianle area is :"+area);
    }
}
class Circle extends Shape{
    int r;
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}



public class SampleDay24Inhritance {
    public static void main(String args[]){

        //  UNDERSTANDING OF INHRITANCE
//    Triangle t1=new Triangle();
//    t1.color="red";
//    t1.print(t1.color);



        //  TYPES OF INHRITANCE
//    1. Singlr Level Inhritance

//        Triangle t1=new Triangle();
//        t1.l=5;
//        t1.h=10;
//        t1.area();
//        t1.area(t1.l,t1.h);

        //    2. Multi Level Inhritance
//        Equilateral t1=new Equilateral();
//        t1.l=5;
//        t1.h=5;
//        t1.area();
//        t1.area(t1.l,t1.h);
//        t1.print();



//        3. Heriracial Inhritance
Circle c1=new Circle();
c1.r=5;
c1.area();
c1.area(c1.r);


    }
}
