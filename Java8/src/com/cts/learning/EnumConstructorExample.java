package com.cts.learning;

enum Size {
    SMALL(30), MEDIUM(50), LARGE(70);
    
    private int price;
    
    Size(int price) { this.price = price; }

   public int getPrice() { return price; }
}

public class EnumConstructorExample {
    public static void main(String[] args) {
        System.out.println(Size.MEDIUM.getPrice()); // 50
    }
}
