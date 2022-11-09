public class BreakGoTo {

        public static void main(String[] args) {
            int i;
            for(i=1; i<4; i++) {
                one: {
                    two: {
                        three: {
                            System.out.println("\ni is " + i);
                            if(i==1) break one;
                            if(i==2) break two;
                            if(i==3) break three;
                            // this is never reached
                            System.out.println("won't print");
                        }
                        System.out.println("After block three.");
                    }
                    System.out.println("After block two.");
                }
                System.out.println("After block one.");
            }
            System.out.println("After for.");
        }
}
class Break5 {
    public static void main(String[] args) {
        done://break will jump to the end of this code block
        for(int i=0; i<10; i++) {
            for(int j=0; j<10; j++) {
                for(int k=0; k<10; k++) {
                    System.out.println(k + " ");
                    if(k == 5) break done; // jump to done
                }
                System.out.println("After k loop"); // won't execute
            }
            System.out.println("After j loop"); // won't execute
        }
        System.out.println("After i loop");
    }
}
class Break6 {//where you put a label is important
    public static void main(String[] args) {
        int x=0, y=0;
        // here, put label before for statement.
        stop1: for(x=0; x < 5; x++) {
            for(y = 0; y < 5; y++) {
                if(y == 2) break stop1;
                System.out.println("x and y: " + x + " " + y);
            }
        }
        System.out.println();
        // now, put label immediately before {
        for(x=0; x < 5; x++)
            stop2: {
                for(y = 0; y < 5; y++) {
                    if(y == 2) break stop2;
                    System.out.println("x and y: " + x + " " + y);
                }
            }
    }
}
// This program contains an error.
/*class BreakErr {
    public static void main(String[] args) {
        one://WRONG
        for (int i = 0; i < 3; i++) {
            System.out.print("iPass " + i + ": ");
        }
        for (int j = 0; j < 100; j++) {
            if (j == 10) break one; // WRONG
// you cannot break to any label that is not defined for an enclosing block
            System.out.print(j + " ");
        }
    }
}*/