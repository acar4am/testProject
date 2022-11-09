public class ConstructorDemo {
    public static void main(String[] args){

        DemoClass c1 = new DemoClass(10);
        DemoClass c2 = new DemoClass(88);

        System.out.println(c1.x+ " " +c2.x);
    }
}
class DemoClass{
    int x;

    DemoClass(int i){
        x = i;
    }
}
