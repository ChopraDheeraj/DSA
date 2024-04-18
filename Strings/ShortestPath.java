import java.util.*;

public class ShortestPath{

    public static float Shortest(String s1){
        int x=0, y=0;
        for(int i=0; i<s1.length(); i++){
            char dir=s1.charAt(i);
            //north
            if(dir == 'N'){
                y++;
            }
            //east
            if(dir == 'E'){
                x++;
            }
            //west
            if(dir == 'W'){
                x--;
            }
            //south
            if(dir == 'S'){
                y--;
            }
        }
        int X2=x*x;
        int Y2=y*y;
        return (float)Math.sqrt(X2+Y2);
    }

    public static void main(String args[]){
        String s1="WNEENESENNN";
        System.out.println(Shortest(s1));
    }
}