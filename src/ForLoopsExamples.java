import java.io.IOException;

public class ForLoopsExamples {
    public static void main(String[] args)
            throws IOException {

        int i, j, k;
        char ch;
        int sum = 0;

        //Multiple loop control variables
        for (i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i=" + i + "; j=" + j);
        }


        //Loop until S is typed
        System.out.println("Press S to stop the loop");
        for (i = 0; (char) System.in.read() != 'S'; i++) {
            System.out.println("iteration #" + i);
        }


        //Initialization and iterration are moved out of for
        for (; i < 3; ) {
            System.out.println("pass#" + i);
            i++;
        }


        //Infinite Loop
        //for(;;)
        {
            //...
            //    break;
        }


        //sum numbers through 5
        //no body is needed in loop
        for (k = 0; k <= 5; sum += k++) ;//Add to sum the value of sum plus k, then increment k.”

        System.out.println("Sum is: " + sum);




        int fact = 1,sum2 = 0;
        for (int x = 1;x <= 5; x++) { //declaration of x inside for-loop makes
                                      // scope of variable x exist only inside for-loop
            sum2 += x;
            fact *= x;

        }
        //x is not known here
        System.out.println("sum2 is: " + sum2+"\tfactorial is: "+fact);




    }
}
