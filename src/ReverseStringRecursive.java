public class ReverseStringRecursive{

    public static String reverse(String str) {
        if ((null == str) || (str.length() <= 1)) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        var str = "Really took me 3 hours";
        System.out.println(reverse(str));
    }
}
