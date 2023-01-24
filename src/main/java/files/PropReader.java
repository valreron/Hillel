package files;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropReader {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader("files/test.properties"));

        System.out.println(properties.get("url"));
        System.out.println(properties.get("pass"));

    }
}
