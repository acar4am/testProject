public class LengthDemo {
    public static void main(String[] args) {
        int [] list = new int[10];
        int [] nums = {1, 2, 3};
        int [][] table = {//a variable-length table
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };
        System.out.println("list length: " +list.length);
        System.out.println("nums length: " +nums.length);

        System.out.println("table length: " +table.length);
        //Table is array of arrays, so it obtains number of arrays, in this case 3

        //To obtain individual length of each array use:
        System.out.println("table[0] length: "+ table[0].length);
        System.out.println("table[1] length: "+ table[1].length);
        System.out.println("table[2] length: "+ table[2].length);
        System.out.println();

        //use length to initialize list
        for(int i = 0; i < list.length; i++)
            list[i] = i * i;

        System.out.print("Here's list: ");
        for(int i = 0; i < list.length; i++)
            System.out.print(list[i]+ "\t");
    }
}
