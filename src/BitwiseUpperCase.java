public class BitwiseUpperCase {
    public static void main(String[] args) throws java.io.IOException {
        char ch;

        for(int i = 0; i < 10; i++){
            ch = (char) ('a' + i);
            System.out.print(ch);

            //turn off 6th bit to print upper case letters(greater by 32)
            ch = (char) ((int) ch & 65503);//65503 = 1111 1111 1101 1111

            System.out.print(ch+ "\s");
        }
    }
}
class ShowBits{
    //show bits containing in number
    public static void main(String[] args) {

        byte b = 123;
        int i;

        for (i = 128; i > 0; i /= 2) {
            //tests each bit in b, using bitwise AND to determine whether bit is on or off
            if ((b & i) != 0) System.out.print('1');
            else              System.out.print('0');
        }


    }
}
class LowerCase {
    public static void main(String[] args) {
        char ch = 'A';
        int i;
        for (i = 0; i < 10; i++) {
            System.out.print((char) (ch + i));
            System.out.print((char) ((int) ch + i | 32) + "\s");
            //turns on 6th bit with the value 32, which is 0000 0000 0010 0000
        }

    }
}