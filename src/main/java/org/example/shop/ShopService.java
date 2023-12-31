package org.example.shop;

import java.util.ArrayList;
import java.util.List;

public class ShopService {
    OrderRepo orderRepo;

    public ShopService(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    public void makeOrder(
            ProductRepo allProducts,
            String orderNumber,
            String customerName,
            Product[] orderedProducts
    ) {
        boolean containsValidProducts = true;
        for(Product product: orderedProducts) {
            if(!isValidProduct(allProducts.getProducts(),product)) {
                containsValidProducts = false;
            }
        }

        if(containsValidProducts) {
            Order order = new Order(orderNumber, customerName,orderedProducts);
            this.orderRepo.addOrder(order);
        } else {
            System.out.println("Order contains invalid product");
        }
    }


    public boolean isValidProduct(List<Product> productsList, Product product) {
        if(productsList.contains(product)) {
            return true;
        }
        return false;
    }
}