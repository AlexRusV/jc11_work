package org.drink.machine;

import java.util.Scanner;

public class DrinkAutomat {

    private final UserDisplay userDisplay;
    private final ProductStorage productStorage;

    public DrinkAutomat() {
        this.userDisplay = new UserDisplay();
        this.productStorage = new ProductStorage();
    }

    public void work() {
        while (true) {
            showProducts();
            Product selectedProduct = selectProduct();
            payProduct(selectedProduct);
            if (!giveProduct(selectedProduct)) break;
        }
    }

    private void showProducts() {
        userDisplay.print(productStorage.getProducts());
    }

    private Product selectProduct() {
        userDisplay.promptSelectProduct();
        int productNumber = userDisplay.readProductNumber();
        return productStorage.getProductsByNumber(productNumber);
    }

    private boolean payProduct(Product selectedProduct) {
        String productName = selectedProduct.getName();
        double price = selectedProduct.getPrice();
        userDisplay.printPaymentPrompt(productName, price);
        //TODO: call payment interface
        boolean payResult = true;
        userDisplay.printPaymentResult(payResult);
        return payResult;
    }

    private boolean giveProduct(Product selectedProduct) {
        boolean result = productStorage.removeProduct(selectedProduct);
        userDisplay.printPurchaseResult(result);
        return result;
    }
}
