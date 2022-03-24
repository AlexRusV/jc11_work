package org.drink.machine;

public class ProductStorage {

    private Product[] products;

    public ProductStorage() {
        products = new Product[5];
        products[0] = new Product("Coca-Cola", 2.0, 5);
        products[1] = new Product("Fanta", 2.0, 5);
        products[2] = new Product("Sprite", 2.0, 5);
        products[3] = new Product("Fuse Tea", 1.50, 5);
        products[4] = new Product("Bonaqua", 1.09, 5);
    }

    public Product[] getProducts() {
        return products;
    }

    public Product getProductsByNumber(int productNumber) {
        return products[productNumber -1];
    }

    public boolean removeProduct(Product selectedProduct) {
        if (selectedProduct.getCount() == 0) {
            return false;
        }
        selectedProduct.decreaseCount();
        return true;
    }
}

