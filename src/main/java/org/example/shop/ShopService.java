package org.example.shop;

import java.util.ArrayList;
import java.util.List;

public class ShopService {

    OrderRepo orderListRepo;
    OrderRepo orderMapRepo;

    public ShopService(OrderListRepo orderListRepo) {
        this.orderListRepo = orderListRepo;
    }
    public ShopService(OrderMapRepo orderMapRepo) {
        this.orderMapRepo = orderMapRepo;
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
            if(orderListRepo != null) {
                this.orderListRepo.addOrder(order);
            } else {
                this.orderMapRepo.addOrder(order);
            }

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