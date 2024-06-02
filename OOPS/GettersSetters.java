
public class GettersSetters{

    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setColor("blue");
        System.out.print(p1.getColor());
    }
}

class Pen{
    private String color;
    private int tip;
    
    //getters
    String getColor(){
        return this.color;  //this is a special keyword in java
    }

    int getTip(){
        return this.tip;
    }

    //setters
    void setColor(String newColor){
        this.color = newColor;
    }

    void setTip(int Tip){
        this.tip = Tip;
    }
}