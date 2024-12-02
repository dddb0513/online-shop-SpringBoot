package scut.javawebonlineshop.service;

import scut.javawebonlineshop.pojo.Orders;

import java.util.List;
import java.util.Map;

public interface OrdersService {
    List<Orders> getOrderList(Orders orders);

    void makeOrders(Orders orders);

    List<Orders> getAllOrders();

    void deleteUserInOrders(Orders orders);

    void updateOrderStatus(Orders orders);

    List<Map<String, Object>> getSalesData();


}
