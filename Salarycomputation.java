import java.util.Scanner;
import java.text.DecimalFormat;
public class Salarycomputation {
    public static void main(String[] args){
        int salary;
        double amount,hra,da;
        DecimalFormat d= new DecimalFormat("0.00");
        Scanner sc=new Scanner(System.in);
        salary=sc.nextInt();
        if(salary<15000){
            hra=0.15*salary;
            da=0.90*salary;
            amount=salary+hra+da;
        }
        else{
            da=0.98*salary;
            amount=salary+15000+da;
        }
        System.out.println(amount);
    }
    
}
