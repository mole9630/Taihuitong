package top.taiht.service.event;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import top.taiht.mapper.article.ArticleMapper;
import top.taiht.mapper.event.EventMapper;
import top.taiht.pojo.article.Article;
import top.taiht.pojo.event.Event;
import top.taiht.util.db.SqlSessionFactoryUtils;
import top.taiht.util.time.getTimestampUtils;

public class EventService {
    private SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

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
}
