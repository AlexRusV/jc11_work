package org.drink.machine;

import java.util.Scanner;

public class UserDisplay {

    public void print(Product[] products) {
        for (int productNumber = 1; productNumber <= products.length; productNumber++) {
            int i = productNumber - 1;
            if (products[i] == null || products[i].getCount() <= 0)
                continue;
            System.out.println("[" + productNumber + "] " + products[i].getName() + " " + products[i].getPrice());
        }
    }

    public void promptSelectProduct() {
        System.out.println("Please select product:");
    }

    public int readProductNumber() {
        Scanner scanner = new Scanner(System.in);
        //TODO: create method to generate regexp dynamically
        String productNumberPattern = "[1-5]";
        boolean isCorrectValue = false;
        int productNumber = -1;
        while (!isCorrectValue) {
            if (scanner.hasNext(productNumberPattern)) {
                isCorrectValue = true;
                productNumber = scanner.nextInt();
            }
            scanner.nextLine();
        }
        return productNumber;
    }

    public void printPaymentPrompt(String productName, double price) {
        System.out.println("Product: " + productName + " price: " + price);
        System.out.println("Please pay with your bank card.");
    }

    public void printPaymentResult(boolean payResult) {
        String res = payResult ? "Payment complete" : "Payment error";
        System.out.println(res);
    }

    public void printPurchaseResult(boolean result) {
        String res = result ? "Please take your product" : "Product not available";
        System.out.println(res);
        System.out.println();
    }
}