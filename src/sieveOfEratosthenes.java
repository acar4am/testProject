import java.util.*;

public class sieveOfEratosthenes {

    // метод для нахождения всех простых чисел до n
    public static void findPrimes(int n) {

        // создаем массив, где индекс i соответствует числу i, а значение - является ли i простым числом
        boolean[] isPrime = new boolean[n+1];

        // заполняем массив значением true, т.к. изначально считаем, что все числа простые
        Arrays.fill(isPrime, true);

        // 0 и 1 - не простые числа
        isPrime[0] = false;
        isPrime[1] = false;

        // начинаем перебирать числа от 2 до n
        for (int i = 2; i <= Math.sqrt(n); i++) {

            // если i является простым числом (т.е. isPrime[i] == true), то помечаем все его кратные как составные числа
            if (isPrime[i]) {
                for (int j = i*2; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // выводим все найденные простые числа
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + "|");
            }
        }
    }

    // тестируем метод
    public static void main(String[] args) {
        findPrimes(99999);
    }
}