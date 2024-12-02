package scut.javawebonlineshop.mapper;

import org.apache.ibatis.annotations.*;
import scut.javawebonlineshop.pojo.Orders;

import java.util.List;
import java.util.Map;

@Mapper
public interface OrdersMapper {
    @Select("select * from orders where user_name=#{userName}")
    List<Orders> getOrderList(Orders orders);

    @Insert("insert into orders(user_name, pro_name, ord_num, order_date, total_price ,order_status) values(#{userName},#{proName},#{ordNum},#{orderDate},#{totalPrice},#{orderStatus}) ")
    void makeOrders(Orders orders);

    @Select("select * from orders order by user_name")
    List<Orders> getAllOrders();

    @Delete("DELETE FROM orders WHERE user_name=#{userName}")
    void deleteUserInOrders(Orders orders);

    @Update("UPDATE orders SET order_status=#{orderStatus} WHERE order_id=#{orderId}")
    void updateOrderStatus(Orders orders);

    @Select("SELECT pro_name, SUM(ord_num) AS totalOrderNum ,SUM(total_price) AS totalPrice FROM orders GROUP BY pro_name")
    List<Map<String, Object>> getSalesData();

}
