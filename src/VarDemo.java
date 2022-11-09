public class VarDemo {

    public static void main(String[] args) {

        var mc = new MyClass(10); //uses inheritance to declare class
//Here, the type of mc will be inferred as MyClass because that is the type of the initializer,
// which is a new MyClass object
        System.out.println("Value of i in mc:" + mc.getI());

        mc.setI(19);

        System.out.println("New value of i in mc: " +mc.getI());

    }
}
class MyClass{
    private int i;

    MyClass(int k){ i = k; }

    int getI(){ return i; }
    void setI(int k) { if(k >= 0) i = k;}

}
