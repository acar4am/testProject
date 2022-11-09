//10
public class
ConvertLowerUpperCase {
    public static void main(String[] args)
            throws java.io.IOException {
//A=65, Z=90,[....32....] a=97, z=122 ASCII
        char ch;
        int cCount = 0;        //count how many times conversion happened

        System.out.println("Input character(ends with \".\")");

        do {
            ch = (char) System.in.read();

            if (ch >= 'A' & ch <= 'Z') {

                ch += 32;
                System.out.print(ch);
                cCount++;

            } else if (ch >= 'a' & ch <= 'z') {
                ch -= 32;
                System.out.print(ch);
                cCount++;
            }
        } while (ch != '.');
        System.out.println("\nChanges count:" + cCount);
    }
}
