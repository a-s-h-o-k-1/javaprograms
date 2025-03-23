package com.cts.learning;

enum OrderStatus {
    NEW, PROCESSING, COMPLETED, CANCELED
}

public class OrderService {
    public static void main(String[] args) {
        updateOrderStatus(OrderStatus.PROCESSING);
    }
    public static  void updateOrderStatus(OrderStatus status) {
        System.out.println("Order status updated to: " + status);
    }
}
