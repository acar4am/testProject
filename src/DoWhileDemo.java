public class DoWhileDemo {

    public static void main(String[] args)
        throws java.io.IOException {

        char ch;

        do{
            System.out.println("Press key -> ENTER: ");
            ch = (char) System.in.read();

        }while(ch != 'q');
    }
}
