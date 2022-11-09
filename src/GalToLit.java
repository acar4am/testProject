import java.util.Scanner;

public class GalToLit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double gallons, liters;
        System.out.println("Enter value in gallons:");
        gallons = sc.nextDouble();
        liters = gallons * 3.7854;

        System.out.println(gallons+ " gallons is " +liters+ " liters");




    }
}
