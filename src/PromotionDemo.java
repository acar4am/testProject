// A promotion surprise!
class PromotionDemo {
    public static void main(String[] args) {
        byte b;
        int i;
        b = 10;
        i = b * b; // OK, no cast needed, because byte b is transformed into int
        b = 10;
        b = (byte) (b * b); // cast needed!! because b is now an int, casting it back to byte is necessary
        System.out.println("i and b: " + i + " " + b);
    }
}
