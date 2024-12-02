package scut.javawebonlineshop.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import scut.javawebonlineshop.pojo.Orders;
import scut.javawebonlineshop.pojo.Result;
import scut.javawebonlineshop.service.OrdersService;

import java.util.List;
import java.util.Map;

@RestController
@Slf4j
@CrossOrigin
public class OrdersController {
    @Autowired
    private OrdersService ordersService;
    @PostMapping("/getOrderList")
    Result getOrderList(@RequestBody Orders orders){
        List<Orders> orderList = ordersService.getOrderList(orders);
        return Result.success(orderList);
    }
    @PostMapping("/makeOrders")
    Result makeOrders(@RequestBody Orders orders){
        ordersService.makeOrders(orders);
        return Result.success();
    }
    @PostMapping("/getAllOrders")
    Result getAllOrders(){
        List<Orders> ordersList = ordersService.getAllOrders();
        return Result.success(ordersList);
    }

    @PostMapping("/deleteUserInOrders")
    public Result deleteUserInOrders(@RequestBody Orders orders)
    {
        ordersService.deleteUserInOrders(orders);
        return Result.success();
    }

    @PostMapping("/updateOrderStatus")
    public Result updateOrderStatus(@RequestBody Orders orders){
        ordersService.updateOrderStatus(orders);
        return Result.success();
    }

    @PostMapping("/getSalesData")
    public Result getSalesData(){
        return Result.success(ordersService.getSalesData());
    }



}
