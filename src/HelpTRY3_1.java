public class HelpTRY3_1 {

    public static void main(String[] args)
    throws java.io.IOException{

        char choice;

        System.out.print("Help on:\n" +
                "1. if\n" +
                "2. switch\n" +
                "Choose one: ");

        choice = (char) System.in.read();

        switch(choice){
            case '1' :
                System.out.println("The if:\n" +
                        "if(condition) statement;\n" +
                        "else statement;");
                break;
            case '2':
                System.out.println("The traditional switch:\n" +
                        "switch(expression){\n" +
                        "\tcase constant :\n" +
                        "\t\tstatement sequence\n" +
                        "\t\tbreak;\n" +
                        "\t// ...\n" +
                        "}");
                break;
            default :
                System.out.println("Selection not found");
        }
    }
}
