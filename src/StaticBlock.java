public class StaticBlock {
    static double rootOf2;
    static double rootOf3;
    // static block executes before it is used by program
    static{
        System.out.println("Inside static block");
        rootOf2 = Math.sqrt(2);
        rootOf3 = Math.sqrt(3);

    }
    StaticBlock(String msg){
        System.out.println(msg);
    }
}
class StaticDemos{
    public static void main(String[] args) {
        var ob = new StaticBlock("Inside constructor");
        System.out.println("Root of 2: " + StaticBlock.rootOf2);
        System.out.println("Root of 3: " + StaticBlock.rootOf3);
    }
}
