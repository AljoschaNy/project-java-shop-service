package org.example.shop;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class OrderMapRepo implements OrderRepo{
    Map<String, Order> orders;

    public OrderMapRepo() {
        orders = new HashMap<>();
    }

    @Override
    public void addOrder(Order order) {
        orders.put(order.orderNumber(), order);
    }

    @Override
    public void removeOrder(String orderNumber) {
        String keyOfSearchedOrder = getKeyOfOrder(orderNumber);
        if(keyOfSearchedOrder.equals(null)) {
            System.out.println("Can't find the order");
        } else {
            this.orders.remove(orderNumber);
            System.out.println("Order: " + orderNumber + " has been removed from Repo");

        }

    }

    @Override
    public String getName(String orderNumber) {
        return null;
    }

    private String getKeyOfOrder(String orderNumber) {
        if(!this.orders.isEmpty()) {
            for(var order : orders.entrySet()) {
                if(order.getKey().equals(orderNumber)) {
                    System.out.println("Oh yeah");
                    return order.getKey();
                }
            }
        }
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
