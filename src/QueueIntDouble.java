


//TRY MODIFYING QUEUE TO STORE INTS AND DOUBLES
public class QueueIntDouble {
    public static void main(String[] args) {

        Queue3 bigQ = new Queue3(100);
        Queue3 smallQ = new Queue3(4);
        double d;
        int i;

        System.out.println("Using bigQ to store doubles");
        //put some numbers into bigQ
        for(i = 0; i < 26; i++){
            bigQ.put( i + i);
        }

        //retrieve and display elements from bigQ
        System.out.println("Contents of bigQ: ");
        for(i = 0; i < 26; i++){
            d = bigQ.get();
            if(d != (int) '*') System.out.print(d+ " ");
        }
        System.out.println("\n");
        System.out.println("Using small q to generate errors");
        //Using smallQ to generate errors
        for(i = 0; i < 5; i++){
            System.out.print("Attempting to store "+ (double) (i*i));
            smallQ.put((i*i));
            System.out.println( );
        }
        System.out.println( );

        //more error on smallQ
        System.out.print("Contents of smallQ: ");
        for(i = 0; i < 5; i++){
            d = smallQ.get();

            if(d != (int) '*')
                System.out.print(d+ " ");
        }
        System.out.println();
    }
}
class Queue3 {

    double[] q;//array to hold queue
    int putLoc, getLoc;// put and get indices

    Queue3(int size){
        q = new double[size];//allocate memory for q
        putLoc = getLoc = 0;

    }
    //put a char into queue
    void put(int x){
        if(putLoc == q.length){
            System.out.println(" - Queue is full");
            return;
        }
        q[putLoc++] = x;
    }
    int get(){
        if(getLoc == putLoc){
            System.out.println(" - Queue is empty");
            return (int) '*';

        }
        return (int) q[getLoc++];
    }


}