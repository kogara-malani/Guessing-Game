import java.util.Scanner;
public class Tickettype {
          public static void main(String[] args){
            int age,age1;
            age=20;
            age1=12;
            Scanner sc=new Scanner(System.in);
            if(age<12){
                System.out.println("Child ticket");
            }
            else if( age1>15){
                System.out.println("Adult ticket");
            }
            else{
                System.out.println("invalid");
            }
          }    
}
