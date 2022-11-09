class Factorial {

    int fac;

    int factR(int x){//RECURSIVE METHOD
     if(x == 1) return 1;
     fac = factR(x-1) * x;
        System.out.println(fac);
     return fac;
    }

}
class Recursion{
    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println(f.factR(5));
    }
}
