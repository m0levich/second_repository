package lesson_6.ITC_1.Task_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BasketClass implements Basket {

    Map<String,Integer> basket = new HashMap<String, Integer>();

    @Override
    public void addProduct(String product, int quantity) {
        basket.put(product,quantity);
    }

    @Override
    public void removeProduct(String product) {
        basket.remove(product);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        basket.put(product,quantity);
    }

    @Override
    public void clear() {
        basket.clear();
    }

    @Override
    public List<String> getProducts() {
        List <String> list = new ArrayList<String>(basket.keySet());
        return list;
    }

    @Override
    public int getProductQuantity(String product) {
        int quantity = basket.get(product);
        return quantity;
    }
}
