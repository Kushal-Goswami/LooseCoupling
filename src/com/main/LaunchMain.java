package com.main;

import com.services.BlueDart;
import com.services.DHL;

public class LaunchMain {

    public static void main(String[] args) {

        Amazon amz = new Amazon();
        amz.setService(new DHL()); //setter injection
        boolean status = amz.deliverTheProduct(745.2);
        if (status)
            System.out.println("Product is delivered");

        else
            System.out.println("Failed to deliver");

    }

}
