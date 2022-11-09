public class Guess4 {

    public static void main(String[] args)
        throws java.io.IOException {

        char ch, ignore, answer = 'K';

        do{
            System.out.print("Guess letter K\n" +
                    "Try it: ");
            ch= (char) System.in.read();

            //discard any other char in input buffer
            do{
                ignore = (char) System.in.read();
            }while (ignore !='\n');

            if(ch == answer){
                System.out.println("**RIGHT**");

            }else {
                System.out.print("Sorry, you're wrong\n" +
                        "Your guess is too ");
                if(ch > answer) System.out.println("low");
                else System.out.println("high");
                System.out.println("TRY AGAIN");
            }
        }while(answer != ch);
    }
}
