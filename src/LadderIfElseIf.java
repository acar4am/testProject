public class LadderIfElseIf {

    public static void main(String[] args){

        int i;

        for(i=0;i<6;i++){
            if(i == 1) System.out.println("i is 1");
            else if (i == 2) System.out.println("i is 2");//executed from top to bottom
            else if (i == 3) System.out.println("i is 3");
            else if (i == 4) System.out.println("i is 4");
            else System.out.println("i is not in range of 1 and 4");//default else


        }
    }

}
