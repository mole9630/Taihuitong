package top.taiht.service.event;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import top.taiht.mapper.article.ArticleMapper;
import top.taiht.mapper.event.EventMapper;
import top.taiht.pojo.article.Article;
import top.taiht.pojo.event.Event;
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
}
