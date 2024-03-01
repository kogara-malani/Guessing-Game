import java.util.Scanner;
public class Birthdaychallenge {
    public static void main(String[] args){
        int m,n;
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        int pieces=(m*n)-1;
        System.out.println(pieces);
       
        int m1,n1;
        m1=sc.nextInt();
        n1=sc.nextInt();
        int pieces1=(m1*n1)-1;
        System.out.println(pieces1);
        sc.close();
    }
    
}
