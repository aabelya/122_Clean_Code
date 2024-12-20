package com.epam.module5.task3;

abstract class PaymentMethod {
    abstract boolean validatePaymentDetails();
    abstract void processPayment(double amount);
}
