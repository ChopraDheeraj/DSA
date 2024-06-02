import java.util.*;

public class practice{

    public static int hello(int num[], int key){
        int start=1;
        int end=num.length;
        while(end>=start){
            //mid
            int mid=(start+end)/2;
            if(num[mid]==key){
                return mid;
            }
            
            if(num[mid]>key){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int num[]={2,4,6,8,10};
        int key=6;
        System.out.println(hello(num, key));
    }
}