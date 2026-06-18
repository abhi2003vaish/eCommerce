package com.codingshuttle.ecommerce.order_service.controller;

import com.codingshuttle.ecommerce.order_service.clients.InventoryOpenFeignClient;
import com.codingshuttle.ecommerce.order_service.dto.OrderRequestDTO;
import com.codingshuttle.ecommerce.order_service.service.OrdersService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/core")
public class OrdersController {

    private final OrdersService orderService;

    @GetMapping("/helloOrders")
    public String helloOrders(){
        return "Hello from Orders Service";
    }

    @PostMapping("create-order")
    public ResponseEntity<OrderRequestDTO> createOrder(@RequestBody OrderRequestDTO orderRequestDTO){
        OrderRequestDTO orderRequestDTO1=orderService.createOrder(orderRequestDTO);
        return ResponseEntity.ok(orderRequestDTO1);


    }

    @GetMapping
    public ResponseEntity<List<OrderRequestDTO>> getAllOrders(HttpServletRequest httpServletRequest) {
        log.info("Fetching all orders via controller");
        List<OrderRequestDTO> orders = orderService.getAllOrders();
        return ResponseEntity.ok(orders);  // Returns 200 OK with the list of orders
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderRequestDTO> getOrderById(@PathVariable Long id) {
        log.info("Fetching order with ID: {} via controller", id);
        OrderRequestDTO order = orderService.getOrderById(id);
        return ResponseEntity.ok(order);  // Returns 200 OK with the order
    }
}
