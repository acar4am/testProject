public class PrimeNum {
    static void checkPrime(int n) {
        int i, m = 0, flag = 0;
        m = n / 2;
        for(n = 2;n<=100;n++) {
            if (n == 0 || n == 1) {
                System.out.println(n + " is not prime number.1or0");
            } else {

                for (i = 2; i <= m; i++) {

                    if (n % i == 0) {
                        flag = 1;
                        System.out.println(n + " is not prime number.%==0");
                        break;
                    }
                }
                if (flag == 0) {
                    System.out.println(n + " is prime number!!!");
                }
            }//end of else
        }
    }
}
class Main{
    public static void main(String[] args) {
        PrimeNum.checkPrime(4);
    }
}
