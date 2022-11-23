package top.taiht.service.event;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import top.taiht.mapper.article.ArticleMapper;
import top.taiht.mapper.event.EventMapper;
import top.taiht.pojo.article.Article;
import top.taiht.pojo.event.Event;
import top.taiht.pojo.event.EventStaff;
import top.taiht.util.db.SqlSessionFactoryUtils;
import top.taiht.util.time.getTimestampUtils;

import java.util.List;

public class EventService {
    private SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    /**
     * 添加活动
     * @param event 活动信息
     * @return 返回受影响的行数
     */
    public int insertEvent(Event event) {
        int statusCode = -1;
        // 获取SqlSession对象
        SqlSession sqlSession = factory.openSession();
        // 获取Mapper对象接口的代理对象
        EventMapper eventMapper = sqlSession.getMapper(EventMapper.class);
        //执行方法
        statusCode = eventMapper.insertEvent(event);
        sqlSession.commit();
        // 释放资源
        sqlSession.close();

        return statusCode;
    }

    /**
     * 活动展示(报名页)
     * @return 返回活动信息
     */
    public List<Event> selectEvent() {
        // 获取SqlSession对象
        SqlSession sqlSession = factory.openSession();
        // 获取Mapper对象接口的代理对象
        EventMapper eventMapper = sqlSession.getMapper(EventMapper.class);
        //执行方法
        List<Event> event = eventMapper.selectEvent();
        // 释放资源
        sqlSession.close();

        return event;
    }

    /**
     * 已报名活动审核状态展示
     * @return 返回活动信息
     */
    public List<EventStaff> selectEventStaffByStatus() {
        // 获取SqlSession对象
        SqlSession sqlSession = factory.openSession();
        // 获取Mapper对象接口的代理对象
        EventMapper eventMapper = sqlSession.getMapper(EventMapper.class);
        //执行方法
        List<EventStaff> eventStaff = eventMapper.selectEventStaffByStatus();
        // 释放资源
        sqlSession.close();

        return eventStaff;
    }

    /**
     * 根据活动id查询活动
     * @param eID 活动id
     * @return 返回活动信息
     */
    public Event selectEventById(Integer eID) {
        // 获取SqlSession对象
        SqlSession sqlSession = factory.openSession();
        // 获取Mapper对象接口的代理对象
        EventMapper eventMapper = sqlSession.getMapper(EventMapper.class);
        //执行方法
        Event event = eventMapper.selectEventById(eID);
        // 释放资源
        sqlSession.close();

        return event;
    }

    /**
     * 报名活动(添加活动报名信息)
     * @param eventStaff 活动报名信息
     * @return 返回受影响的行数
     */
    public int insertEventStaff(EventStaff eventStaff) {
        int statusCode = -1;
        // 获取SqlSession对象
        SqlSession sqlSession = factory.openSession();
        // 获取Mapper对象接口的代理对象
        EventMapper eventMapper = sqlSession.getMapper(EventMapper.class);
        //执行方法
        statusCode = eventMapper.insertEventStaff(eventStaff);
        sqlSession.commit();
        // 释放资源
        sqlSession.close();

        return statusCode;
    }

    /**
     * 活动报名审核
     * @param esID 活动报名id
     * @param esStatus 活动报名状态
     * @return 返回受影响的行数
     */
    public int updateEventStaffStatus(Integer esID, Integer esStatus) {
        int statusCode = -1;
        // 获取SqlSession对象
        SqlSession sqlSession = factory.openSession();
        // 获取Mapper对象接口的代理对象
        EventMapper eventMapper = sqlSession.getMapper(EventMapper.class);
        //执行方法
        statusCode = eventMapper.updateEventStaffStatus(esID, esStatus);
        sqlSession.commit();
        // 释放资源
        sqlSession.close();

        return statusCode;
    }
}
