class Chtra{
    String name;
    static  String school;

    public static void changeSchool(){
        school="newSchol";
    }
}

public class SampleDay24Static {
    public static void main(String args[]){
Chtra.school="CDA";
Chtra ch1=new Chtra();
ch1.name="Suyash";
        System.out.println(Chtra.school);
    }
}
