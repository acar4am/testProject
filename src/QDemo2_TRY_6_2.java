//queue class for chars
class Queue2{
    private char[] q; //this array holds queue
    private int putloc, getloc;//putter and getter

    //construct empty Queue given size
    Queue2(int size){
        q = new char[size]; //allocate memory for queue
        putloc = getloc = 0;
    }

    //construct a queue from queue
    Queue2(Queue2 ob){
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];

        //copy elements
        for(int i = getloc; i< putloc; i++){
            q[i] = ob.q[i];
        }
    }

    //construct Queue with initial value
    Queue2(char[] a){
        putloc = getloc = 0;
        q = new char[a.length];

        for(int i =0; i < a.length; i++)
            put(a[i]);
    }

    //put char into queue
    void put(char ch){
        if(putloc == q.length){
            System.out.println("[X] Queue is full");
            return;
        }
        q[putloc++] = ch;
    }
    char get(){
        if(getloc == putloc){
            System.out.println("[X] Queue is empty");
            return (char) 0;
        }
        return q[getloc++];
    }
}

public class QDemo2_TRY_6_2 {
    public static void main(String[] args) {
        Queue2 q1 = new Queue2(10);// construct a 10-element empty queue

        char[] name = {'T', 'o', 'm'};
        // construct queue from array
        Queue2  q2 = new Queue2(name);

        char ch;
        int i;

        // fill q1 with characters
        for(i = 0; i <10; i++){
            q1.put((char) ('A' +i));
        }

        // construct queue from another queue
        Queue2 q3 = new Queue2(q1);

        // show contents of queues
        System.out.print("Contents of q1: ");
        for(i = 0; i < 10; i++){
            ch = q1.get();
            System.out.print(ch + "\s");
        }

        System.out.print("\nContents of q2: ");
        for(i = 0;i < 3; i++){
            ch = q2.get();
            System.out.print(ch + "\s");
        }
        System.out.print("\nContents of q3: ");
        for(i = 0; i < 10; i++){
            ch = q3.get();
            System.out.print(ch + "\s");
        }

    }
}
