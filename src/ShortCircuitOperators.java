public class ShortCircuitOperators {
    public static void main(String[] args) {
        int n, d, q;
        n = 10;
        d = 2;
        if(d != 0 && (n % d) == 0)
            System.out.println(d + " is a factor of " + n);
        d = 0; // now, set d to zero
// Since d is zero, the second operand is not evaluated.
        if(d != 0 && (n % d) == 0)
            System.out.println(d + " is a factor of " + n);
/* Now, try same thing without short-circuit operator.
The short-circuit
operator prevents
a division by zero.
Chapter 2: Introducing Data Types and Operators 53
This will cause a divide-by-zero error.
*/
        if(d != 0 & (n % d) == 0)//both operands are valued and compile error occurs
            System.out.println(d + " is a factor of " + n);
    }
}
