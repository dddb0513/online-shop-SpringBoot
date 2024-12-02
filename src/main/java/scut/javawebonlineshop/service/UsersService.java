package scut.javawebonlineshop.service;
import scut.javawebonlineshop.pojo.Result;
import scut.javawebonlineshop.pojo.Users;

import java.util.List;
public interface UsersService {
    void addUser(Users users);

    int loginUser(Users users);

    boolean checkUsername(Users users);

    void deleteUserInUsers(Users users);

    Result getUserEmail(Users users);

    List<Users> getAllUsers();

    Integer getUserBalance(Users users);

    void rechargeUserBalance(Users users);
}
