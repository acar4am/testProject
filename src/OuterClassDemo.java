public class OuterClassDemo {
// Demonstrate use of inner classes
    int[] numbs;

    OuterClassDemo(int[] n){
        numbs = n;
    }

    void analyzeArr(){
        InnerClass innerClass = new InnerClass();
        System.out.println("Min value in Array: " + innerClass.getMinVal());
        System.out.println("Max value in Array: " + innerClass.getMaxVal());
        System.out.println("Average of values in Array: " + innerClass.getAvgVal());
    }

// This is an inner class
    class InnerClass{

        // get minimal value from array
        int getMinVal(){
            int m = numbs[0];
            for (int x: numbs) {
                if(x < m)
                    m = x;
            }
            return m;
        }
        // get maximum value from array
        int getMaxVal(){
            int m = numbs[0];
            for(int x: numbs){
                if(x > m)
                    m = x;
            }
            return m;
        }
        // get average value
        double getAvgVal(){
            double avg = 0;
            for(int x: numbs)
                avg +=x;
            return (avg / numbs.length);
        }
    }
}
class NestedClassDemo{
    public static void main(String[] args) {

        int[] x = {2, 5, 3, 6, 8, 12, 9, 0};

        OuterClassDemo ob = new OuterClassDemo(x);
        ob.analyzeArr();
    }
}
class VarargDemo {
    // vaTest() uses a vararg.
    // Declare a variable-length argument
     static void vaTest(int... v) {
        System.out.println("Number of args: " + v.length);
        System.out.println("Contents: ");
        for (int i = 0; i < v.length; i++)
            System.out.println(" arg " + i + ": " + v[i]);
        System.out.println();
    }

    public static void main(String[] args) {
        VarargDemo.vaTest(2, 16, -18, (int) 4.4);
    }
}