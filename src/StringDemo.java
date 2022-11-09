public class StringDemo {
    public static void main(String[] args) {

        String str1 = new String("Java strings are objects");
        String str2 = "They are constructed various ways";
        String str3 = new String(str2);
        String str4;

        //concatenate two strings
        str4 = str1+ "\s" +str2;
        System.out.println(str4);

        if(str3 == str2) System.out.println("str2 and str3 refer to the same object");

        //int length()
        // obtains length of string
        System.out.println("Length of str1 is:" +str1.length());

        System.out.println();

        //boolean equals(str)
        // returns true if invoking string contains same character sequence
        if(str2.equals(str3))
            System.out.println("str 2 equals() str3");

        System.out.println();

        //char charAt(index)
        // obtains char at given index
        for(int i = 0; i < str1.length(); i++) {
            System.out.println(str1.charAt(i));
            if (str1.charAt(i) == ' ') break;
        }

        //int compareTo(str)
        // returns less than 0 if invoking string is fewer
        //returns greater than 0 if invoking string is greater
        //returns 0 if strings are equal
        if(str1.compareTo(str2) < 0 )
            System.out.println("str1 string has fewer characters that str2");
        if(str2.compareTo(str3) == 0)
            System.out.println("str2 and str2 have same number of characters");

        System.out.println();

        //assign a new string to str2
        str2 = "Zero One Two Three One";

        //int indexOf(str)
        // searches invoking string for substring specified by str
        //returns -1 on failure
        //returns the index of first match
        System.out.println("First occurrence of \"One\" is at index: " +str2.indexOf("One"));
        //returns the index of last match
        System.out.println("Last occurrence of \"One\" is at index: " +str2.lastIndexOf("One"));

        System.out.println();

        //String substring(startIndex, endIndex)
        String orgstr = "To be or not to be that is the question";
        //creates a string that contains desired substring
        String substr = orgstr.substring(9,18);
        System.out.println("original string: " +orgstr);
        System.out.println("substring: " +substr);
    }
}
class StringArray{
    //program showcases how to handle string arrays
    public static void main(String[] args) {
        String[] strArr = {"It", "is", "what", "it", "is"};
        System.out.println("Original array: ");
        for(String s : strArr)
            System.out.print(s+ "\s");
        System.out.println();

        strArr[4] = "was, long time ago that you can't even remember it";

        System.out.println("Modified array: ");
        for(String s : strArr)
            System.out.print(s+ "\s");



    }
}
class TextBlock{
    public static void main(String[] args) {

        String txtblc = """
                This is a text block
                    It is very useful!""";

        System.out.println(txtblc);

    }
}