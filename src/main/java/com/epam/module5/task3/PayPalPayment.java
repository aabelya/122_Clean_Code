package com.epam.module5.task3;

class PayPalPayment extends PaymentMethod {
    boolean validatePaymentDetails() {
        // Validate PayPal account
    }

    void processPayment(double amount) {
        // Log in to PayPal and process payment
        // Throws UnsupportedOperationException if the PayPal account is not linked to a bank account
    }
}

