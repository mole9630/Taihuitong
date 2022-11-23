package top.taiht.mapper.user;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import top.taiht.pojo.user.User;


public interface UserMapper {
    // 登录功能
    User selectLogin(@Param("userPhone") String userPhone, @Param("userPassword") String userPassword);

    // 注册功能
    int insertRegister(User user);

    // 根据手机号查询用户
    User selectUserByPhone(String userPhone);

    // 根据用户id查询用户
    @Select("select * from user where u_id = #{userId}")
    User selectUserById(Integer userId);

    // 查询用户参加活动总数
    @Select("select count(*) from event_staff where es_u_id = #{uID}")
    @ResultType(int.class)
    Integer selectEventCountByUserId(Integer uID);

    // 查询用户活动积分
    int selectEventPointByUserId(Integer uID);
}
