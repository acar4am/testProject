import java.util.Scanner;

public class InchesToMetersConverter {

    public static void main(String[] args){

        double meters,inches;
                float feet;
        byte count=0;
        Scanner sc = new Scanner(System.in);

        //System.out.println("Enter value in feet:");
       // feet = sc.nextDouble();

        for(inches=1;inches<=144;inches++){
            feet = (float) (inches * 0.12);
            meters = 0.0254  * inches;
            System.out.println("Inches:"+inches+" feet:"+feet+" meters:"+meters);
            count++;
            if(count==12){
                System.out.println();
                count=0;
            }
        }
    }
}
