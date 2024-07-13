import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FinallyWithResources {
    public static void main(String[] args) throws IOException {
        char[] arr = new char[100];
        FileReader fr = new FileReader("my.txt");
        try{
            fr.read(arr);
            System.out.println(arr);
        }catch(FileNotFoundException e){
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
        finally {
            fr.close();
        }
    }
}
