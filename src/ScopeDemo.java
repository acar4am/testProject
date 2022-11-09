class ScopeDemo {
    public static void main(String[] args) {
        int x; // known to all code within main
        x = 10;
        if(x == 10) { // start new scope
            int y = 20; // known only to this block
// x and y both known here.
            System.out.println("x and y: " + x + " " + y);
            x = y * 2;
        }
        //y = 100; // Error! y not known here
// x is still known here.
        System.out.println("x is " + x);
    }
}
class NestVar {
    public static void main(String[] args) {
        int count;
        for (count = 0; count < 10; count = count + 1) {
            System.out.println("This is count: " + count);
           // int count; // illegal!!!
            for (count = 0; count < 2; count++)
                System.out.println("This program is in error!");
        }
    }
}