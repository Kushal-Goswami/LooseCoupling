package com.services;

public class FedEx implements DeliveryServices {

    @Override
    public boolean deliverItems(Double amount) {

        System.out.println("The product is delivered through FedEx and the amount is "+ amount);
        return true;
    }



}
