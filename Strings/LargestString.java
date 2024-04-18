import java.util.*;

public class LargestString{


    public static void main(String args[]){
        String fruit[]={"apple","mango","banana"};

        String largest=fruit[0]; //we took apple as max
        for(int i=0; i<fruit.length; i++){
            if(largest.compareTo(fruit[i])<0){
                largest=fruit[i];
            }
        }
        System.out.println(largest);
    }
}