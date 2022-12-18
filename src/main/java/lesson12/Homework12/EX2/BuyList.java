package lesson12.Homework12.EX2;

import java.util.*;

public class BuyList {
    public static void main(String[] args) {
        BuyList buyList = new BuyList();
        String[] product = {"car", "phone", "bread", "sofa", "bag","house","potatoes","tomatoes","TV","PS","XBOX"};
        List<Product> list = new ArrayList<>();
        Map<String, Integer> buyerMap = new HashMap<>();
        System.out.println();

        System.out.println(buyList.createList(product, list));

        buyList.sorting(buyerMap, list);

        System.out.println("End list: " + buyerMap);
        System.out.println("Summary of all products is: " + buyList.sumCalculation(buyerMap));
    }

    public List<Product> createList(String[] product, List<Product> list) {
        Random random = new Random();
        for (int i = 0; i < random.nextInt(1, 20); i++) {
            String name = product[random.nextInt(product.length)];
            int count = random.nextInt(20);
            list.add(new Product(name, count));
        }
        return list;
    }

    public Map<String, Integer> sorting(Map<String, Integer> buyerMap, List<Product> list) {
        for (Product product1 : list) {
            if (buyerMap.containsKey(product1.getProductName())) {
                buyerMap.put(product1.getProductName(), buyerMap.get(product1.getProductName()) + product1.getCount());
            } else {
                buyerMap.put(product1.getProductName(), product1.getCount());
            }
        }
        return buyerMap;
    }

    public int sumCalculation(Map<String, Integer> buyerMap) {
        int sum = 0;
        for (Map.Entry<String, Integer> value : buyerMap.entrySet()) {
            sum += value.getValue();
        }
        return sum;
    }
}
