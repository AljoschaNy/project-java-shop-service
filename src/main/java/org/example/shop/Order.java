package org.example.shop;

public record Order(
        String orderNumber,
        String customerName,
        Product[] products
) {
}
