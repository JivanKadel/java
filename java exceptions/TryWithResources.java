import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("my.txt");){
            int i = 0;
            while((i=fr.read())!=-1){
                System.out.print((char)i);
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
