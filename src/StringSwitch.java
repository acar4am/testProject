public class StringSwitch  {
    public static void main(String[] args) {

        String command = "cancel";

        switch(command) {
            case "connect":
                System.out.println("connecting");
                break;
            case "cancel" :
                System.out.println("canceling");
                break;
            default:
                System.out.println("command error!");
                break;
        }
    }
}
