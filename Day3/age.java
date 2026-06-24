import java.util.*;
public class age {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int ageof=sc.nextInt();

        if( ageof >=18){
            System.out.println("Adult");
        }
        else if(ageof>=13 && ageof<18){
            System.out.println("Teenager");
        }
        else{
             System.out.println("Child");
        }
    }
    
}
