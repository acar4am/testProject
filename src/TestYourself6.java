import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

class Stack {
// first in - last out
   private int pos = 0;
   private char[] stack;
    Stack(int size) {
        stack = new char[size];
    }
    int getPos(){
        return pos;
    }
    void showStack(){
        for (char x : this.stack) {
            System.out.print(x);

        }
    }
    void push(char ch) {
        if (pos == stack.length){
            System.out.println("[X]StackFull!");
            return;
        }
        stack[pos++] = ch;
    }
    char pop(){
        if(pos == 0){

            System.out.println("[X]StackEmpty!");
            return (char) 0;
        }
        return stack[--pos];
    }
}
class StackDemo {
    public static void main(String[] args) {
        int s = 5; // size of array
        Stack s1 = new Stack(s);

        // fill stack with values
        for (int i = 0; i < s; i++) {
            s1.push((char) ('A' + i));
        }

        // show stack
        s1.showStack();

        System.out.println();
        System.out.println("posIs: " + s1.getPos());//show pos
        s1.push('F');//create a stack overflow ERROR!


        for (int i = 0; i < s; i++) {
            System.out.print(s1.pop());
        }
        System.out.println();
        s1.pop();// create a stack is empty ERROR!
    }
}
class Test2{
    int a;
    Test2(int i){
        a = i;
    }
    void swap(Test2 ob){
        int temp;
        temp = ob.a;
        ob.a = this.a;
        this.a = temp;

    }
}
class Test2Demo{
    public static void main(String[] args) {
        Test2 t1 = new Test2(5);
        Test2 t2 = new Test2(10);
        // before swap
        System.out.println("t1.a = " + t1.a);
        System.out.println("t2.a = " + t2.a);
        t1.swap(t2);
        //after swap
        System.out.println("t1.a = " + t1.a);
        System.out.println("t2.a = " + t2.a);
    }
}
class VarArgsDemo{

    static int sum(int ... i){
        int s=0;
        for (int x: i)
           s += x;
        return s;
    }
   // static void sum(int a, int ... v){}

    public static void main(String[] args) {
        System.out.println(sum(2,4,8,16,32));

    }
}

class LocDateTest{
    public static void main(String[] args) {
        LocalDate date;
        date = LocalDate.now();
        System.out.println(date);

    }
}