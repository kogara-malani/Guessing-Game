public class manipulatingvarialbles {
    public static void main(String[] args) {
        int zebras=8;
        int giraffes=4;
        int animals = zebras + giraffes;
        System.out.println(animals); 
        int animal = zebras - giraffes;
        System.err.println(animal);
        double subtotal=30;
        double tax=0.0875;
    double total = subtotal + zebras * giraffes;
    System.out.println(total);  
    double total1 = subtotal / tax;
    System.out.println(total1);
    int m = zebras * giraffes;
    System.out.println("There are "+m+" in the zoo");
    int a = 100 % 10;
    System.out.println(a);
    int num = 5 * ( 10 - 4 ) + 4 / 2;
    System.out.println(num);
    int num1 = 5 * 10 % 2 * ( 9 - 3 ) + 6 / 2 + 6 ;
    System.out.println(num1);
    double amount=100;
    double rate=50;
    boolean n = amount < rate;
    System.out.println(n); 
    double na = amount + rate;
    System.out.println(na);
 }
}
