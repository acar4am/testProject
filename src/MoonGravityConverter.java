import java.util.Scanner;

public class MoonGravityConverter {
    public static void main(String[] args){
        double gravity, weight;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your weight:");
        weight = sc.nextDouble();
        gravity = weight * 0.17;
        System.out.println("Your weight on moon:" +gravity);
    }
}
