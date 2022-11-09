//1
public class Chapter3SelfTest {
    //reads characters until a period. reports number of spaces
    public static void main(String[] args)
        throws java.io.IOException{

        char ch,ignore;
        int sCount;

        System.out.println("You may enter your input(ends with \".\"): ");
        sCount = 0;
        do{
            ch = (char) System.in.read();
            if(ch == ' ') sCount++;
        }while (ch != '.');
        System.out.println("Number of spaces: "+sCount);
    }
}
//2
class ifElseLadder{
    public static void main(String[] args) {
        int x;
        x = 5;
        if(x > 2) {
            System.out.println("x > 2");
        }else if (x<2) {
            System.out.println("x < 2");
        }
    }
}
//3
class whatIf{
    public static void main(String[] args) {
        int x=1, y=10;
        if(x < 10)
            if(y > 100){
                if(x == 0) x = y;
                else y = x;
            }else System.out.println("error");//what if belongs to this else?
//4
        for(int z = 1000;z >= 0;    ){
            z -= 2;
        }

        

    }
}
//9
class ArithmeticProgression{
    //prints arithmetic progression
    public static void main(String[] args) {

        int i;

        for(i = 1; i < 200; i += i )
            System.out.print(i+",\s");

    }
}
