package com.main;

import com.services.DeliveryServices;

public class Amazon {

    private DeliveryServices service;

    public void setService(DeliveryServices service) // DeliveryService service=new BlueDart();
    {
        this.service = service;
    }

    public boolean deliverTheProduct(Double amount) {
        return service.deliverItems(amount);
    }

}
