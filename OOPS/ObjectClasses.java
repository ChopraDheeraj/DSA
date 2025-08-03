//classes ka naam always capital se shuru kar pro lagega
//and functions ka small se

public class ObjectClasses{
    public static void main(String args[]){ //public here is the access specifier
    Pen p1 = new Pen();  //created a pen object p1 using constructor
    p1.setColor("blue");
    System.out.println(p1.color);
    p1.setTip(5);
    System.out.println(p1.tip);
    p1.color="Yellow";
    System.out.println(p1.color);
    }
}

//class is pen 
class Pen{
    String color; 
    int tip;

    //functions
    void setColor(String newColor){
        color=newColor;
    }

    void setTip(int newTip){
        tip=newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem, int math){
        percentage = (phy+chem+math)/3; 
    }
}