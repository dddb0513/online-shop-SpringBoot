package scut.javawebonlineshop.mapper;
import org.apache.ibatis.annotations.*;
import scut.javawebonlineshop.pojo.Users;

import java.util.List;
@Mapper
public interface UsersMapper {
    @Insert("insert into users(user_name,user_password,user_email,user_phone,user_address,user_type) values(#{userName},#{userPassword},#{userEmail},#{userPhone},#{userAddress},#{userType})")
    void insertUser(Users users) ;

    @Select("SELECT user_type FROM users WHERE user_name = #{userName} and user_password = #{userPassword}")
    Integer loginUser(Users users);

    @Select("SELECT COUNT(*) > 0 FROM users WHERE user_name = #{userName} and user_password = #{userPassword}")
    boolean checkUsername(Users users);

    @Delete("DELETE FROM users WHERE user_name=#{userName}")
    void deleteUserInUsers(Users users);

    @Select("SELECT user_email FROM users WHERE user_name = #{userName}")
    String getUserEmail(Users users);

    @Select("select * from users order by user_name")
    List<Users> getAllUsers();

    @Select("select user_balance from users where user_name=#{userName}")
    Integer getUserBalance(Users users);

    @Update("UPDATE users SET user_balance=#{userBalance} WHERE user_name=#{userName}")
    void rechargeUserBalance(Users users);
}
