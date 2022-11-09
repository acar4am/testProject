public class CmdLineArgs {
    /*
    To launch this program execute this in terminal
    C:\Users\Acar\.jdks\openjdk-18.0.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\In
telliJ IDEA Community Edition 2022.1\lib\idea_rt.jar=1096:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1\bin" -Df
ile -classpath C:\Users\Acar\IdeaProjects\testProject\out\production\testProject CmdLineArgs Tom
     */
    public static void main(String[] args) {
        String[][] numbers  = {
                {"Tom", "123-456"},
                {"Joe", "444-444"},
                {"Mary", "987-555"}
        };
        int i;

        //To use program one command-line argument must be present
        if(args.length != 1)
            System.out.println("Usage: java CmdLineArgs <name>");
        else {
            for(i = 0; i < numbers.length; i++){
                if(numbers[i][0].equals(args[0])) {
                    System.out.println(numbers[i][0]+ ": " +numbers[i][1]);
                    break;
                }
            }
            if( i == numbers.length)
                System.out.println("Name not found");
        }
    }
}
