package files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

public class ParseFile {
    public static void main(String[] args) throws IOException {
        File csv = new File("files/users.csv");
        List<String> lines = Files.readAllLines(csv.toPath());

        List<String> headers = Arrays.asList(lines.get(0).split(","));
        List<Map<String,String>> fileValues = new ArrayList<>();

        for(int i = 1;i<lines.size();i++){
            String line = lines.get(i);
            Map<String,String> lineValues = new HashMap<>();

            String[]values = line.split(",");
            for (int j = 0; j< values.length;j++){
                lineValues.put(headers.get(j),values[j] );
            }
            fileValues.add(lineValues);
        }
        System.out.println(fileValues);
    }
}
