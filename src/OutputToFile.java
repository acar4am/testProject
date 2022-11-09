import java.io.*;

public class OutputToFile {
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter((new FileWriter("C:\\Users\\Acar\\IdeaProjects\\testProject\\out\\production\\testProject\\example.txt")));
            String text;
            while(!(text = br.readLine()).equals("END")){
                bw.write(text + "\n");
                bw.flush();

            }
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
