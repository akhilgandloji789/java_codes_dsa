import java.util.*;
public class Areaofcircle {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // code to calculate area of circle
        // area of circle = pi*r*r
        float r=sc.nextFloat();
        float area=3.14f*r*r;
        System.out.println("Area of circle: "+area);
    }
}