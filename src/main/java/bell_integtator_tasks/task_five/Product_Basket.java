package bell_integtator_tasks.task_five;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Product_Basket implements Basket {
    private Map<String, Integer> products = new HashMap<>();

    @Override
    public void addProduct(String product, int quantity) {
        if (products.containsKey(product)) {
            System.out.println("Продукт уже был добавлен в корзину ранее");
        } else {
            products.put(product, quantity);
        }
    }

    @Override
    public void removeProduct(String product) {
        products.remove(product);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        for (Map.Entry<String, Integer> prod : products.entrySet()) {
            if (prod.getKey().equals(product)) {
                prod.setValue(quantity);
            }
        }
    }

    @Override
    public void clear() {
        products.clear();
    }

    @Override
    public List<String> getProducts() {
        return new ArrayList<>(products.keySet());
    }

    @Override
    public int getProductQuantity(String product) {
        return products.get(product);
    }
}

