package com.services;

public class DHL implements DeliveryServices {

    @Override
    public boolean deliverItems(Double amount) {

        System.out.println("The product is delivered through DHL and the amount is " + amount);
        return true;
    }

}
