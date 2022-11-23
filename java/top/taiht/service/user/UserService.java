package top.taiht.service.user;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import top.taiht.mapper.event.EventMapper;
import top.taiht.mapper.user.UserMapper;
import top.taiht.pojo.user.User;
import top.taiht.util.db.SqlSessionFactoryUtils;

public class UserService {
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    /**
     * 登录校验工作
     * @param userPhone 用户手机号
     * @param userPassword 用户密码
     * @return 返回用户信息
     */
    public User selectLogin(String userPhone, String userPassword) {
        // 获取SqlSession对象
        SqlSession sqlSession = factory.openSession();
        // 获取Mapper对象接口的代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //执行方法
        User user = userMapper.selectLogin(userPhone, userPassword);
        // 释放资源
        sqlSession.close();

        return user;
    }

    /**
     * 注册时检验手机号是否已经被注册
     * @param userPhone 用户手机号
     * @return 返回已存在的用户信息/null
     */
    public User selectUserByPhone(String userPhone) {
        // 获取SqlSession对象
        SqlSession sqlSession = factory.openSession();
        // 获取Mapper对象接口的代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        // 判断手机号是否存在
        return userMapper.selectUserByPhone(userPhone);
    }

    /**
     * 用户注册功能
     * @param user 用户信息
     * @return 返回受影响的行数
     */
    public int insertRegister(User user) {
        int statusCode = -1;
        // 获取SqlSession对象
        SqlSession sqlSession = factory.openSession();
        // 获取Mapper对象接口的代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        // 执行方法
        statusCode = userMapper.insertRegister(user);
        sqlSession.commit();

        return statusCode;
    }

    /**
     * 根据用户id查询用户信息
     * @param userId 用户id
     * @return 返回用户信息
     */
    public User selectUserById(Integer userId) {
        // 获取SqlSession对象
        SqlSession sqlSession = factory.openSession();
        // 获取Mapper对象接口的代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        // 执行方法
        User user = userMapper.selectUserById(userId);
        // 释放资源
        sqlSession.close();

        return user;
    }

    /**
     * 根据用户ID查询用户参加活动总数
     * @param uID 用户ID
     * @return 返回参加活动总数
     */
    public Integer selectEventCountByUserId(Integer uID) {
        Integer num = -1;
        // 获取SqlSession对象
        SqlSession sqlSession = factory.openSession();
        // 获取Mapper对象接口的代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        // 执行方法

        return userMapper.selectEventCountByUserId(uID);
    }

    public int selectEventPointByUserId(Integer uID) {
        // 获取SqlSession对象
        SqlSession sqlSession = factory.openSession();
        // 获取Mapper对象接口的代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        // 执行方法
        return userMapper.selectEventPointByUserId(uID);
    }
}
