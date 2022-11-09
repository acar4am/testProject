class Overloading {

    void ovlDemo(){
        System.out.println("No parameters");
    }

    void ovlDemo(int i){
        System.out.println("One parameter: " +i);
    }

    int ovlDemo(int a, int b){
        System.out.println("Two parameters: " +a+ "\s" +b);
        return a+b;
    }

    double ovlDemo(double a, double b){
        System.out.println("Two double parameters: " +a+ "\s" +b);
        return a+b;
    }
}
class Overloading2 {

    void f(int i) {
        System.out.println("Inside f(int): " + i);
    }

    void f(double i) {
        System.out.println("Inside f(double): " + i);
    }
}

class TypeConversion{
    public static void main(String[] args) {

        Overloading2 ov2 = new Overloading2();
        byte b = 99;
        float f = 10.2F;

        ov2.f(b);//Type conversion from byte to int
        ov2.f(f);//Type conversion from float to double

    }
}

class OverloadingDemo{
    public static void main(String[] args) {
        Overloading ov = new Overloading();

        int i,j;
        double k;

        ov.ovlDemo();
        System.out.println();

        ov.ovlDemo(2);
        System.out.println();

        i = ov.ovlDemo(2,4);
        System.out.println("Result of ovlDemo(2, 4): " +i);
        System.out.println( );

        k = ov.ovlDemo(7.13,8.16);
        System.out.println("Res of ovlDemo(7.13, 8.16): " +k);
        ///////////////////////////////////////////////////////////
    }
}