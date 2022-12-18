package lesson13;

import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaEx {
    public static void main(String[] args) {
        Iface iface = (s,k) -> {
            System.out.println(k);
            return s;
        };

        iface.someMethod("param",0);

        Predicate<String> stringPredicate = sParam -> sParam.contains("java");
//        System.out.println(stringPredicate.test("java auto"));
//        System.out.println(stringPredicate.test("ooops jav"));
//
//        Consumer<Integer> consumer = inValue -> System.out.println(inValue*10);
//        consumer.accept(10);
//
        Supplier<Double> supplier = () -> {
            Random random = new Random();
            return random.nextDouble();
        };

//        System.out.println(supplier.get());
//
//        System.out.println(supplier.get());

        Function<String,Integer> function = Integer::parseInt;

        System.out.println(function.apply("-4"));
        System.out.println(function.apply("0"));
    }
}
