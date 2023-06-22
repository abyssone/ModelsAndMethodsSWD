import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileDirectory = System.getProperty("user.dir") + "\\src\\" + "file.txt";

        printFileText(fileDirectory);
    }

    private static void printFileText(String fileDir) throws IOException {
        try{
            FileInputStream fileInputStream = new FileInputStream(fileDir);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream, 200);
            int i;

            while((i = bufferedInputStream.read()) != -1){
                System.out.print((char)i);
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}