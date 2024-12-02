package scut.javawebonlineshop.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Orders {
    private Integer orderId;
    private String userName;
    private String proName;
    private Integer ordNum;
    private LocalDateTime orderDate;
    private BigDecimal totalPrice;
    private String sendAddress;
    private String receiveAdress;
    private String orderStatus;
}
