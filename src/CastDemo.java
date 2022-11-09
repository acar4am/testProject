public class CastDemo {

    public static void main(String[] args){

        double x,y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;

        i = (int) (x/y);//cast double to int;NARROWING CONVERSION
        System.out.println("Integer i of (x/y) : "+i);

        i = 100;
        b = (byte) i;
        System.out.println("value of b: "+b);
        //byte can hold 100. no loss of information

        i = 257;
        b = (byte) i;
        //information loss
        System.out.println("value of b: "+b);

        b = 88;//ASCII for X
        ch = (char) b;
        System.out.println("ch: "+ch);
    }
}
