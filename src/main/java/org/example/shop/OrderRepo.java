package org.example.shop;

public interface OrderRepo {
    void addOrder();
    void removeOrder();
    String getName(String orderNumber);
}
