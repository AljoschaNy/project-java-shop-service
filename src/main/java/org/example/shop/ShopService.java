package org.example.shop;

import java.util.ArrayList;

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


}
