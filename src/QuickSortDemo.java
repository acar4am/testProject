class QuickSortDemo {
// A simple version of the Quicksort
    // show original array
    static void showArr(char[] items){
        System.out.print("array: ");
        for (char item : items) System.out.print(item + "\s");
        System.out.println();

}
// To keep the interface to the Quicksort simple, the Quicksort class provides the qsort( )
// method, which sets up a call to the actual Quicksort method, qs( ).
// This enables the Quicksort to be called with just the name of the array to be sorted,
// without having to provide an initial
// partition. Since qs( ) is only used internally, it is specified as private.

    static void qsort(char[] items){
        qs(items, 0, items.length - 1);
    }
    // recursive version for characters
    private static void qs(char[] items, int left, int right){
        int i, j;
        char comparand, temp;

        i = left;
        j = right;
        comparand = items[(left + right) / 2];

        do {
            while( (items[i] < comparand) && (i < right) ) i++;
            while( (comparand < items[j]) && (j > left) ) j--;

            if( i <= j){
                temp = items[i];
                items[i] = items[j];
                items[j] = temp;
                i++;j--;
            QuickSortDemo.showArr(items);
            }
        } while(i <= j);

        if(left < j) qs(items, left, j);
        if(i < right) qs(items, i, right);

    }
}
class QSDemo{
    public static void main(String[] args) {
        char[] a = {'D', 'A', 'Y', 'C', 'U', 'Z', 'L', 'O', 'H'};
        int i;

        System.out.println("Original array:");
        QuickSortDemo.showArr(a);
        System.out.println("sorting...");
        QuickSortDemo.qsort(a);

    }
}
