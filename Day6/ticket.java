import java.util.*;
public class ticket {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();

        if(age<5 && age>=0){
            System.out.println("Free ticket");
        }
        else if(age>=5 && age<=12){
            System.out.println("Ticket price : 100rs");
        }
        else if(age>=13 && age<=59){
            System.out.println("Ticket price : 200rs");
        }
        else if(age>=60){
            System.out.println("Senior Citizen");
            System.out.println("Ticket price : 150rs");
        }
        else{
            System.out.println("Invalid age");
        }

    }
    
}
