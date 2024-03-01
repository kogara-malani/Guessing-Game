import java.util.Scanner;
import java.text.DecimalFormat;
public class Gainpercent {
    public static void main(String[] args){
        int price,repair,sp,cp,gain;
        double gainpercent;
        DecimalFormat d=new DecimalFormat("0.00");
        Scanner sc=new Scanner(System.in);
        price=sc.nextInt();
        repair=sc.nextInt();
        sp=sc.nextInt();
        cp=price+repair;
        gain=cp-sp;
        gainpercent=((double)gain/(double)price)*100;
        System.out.println(gainpercent);
        sc.close();
    }
    
}
