public class HelpTRY3_2 {
//Help system that uses do-while to process menu selection
    public static void main(String[] args)
            throws java.io.IOException{

        char choice,ignore;
        do{
            System.out.print("Help on:\n" +
                        "\t1. if\n" +
                        "\t2. switch\n" +
                        "\t3. for\n" +
                        "\t4. while\n" +
                        "\t5. do-while\n"+
                        "Choose one: ");

            choice = (char) System.in.read();
            do{
                ignore = (char) System.in.read();
            }while(ignore != '\n');

        }while(choice < '1' | choice > '5');
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
            case '3' :
                System.out.println("The for:\n" +
                        "for(initialization; condition; iteration)\n" +
                        "\tstatement");
                break;
            case '4':
                System.out.println("The while:\n" +
                        "while(condition) statement");
                break;
            case '5':
                System.out.println("The do-while:\n" +
                        "do{\n" +
                        "\tstatement;\n" +
                        "}while (condition);");

        }
    }
}
