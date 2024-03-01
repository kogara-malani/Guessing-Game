import java.util.Scanner;
public class Foodfestival {
    public static void main(String[] args){
        int hall,table;
        Scanner sc=new Scanner(System.in);
        hall=sc.nextInt();
        table=sc.nextInt();
        System.out.println((hall*hall)-(table*table));
        sc.close();
    }
    
}
