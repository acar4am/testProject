public class GuessLetter {

    public static void main(String[] args)
            throws java.io.IOException {

        char ch, answer = 'K';

        System.out.print("Im thinking about a letter between A-Z.\n" +
                "Can you guess it: ");
        ch = (char) System.in.read();
        if (ch == answer) System.out.println("+++RIGHT+++");
            else {
            System.out.print("...Your guess is ");
            if (ch < answer) System.out.println("too low.");
            else System.out.println("too high");


        }
    }
}
