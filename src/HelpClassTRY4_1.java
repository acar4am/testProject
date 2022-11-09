
class Help{

    void helpOn(int what){
        switch(what){
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

            case '`':
                System.out.println("" +
                        "\n" +
                                "                Y.                      _             \n" +
                                "                YiL                   .```.           \n" +
                                "   much world   Yii;                .; .;;`.          \n" +
                                "                YY;ii._           .;`.;;;; :          \n" +
                                " such hello     iiYYYYYYiiiii;;;;i` ;;::;;;;          \n" +
                                "            _.;YYYYYYiiiiiiYYYii  .;;.   ;;;          \n" +
                                "         .YYYYYYYYYYiiYYYYYYYYYYYYii;`  ;;;;          \n" +
                                "       .YYYYYYY$$YYiiYY$$$$iiiYYYYYY;.ii;`..          \n" +
                                "      :YYY$!.  TYiiYY$$$$$YYYYYYYiiYYYYiYYii.         \n" +
                                "      Y$MM$:'  :YYYYYY$! `` 4YYYYYiiiYYYYiiYY.        \n" +
                                "   `.;MMM$$b.,dYY$$Yii  :'   :YYYYllYiiYYYiYY         \n" +
                                "_.._ :H4MM$!YYYYYYYYYii,.__.diii$$YYYYYYYYYYY         \n" +
                                ".,._ $b`P`      4$$$$$iiiiiiii$$$$YY$$$$$$YiY;        \n" +
                                "   `*&&$:       :$$$$$$$$$YYYYY$$$$$$$$$YYiiYYL       \n" +
                                "   &&&;$$.    .;PPb$`.,.``T$$YY$$$$YYYYYYiiiYYU:      \n" +
                                "    ;$P$;;: ;;;;i$y$ !Y$$$b;$$$Y$YY$$YYYiiiYYiYY      \n" +
                                "    $Fi$$ .. ``:iii.`- :YYYYY$$YY$$$$$YYYiiYiYYY      \n" +
                                "    :Y$$rb ````  `_..;;i;YYY$YY$$$$$$$YYYYYYYiYY:     \n" +
                                "     :$$$$$i;;iiiiidYYYYYYYYYY$$$$$$YYYYYYYiiYYYY.    \n" +
                                "      `$$$$$$$YYYYYYYYYYYYY$$$$$$YYYYYYYYiiiYYYYYY    \n" +
                                "      .i!$$$$$$YYYYYYYYY$$$$$$YYY$$YYiiiiiiYYYYYYY    \n" +
                                "     :YYiii$$$$$$$YYYYYYY$$$$YY$$$$YYiiiiiYYYYYYi'    ");
        }
    }


    void showMenu(){
    System.out.print("Help on:\n" +
            "\t1. if\n" +
            "\t2. switch\n" +
            "\t3. for\n" +
            "\t4. while\n" +
            "\t5. do-while\n" +
            "\t6. break\n" +
            "\t7. continue\n"+
            "Choose one(q to quit)(press ` for doge): ");


    }


    boolean isValid(int ch){
        if(ch == '`') return true;
        if(ch < '1' | ch > '7' & ch != 'q')
            return false;
        else return true;

    }

}
class HelpClassTRY4_1 {
    public static void main(String[] args)
    throws java.io.IOException{

        char choice, ignore;

        Help hlpObj = new Help();

        for(;;) {
            do {
                hlpObj.showMenu();

                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');

            } while (!hlpObj.isValid(choice));

            if(choice == 'q') break;


            hlpObj.helpOn(choice);

        }





    }
}
