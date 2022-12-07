package lesson12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("one", "","two","three","","","four");

        List<String> newList = new ArrayList<>(list);
//
//        for (String s : newList){
//            if(s.isEmpty()){
//                newList.remove(s);
//            }
//        }

        Iterator<String> iterator = newList.iterator();;

        while (iterator.hasNext()){
            String s = iterator.next();
            if(s.isEmpty()){
                iterator.remove();
            }
        }
      //  System.out.println(newList);

        List<String> dataValues = Arrays.asList("Name", "Jon", "Snow", "Workplace", "The Wall");

        Iterator<String> iterator1 = dataValues.iterator();
        String value = "";
        while (iterator1.hasNext()){
            if(iterator1.next().equals("Workplace")){
                value = iterator1.next();
            }
        }
        System.out.println(value);
    }

}
