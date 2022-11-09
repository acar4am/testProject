public class HelpTRY3_3 {
    //enhanced version with continue/break and outer loop for menu selection
    public static void main(String[] args)
            throws java.io.IOException{

        char choice,ignore;
        do{
            System.out.print("Help on:\n" +
                    "\t1. if\n" +
                    "\t2. switch\n" +
                    "\t3. for\n" +
                    "\t4. while\n" +
                    "\t5. do-while\n" +
                    "\t6. break\n" +
                    "\t7. continue\n"+
                    "Choose one(q to quit): ");

            choice = (char) System.in.read();
            do{
                ignore = (char) System.in.read();
            }while(ignore != '\n');

        }while(choice < '1' | choice > '7' & choice != 'q');
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
                break;
            case '6':
                System.out.println("The break:\n" +
                        "break; or break label;");
                break;
            case '7':
                System.out.println("The continue:\n" +
                        "continue; or continue label;");
                break;

        }
    }
}
