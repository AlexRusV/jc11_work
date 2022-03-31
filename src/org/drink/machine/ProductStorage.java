package org.drink.machine;

public class ProductStorage<T extends Countable> {

    private T[] products;

    public ProductStorage(T[] products) {
        this.products = products;

    }

    public T[] getProducts() {
        return products;
    }

    public T getProductByNumber(int productNumber) {
        return products[productNumber - 1];
    }

    public boolean removeProduct(T selectedProduct) {
        if (selectedProduct.getCount() == 0) {
            return false;
        }
        selectedProduct.decreaseCount();
        return true;
    }
}