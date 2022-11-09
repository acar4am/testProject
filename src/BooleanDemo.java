public class BooleanDemo {

    public static void main(String[] args){
        boolean b;

        b = false;
        System.out.println("b is "+b);

        b = true;
        System.out.println("b is "+b);

        //a boolean value controls IF statement
        if(b) System.out.println("This is executed");

        b = false;
        if(b) System.out.println("That is NOT executed");

        //relational operator gives outcome in boolean type
        System.out.println("10 > 9 is " + (10 > 9));
    }
}
