public class ForEachDemo {
    public static void main(String[] args) {
        int[] nums = {0,3,7,4,5,11,7,28,9,0};
        int sum=0;

        for(int x: nums) {
            sum +=x;
            System.out.println("value is " +x+ " sum: " +sum);
            if(x == 5) break;//stop loop when 5 is obtained
        }

        System.out.println("Total sum: " +sum);
    }
}
class NoChange{
    public static void main(String[] args) {

        int[] nums = {0,3,7,4,5,11,7,28,9,0};

        //demonstration that for-each loop is read-only
        for(int x: nums) {
            System.out.print(x + "\s");
            x *= 10;//this doesn't change nums!
        }

        System.out.println();

        for( int x: nums)
            System.out.print(x+ "\s");

    }
}
class MultiDimForEach{
    public static void main(String[] args) {

        int sum = 0;
        int [][] nums = new int[3][5];

        //give nums some values
        for( int i = 0; i <3; i++){
            for(int j = 0; j < 5; j++)
                nums[i][j] = (i+1)*(j+1);
        }
        //using for-each to print and sum nums
        for(int[] x: nums){ //x is declared with square parentheses
                            //it is a reference to one-dimensional array of integers
            for(int y : x){
                System.out.println("Value: " +y);
                sum +=y;
            }
        }
        System.out.println("The sum is: " +sum);







    }
}
class SearchEnhancedFor {
    //search an array using for-each
    public static void main(String[] args) {

        int[] nums = {6,8,3,7,5,6,1,4};
        int val = 5;
        boolean flag = false;

        for(int x : nums) {
            if(x == val) {
                flag = true;
                break;
            }
        }
        if(flag)
            System.out.println("Value is found.");
    }

}
