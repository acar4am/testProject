public class BubbleSorting {
    public static void main(String[] args) {

        int[] nums = {3, 12, 5, 66, 1, 34, -2, 50, 666, 9};
        int temp, size = 10;   //temporary value to store element of array

        //display original array
        for (int i = 0; i < size; i++)
            System.out.print(nums[i] + "\s");
        System.out.println();
        //Bubble sort
        for (int a = 1; a < size; a++) {
            for (int b = size - 1; b >= a; b--) {
                if (nums[b - 1] > nums[b]) { //if out of order
                    //exchange elements
                    temp = nums[b - 1];
                    nums[b - 1] = nums[b];
                    nums[b] = temp;
                }
            }
        }
        //display sorted array
        for (int i = 0; i < size; i++)
            System.out.print(nums[i] + "\s");

    }
}
