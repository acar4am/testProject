class DynamicMethodDispatch {
    // Demonstrate dynamic method dispatch
    public static void main(String[] args) {

        Aa superOb = new Aa();
        Bb subOb1 = new Bb();
        Cc subOb2 = new Cc();

        Aa supRef;
        // In each case, the version of who() to call
        // is determined at runtime by type of object being referred to
        supRef = superOb;
        // use reference to call who()
        supRef.who();

        supRef = subOb1;
        // version of who() is executed by type of object it refers to at the time of call
        // not by the class type of supRef
        supRef.who();

        supRef = subOb2;
        supRef.who();


    }
}
class Aa{
        void who(){
            System.out.println("who() in Aa");
        }
}
class Bb extends  Aa{
    void who(){
        System.out.println("who() in Bb");
    }
}
class Cc extends Bb{
    void who(){
        System.out.println("who() in Cc");
    }
}










