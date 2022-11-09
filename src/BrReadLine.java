import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BrReadLine {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();
            var number = Integer.parseInt(str);
            System.out.println("You entered number:" + number);
        } catch (Exception ex) {
            System.err.println("Error:" + ex.getMessage());
        }

    }
}
