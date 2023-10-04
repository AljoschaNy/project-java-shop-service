package org.example.shop;

public interface OrderRepo {
    void addOrder(Order order);
    void removeOrder(String orderNumber);
    String getName(String orderNumber);
}
