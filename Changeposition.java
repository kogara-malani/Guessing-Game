import java.util.Scanner;

public class Changeposition {
    public static void main(String[] args){
        int x,y,length,cx,cy;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        length=sc.nextInt();
        sc.close();
        cx=x+(length/2);
        cy=y+(length/2);
        System.out.println(cx+""+cy);
    }
    
}
