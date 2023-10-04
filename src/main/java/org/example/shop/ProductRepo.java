package org.example.shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProductRepo {
    private List<Product> products;

    public ProductRepo() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
        System.out.println("Product: " + product.name() + " has been added to Repo");
    }

    public void removeProduct(String productName) {
        int indexOfSearchedProductName = getIndexOfProduct(productName);
        if(indexOfSearchedProductName < 0) {
            System.out.println("Can't remove unknown product");
        } else {
            this.products.remove(indexOfSearchedProductName);
            System.out.println("Product: " + productName + " has been removed from Repo");
        }
    }

    private int getIndexOfProduct(String productName) {
        if(!this.products.isEmpty()) {
            for(Product product : this.products) {
                if (product.name().equals(productName)) {
                    return this.products.indexOf(product);
                }
            }
        }
        return -1;
    }

    public List<Product> getProducts() {
        return this.products;
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
