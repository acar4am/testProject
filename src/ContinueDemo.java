public class ContinueDemo {
    public static void main(String[] args){
        int i;

        //print even numbers between 1 and 100
        for(i = 0; i <=100; i++){
            if((i % 2) !=0)
                continue;
                System.out.println(i);
        }
    }
}
//continue with a label
class ContToLabel {
    public static void main(String[] args) {

        outerLoop:
            for(int i = 1; i < 10; i++){
                System.out.print("\nOutLoopPass "+i+", InnLoop: ");
                for(int j = 1; j < 10; j++){
                    if(j == 5) continue outerLoop;//continue outerloop
                    System.out.print(j);
                }
            }
    }
}