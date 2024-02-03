import java.util.*;

public class largestnumber{

    public static int findlargest(int numbers[]){
        int largest=Integer.MIN_VALUE; //-infinity
        for(int i=0; i<numbers.length; i++){
            if(numbers.length>largest){
                largest=numbers[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int numbers[]={1,2,6,3,5};
        System.out.println("Largest Number is "+ findlargest(numbers));

    }
}