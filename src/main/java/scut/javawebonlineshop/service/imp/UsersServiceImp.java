package scut.javawebonlineshop.service.imp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scut.javawebonlineshop.mapper.UsersMapper;
import scut.javawebonlineshop.pojo.Result;
import scut.javawebonlineshop.pojo.Users;
import scut.javawebonlineshop.service.UsersService;

import java.util.List;

@Service
@Slf4j
public class UsersServiceImp implements UsersService {
    @Autowired
    private UsersMapper usersMapper;
    //向数据库users表添加用户信息
    @Override
    public void addUser(Users users) {
        users.setUserType(0);
        log.info("添加用户信息：{}",users);
        usersMapper.insertUser(users);
    }
    @Override
    public boolean checkUsername(Users users) {
        if (usersMapper.checkUsername(users)) {
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public int loginUser(Users users) {
        Integer userType = usersMapper.loginUser(users);
        if (userType==null){
            return 2;
        }
        else if (userType==1) {
            return 1;
        }
        else{
            return 0;
        }
    }

    @Override
    public void deleteUserInUsers(Users users) {
        usersMapper.deleteUserInUsers(users);
    }

    @Override
    public Result getUserEmail(Users users) {
        String email = usersMapper.getUserEmail(users);
        return Result.success(email);
    }

    @Override
    public List<Users> getAllUsers() {
        return usersMapper.getAllUsers();
    }

    @Override
    public Integer getUserBalance(Users users) {
        return usersMapper.getUserBalance(users);
    }

    @Override
    public void rechargeUserBalance(Users users) {
        usersMapper.rechargeUserBalance(users);
    }

}
