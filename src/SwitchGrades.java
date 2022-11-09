import java.lang.*;

public class SwitchGrades {

    public static char getGrade(int s1, int s2, int s3) {
        int score = (s1+s2+s3) / 3;


        return score >= 90 ? 'A': score >= 80 ? 'B': score >=70 ? 'C' : score >= 60 ? 'D': 'F';
        }
}


class Calculate {

    public static String bmi(double weight, double height) {

        double bmi = weight / (height * height);

        if (bmi <= 18.5) return "Underweight";
        if (bmi <= 25) return "Normal";
        if (bmi <= 30) return "Overweight";
        return "Obese";
    }
}
