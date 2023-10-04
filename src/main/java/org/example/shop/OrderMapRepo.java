package org.example.shop;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class OrderMapRepo implements OrderRepo{
    Map<String, Order> orders;

    @Override
    public void addOrder(Order order) {
        orders = new HashMap<>();
    }

    @Override
    public void removeOrder(String orderNumber) {

    }

    @Override
    public String getName(String orderNumber) {
        return null;
    }

    public Map<String, Order> getOrders() {
        return orders;
    }

    public void setOrders(Map<String, Order> orders) {
        this.orders = orders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderMapRepo that = (OrderMapRepo) o;
        return Objects.equals(orders, that.orders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orders);
    }

    @Override
    public String toString() {
        return "OrderMapRepo{" +
                "orders=" + orders +
                '}';
    }
}
