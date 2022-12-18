package lesson12;

import java.util.Arrays;
import java.util.List;

public class NumberSortEx {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,4,2,8,5,3);
        nums.sort(new MyComparator());
        System.out.println(nums);
    }
}
