package org.example.shop;

import java.util.ArrayList;
import java.util.List;

public class ShopService {


    public void makeOrder(
            OrderListRepo orderRepo,
            String orderNumber,
            String customerName,
            Product[] orderedProducts
    ) {
        Order order = new Order(orderNumber, customerName,orderedProducts);
        orderRepo.addOrder(order);
    }

    public boolean isValidProduct(List<Product> productsList, Product product) {
        if(productsList.contains(product)) {
            return true;
        }
        return false;
    }
}