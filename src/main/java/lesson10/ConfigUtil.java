package lesson10;

import java.io.FileNotFoundException;
import java.util.Random;

public class ConfigUtil {
    public void getConfigPropert() throws FileNotFoundException, InterruptedException {
        try {
//            File configFile = new File("config.json");
//            FileReader reader = new FileReader(configFile);
            Thread.sleep(1000);
//        }catch (FileNotFoundException | InterruptedException fileNotFoundException){
//            fileNotFoundException.printStackTrace();
//            throw fileNotFoundException;
//        }
        }finally {
            System.out.println("Finally step");
        }

    }

    public void methodWithException(){
        Random random = new Random();
        int a = random.nextInt(6) % 2;

        //System.out.println(2/a);
    }

    public  void clickButton(){
        int a = 0;
            throw  new ButtonNotFoundException("Admin page","Create new user");
        }
    }

