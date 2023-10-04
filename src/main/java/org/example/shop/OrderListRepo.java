package org.example.shop;

import java.util.ArrayList;
import java.util.Objects;

public class OrderListRepo implements OrderRepo {
    ArrayList<Order> orders;

    public OrderListRepo() {
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        this.orders.add(order);
        System.out.println("Order: " + order.orderNumber() + " has been added to Repo");

    }

    public void removeOrder(String orderNumber) {
        int indexOfSearchedOrder = getIndexOfOrder(orderNumber);
        if(indexOfSearchedOrder < 0) {
            System.out.println("Can't remove unknown order number");
        } else {
            this.orders.remove(indexOfSearchedOrder);
            System.out.println("Order: " + orderNumber + " has been removed from Repo");
        }
    }

    public String getName(String orderNumber) {
        int indexOfSearchedOrder = getIndexOfOrder(orderNumber);
        if(indexOfSearchedOrder < 0) {
            return null;
        }
        return orders.get(indexOfSearchedOrder).customerName();
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
