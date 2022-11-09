class StaticDemo {

    int x;
    static int val;
    // a static variable
    static int y;

    int sum(){
        return x * y;
    }

    // a static method
    static int valDiv2(){
        return val / 2;
    }
}
class Static{
    public static void main(String[] args) {
        StaticDemo sd = new StaticDemo();
        StaticDemo sd1 = new StaticDemo();

        sd.x = 10;
        sd1.x = 20;
        StaticDemo.y = 40;//
        System.out.println(sd1.sum());
        System.out.println(sd.sum());

        StaticDemo.y = 100;
        // changes made in static variable are global to all objects in that class
        System.out.println(sd.sum());
        System.out.println(sd1.sum());

        // changing static variable
        StaticDemo.val = 16;
        // call to a static method
        System.out.println(StaticDemo.valDiv2());
    }
}
