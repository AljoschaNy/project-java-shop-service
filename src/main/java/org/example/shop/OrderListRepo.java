package org.example.shop;

import java.util.ArrayList;
import java.util.Objects;

public class OrderListRepo {
    ArrayList<Order> orders;

    public OrderListRepo() {
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    private int getIndexOfOrder(String orderNumber) {
        if(!this.orders.isEmpty()) {
            for(Order order : this.orders) {
                if(order.orderNumber().equals(orderNumber)) {
                    return this.orders.indexOf(order);
                }
            }
        }
        return -1;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderListRepo that = (OrderListRepo) o;
        return Objects.equals(orders, that.orders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orders);
    }

    @Override
    public String toString() {
        return "OrderListRepo{" +
                "orders=" + orders +
                '}';
    }
}
