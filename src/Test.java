
class Test {

    int i, k;

    Test(int a, int b){
        i = a;
        k = b;

    }
    void changeInts(Test ob){
        ob.i = ob.i + ob.k;
        ob.k = -ob.k;
    }
}
class PassObRef {
    public static void main(String[] args) {



        Test ob = new Test(15, 4);
        System.out.println();
        System.out.println("Before changeInts(): " + ob.i + "\s" + ob.k);

        ob.changeInts(ob);

        System.out.println("After changeInts(): " + ob.i+ "\s" +ob.k);
    }
}