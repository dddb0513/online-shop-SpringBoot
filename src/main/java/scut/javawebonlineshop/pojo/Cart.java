package scut.javawebonlineshop.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cart {
    private Integer cartId;
    private Integer proId;
    private Integer cartProNum;
    private String userName;
    private String cartProImg;
    private String proName;
}
