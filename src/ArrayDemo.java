public class ArrayDemo {
    public static void main(String[] args) {

        int[] arr;

        arr = new int[10];

        for(int i=0; i < 10; i++)
            arr[i] = i;
        for(int i=0; i < 10; i++)
            System.out.println("Arr#" +i+ " is: " +arr[i]);
    }
}
class MinMaxArray{//displays min and max values in array
    public static void main(String[] args) {

       // int[] nums = new int[10];
        int[] nums = {99, -10, 100123, 19, -998, 5622, 444, 1, 323, 543};

        int min, max;


        min = max = nums[0];
        for(int i=1; i<10; i++){
            if(nums[i] < min) min = nums[i];
            if(nums[i] > max) max = nums[i];
        }
        System.out.println("Min and max: " +min+ "\s" +max);
    }
}
class TwoDimensionalArray {
    //prints a two-dimensional array
    public static void main(String[] args) {

        int i,j;
        int [][] table = new int[3][4];

        for(j = 0; j<3; ++j){
            for(i = 0; i < 4; ++i){
                table[j][i] = (j * 4) + i + 1;
                System.out.print(table[j][i]+ "\t");
            }
            System.out.println();
        }

    }
}
class IrregularArray{
    public static void main(String[] args) {
        int[] [] riders = new int[7][];//only first dimension is specified
        riders[0] = new int [10];
        riders[1] = new int [10];
        riders[2] = new int [10];
        riders[3] = new int [10];
        riders[4] = new int [10];
        riders[5] = new int [2];
        riders[6] = new int [2];

        int i,j;
        //fabricate some fake data
        for(i = 0; i < 5; i++){
            for(j = 0; j < 10; j++)
                riders[i][j] = i + j + 10;
        }
        for(i = 5; i < 7; i++){
            for(j = 0; j < 2; j++)
                riders[i][j] = i + j + 10;
        }

        System.out.println("Riders per trip durning the week:");
        for(i = 0; i < 5; i++){
            for(j = 0; j < 10; j++)
                System.out.print(riders[i][j]+ "\t");
            System.out.println();
        }

        System.out.println("Riders on weekends:");
        for(i = 5; i < 7; i++){
            for(j = 0; j < 2; j++)
                System.out.print(riders[i][j]+ "\t");
            System.out.println();
        }
    }
    int[][][] MULTI_DIMENSIONAL_ARRAY = new int[4][10][3];
}
