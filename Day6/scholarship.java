import java.util.*;
public class scholarship {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        int attendancepercentage=sc.nextInt();

        if(attendancepercentage>=75){
            System.out.println("Eligible");

            if(marks>=90){
                System.out.println("Scholarship:50000");
            }
            else if(marks>=80){
                System.out.println("Scholarship: ₹30,000");
            }
            else if(marks>=7){
                System.out.println("Scholarship: ₹15,000");
            }
            else if(marks<70){
                System.out.println("No Scholarship");
            }

        }
        else{
            System.out.println("Not Eligible");
        }
    }
    
}
