//Inaprogram,inputthesideofasquare.Youhavetooutputtheareaofthesquare.(Hint : area of a square is (side x side))
import java.util.*;
public class AreaSquare{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side of a Square");
        int s=sc.nextInt();
        int Area=s*s;
        System.out.println("Area pf square is "+Area);
    }
}