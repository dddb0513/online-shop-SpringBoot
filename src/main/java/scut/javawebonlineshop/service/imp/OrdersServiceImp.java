package scut.javawebonlineshop.service.imp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scut.javawebonlineshop.mapper.OrdersMapper;
import scut.javawebonlineshop.pojo.Orders;
import scut.javawebonlineshop.service.OrdersService;

import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class OrdersServiceImp implements OrdersService {
    @Autowired
    private OrdersMapper ordersMapper;
    @Override
    public List<Orders> getOrderList(Orders orders){
        return ordersMapper.getOrderList(orders);
    }
    @Override
    public void makeOrders(Orders orders){
        ordersMapper.makeOrders(orders);
    }
    @Override
    public List<Orders> getAllOrders(){
        return ordersMapper.getAllOrders();
    }

    @Override
    public void deleteUserInOrders(Orders orders){
        ordersMapper.deleteUserInOrders(orders);
    }

    @Override
    public void updateOrderStatus(Orders orders){
        ordersMapper.updateOrderStatus(orders);
    }

    @Override
    public List<Map<String, Object>> getSalesData(){
        return ordersMapper.getSalesData();
    }
}
