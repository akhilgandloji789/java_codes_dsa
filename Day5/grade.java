import java.util.*;
public class grade {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();

        float total=a+b+c+d+e;

        float avg=total/5;

        String grade="";

        if(avg>=90 && avg<=100){
            grade="A";
        }
        else if(avg>=80 && avg<=89){
            grade="B";
        }
        else if(avg>=70 && avg<=79){
            grade="C";
        }
        else if(avg>=60 && avg<=69){
            grade="D";
        }
        else if(avg>=39 && avg<=59){
            grade="E";
        }
        else if(avg<35){
            grade="Fail";
            
        }

        System.out.println("Total: "+total);
        System.out.println("Average: "+avg);
        System.out.println("Grade: "+grade);
        }
       }
