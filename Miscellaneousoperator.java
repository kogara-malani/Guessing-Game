public class Miscellaneousoperator {
    public static void main(String[] args){
        //ternary operator
        int marks = 65;
        String result = (marks<50)? "passed" : "failed";
        System.out.println(result);
        String result1 = (marks>50)? "passed" : "failed";
        System.out.println(result1);
        //unary operator
        int num = +50;
        System.out.println(num);
        num--;
        System.out.println(num);
        num++;
        System.out.println(num);
        num=-num;
        System.out.println(num);
    }
    
}
