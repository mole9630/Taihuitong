package top.taiht.service.log;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import top.taiht.mapper.log.LogMapper;
import top.taiht.pojo.log.Log;
import top.taiht.pojo.user.User;
import top.taiht.util.db.SqlSessionFactoryUtils;
import top.taiht.util.time.getTimestampUtils;

public class LogService {
    private SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();
    private getTimestampUtils getTimestampUtils = new getTimestampUtils();

    /**
     * 添加登录日志
     * @param user 用户信息
     */
    public void insertLoginLog(User user) {
        // 获取SqlSession对象
        SqlSession sqlSession = factory.openSession();
        // 获取Mapper对象接口的代理对象
        LogMapper logMapper = sqlSession.getMapper(LogMapper.class);
        //执行方法
        Log log = new Log();
        log.setuId(user.getuId());
        log.setlStartTime(getTimestampUtils.getTimestamp());
        log.setlEndTime(getTimestampUtils.getTimestamp());
        log.setlType("user.login");
        logMapper.insertLog(log);
        sqlSession.commit();
        // 释放资源
        sqlSession.close();
    }

    /**
     * 添加注册日志
     * @param user 用户信息
     */
    public void insertRegisterLog(User user) {
        // 获取SqlSession对象
        SqlSession sqlSession = factory.openSession();
        // 获取Mapper对象接口的代理对象
        LogMapper logMapper = sqlSession.getMapper(LogMapper.class);
        // 写入注册日志
        Log log = new Log();
        log.setuId(user.getuId());
        log.setlStartTime(getTimestampUtils.getTimestamp());
        log.setlEndTime(getTimestampUtils.getTimestamp());
        log.setlType("user.register");
        logMapper.insertLog(log);
        sqlSession.commit();
        // 释放资源
        sqlSession.close();
    }
}
