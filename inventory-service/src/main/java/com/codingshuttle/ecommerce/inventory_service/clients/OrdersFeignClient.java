package com.codingshuttle.ecommerce.inventory_service.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name= "order-service" , path = "/orders")   // make sure service name should be same for which we are making this
public interface OrdersFeignClient {

    @GetMapping("/core/helloOrders")
    public String helloOrders();
}
