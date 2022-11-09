public class OverloadingConstructors {
    public static void main(String[] args) {

        var t1 = new MyClass2();
        var t2 = new MyClass2(2);
        var t3 = new MyClass2(3.14);
        var t4 = new MyClass2(5,8);

        System.out.println("t1.i: " + t1.i);
        System.out.println("t2.i: " + t2.i);
        System.out.println("t3.i: " + t3.i);
        System.out.println("t4.i: " + t4.i);
    }
}
class MyClass2{

    int i;

    MyClass2(){
        System.out.println("Inside MyClass().");
        i = 0;
    }


    MyClass2(int i1){
        System.out.println("Inside MyClass(int).");
        i = i1;
    }
    MyClass2(double d){
        System.out.println("Inside MyClass(double).");
        i =(int) d;
    }
    MyClass2(int b, int c){
        System.out.println("Inside MyClass(int, int).");
        i = b * c;
    }







}
