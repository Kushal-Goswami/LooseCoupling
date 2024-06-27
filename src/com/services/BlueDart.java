package com.services;

public class BlueDart implements DeliveryServices {

    @Override
    public boolean deliverItems(Double amount) {

        System.out.println("The product is delivered through BlueDart and the amount is " + amount);
        return true;
    }

}
