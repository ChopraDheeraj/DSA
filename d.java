import java.util.*;

public class d{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no:");
        int a=sc.nextInt();
        char ch='A';
        for(int i=1; i<=a; i++){
            for(int chars=1; chars<=i; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}