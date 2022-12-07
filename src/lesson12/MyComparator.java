package lesson12;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer num1, Integer num2) {
        if(num1 %2 ==0 && num2 %2 != 0) return -1;
        if(num1 %2 !=0 && num2 %2 == 0) return 1;
        return num1.compareTo(num2);
    }
}
