import java.util.Scanner;
public class Squaretile {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double l=sc.nextDouble();
        double n=sc.nextDouble();
        int i;
        i=1;
        int m;
        m=0;
        while(i*i<=n){
            m=i*i;
            i++;
        }
        double a=m*(1*1);
        System.out.println(a);
        sc.close();
    }
    
}
