package scut.javawebonlineshop.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    private Integer userId;
    private String userName;
    private String userPassword;
    private String userEmail;
    private String userPhone;
    private String userAddress;
    private int userType;
    private Integer userBalance;
}
