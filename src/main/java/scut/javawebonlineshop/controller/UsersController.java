package scut.javawebonlineshop.controller;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import scut.javawebonlineshop.pojo.Result;
import scut.javawebonlineshop.pojo.Users;
import scut.javawebonlineshop.service.UsersService;

@CrossOrigin
@Slf4j
@RestController
public class UsersController {
    @Autowired
    private UsersService usersService;

    //向数据库添加新用户
    @PostMapping("/addUser")
    public Result addUser(@RequestBody Users users) {
        usersService.addUser(users);
        return Result.success();
    }
    @PostMapping("/checkUsername")
    public Result checkUsername(@RequestBody Users users){
        if(usersService.checkUsername(users)){
            return Result.success();
        }
        return Result.error("用户不存在");
    }
    @PostMapping("/loginUser")
    public Result loginUser(@RequestBody Users users) {
        Users user=new Users() ;
        if(usersService.loginUser(users)==2){
            return Result.error("用户名或密码错误");
        }else if (usersService.loginUser(users)==1) {
            user.setUserType(1);
            return Result.success(user);
        } else {
            user.setUserType(0);
            return Result.success(user);
        }
    }

    @PostMapping("/deleteUserInUsers")
    public Result deleteUserInUsers(@RequestBody Users users){
        usersService.deleteUserInUsers(users);
        return Result.success();
    }
    @PostMapping("/getUserEmail")
    public Result getUserEmail(@RequestBody Users users){
        return Result.success(usersService.getUserEmail(users));
    }

    @PostMapping("/getAllUsers")
    public Result getAllUsers(){
        return Result.success(usersService.getAllUsers());
    }

    @PostMapping("/getUserBalance")
    public Result getUserBalance(@RequestBody Users users){
        return Result.success(usersService.getUserBalance(users));
    }

    @PostMapping("/rechargeUserBalance")
    public Result rechargeUserBalance(@RequestBody Users users){
        usersService.rechargeUserBalance(users);
        return Result.success();
    }
}
