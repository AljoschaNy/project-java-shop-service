package org.example.shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProductRepo {
    private List<Product> products;

    public ProductRepo() {
        products = new ArrayList<>();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductRepo that = (ProductRepo) o;
        return Objects.equals(products, that.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products);
    }

    @Override
    public String toString() {
        return "ProductRepo{" +
                "products=" + products +
                '}';
    }
}
