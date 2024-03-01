public class Bitwiserightshift {
    public static void main(String[] args){
        //signed right shift
        int x=12;
        System.out.println("12 is binary form " + Integer.toBinaryString(x));
        int y=2;
        int shift = x>>y;
        System.out.println("12 will become in " + shift + " integer form");
        System.out.println("12 is binary form after performing right shift " + Integer.toBinaryString(shift));
        //unsigned right shift
        int x1 = -12;
        System.out.println("-12 in binary form "+Integer.toBinaryString(x1));
        int y1 = 2;
        int shift1 = x1 >>> y1;
        System.out.println("-12 will become  : " + shift1 +" in integer form");
        System.out.println("-12 in binary form after performing unsingned right shift "+Integer.toBinaryString(shift1));


    }
    
}
