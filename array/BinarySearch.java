import java.util.*;

public class BinarySearch{
    public static int bs(int numbers[], int key){
        int start=0, end=numbers.length-1;  
        while(end>=start){
            int mid=(start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
            return -1;
        
       
    }
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10,12,14};
        int key=10;
        System.out.println("Key is at: "+ bs(numbers, key));
    }
}