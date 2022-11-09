


//TRY MODIFYING QUEUE TO STORE INTS AND DOUBLES
public class QueueDemoTRY5_2 {
    public static void main(String[] args) {

        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;

        System.out.println("Using bigQ to store alphabet");
        //put some numbers into bigQ
        for(i = 0; i < 26; i++){
            bigQ.put((char) ('A' + i));
        }

        //retrieve and display elements from bigQ
        System.out.println("Contents of bigQ: ");
        for(i = 0; i < 26; i++){
            ch = bigQ.get();
            if(ch != (char) 0) System.out.print(ch);
        }
        System.out.println();

        //Using smallQ to generate errors
        for(i = 0; i < 5; i++){
            System.out.print("Attempting to store "+ (char) ('Z' - i));
            smallQ.put((char) ('Z' - i));
            System.out.println( );
        }
        System.out.println( );

        //more error on smallQ
        System.out.print("Contents of smallQ: ");
        for(i = 0; i < 5; i++){
            ch = smallQ.get();

            if(ch != (char) 0)
                System.out.print(ch);
        }
        System.out.println();
    }
}
class Queue{

    char[] q;//array to hold queue
    int putLoc, getLoc;// put and get indices

    Queue(int size){
        q = new char[size];//allocate memory for q
        putLoc = getLoc = 0;

    }
    //put a char into queue
    void put(char ch){
        if(putLoc == q.length){
            System.out.println(" - Queue is full");
            return;
        }
        q[putLoc++] = ch;
    }
    char get(){
        if(getLoc == putLoc){
            System.out.println(" - Queue is empty");
            return (char) 0;

        }
        return q[getLoc++];
    }


}