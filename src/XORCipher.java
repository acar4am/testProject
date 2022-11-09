public class XORCipher {
  public static void main(String[] args) {


        int key = 88;
        String msg = "Super secret msg";
        String encMsg = "";
        String decMsg = "";

        //encode message
        for(int i = 0; i < msg.length(); i++)
            encMsg = encMsg + (char) (msg.charAt(i) ^ key);

        System.out.println("Encoded message: " +encMsg);

        //decode message
        for(int i = 0; i < msg.length(); i++)
            decMsg = decMsg + (char) (encMsg.charAt(i) ^ key);

        System.out.println("Decoded message: "  + decMsg);
   }
}