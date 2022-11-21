package top.taiht.service.article;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import top.taiht.mapper.article.ArticleMapper;
import top.taiht.pojo.article.Article;
import top.taiht.util.db.SqlSessionFactoryUtils;
import top.taiht.util.time.getTimestampUtils;

public class ArticleService {
    private SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();
    private getTimestampUtils getTimestampUtils = new getTimestampUtils();


    public int insertArticle(Article article) {
        int statusCode = -1;
        // 获取SqlSession对象
        SqlSession sqlSession = factory.openSession();
        // 获取Mapper对象接口的代理对象
        ArticleMapper articleMapper = sqlSession.getMapper(ArticleMapper.class);
        //执行方法
        statusCode = articleMapper.insertNews(article);
        sqlSession.commit();
        // 释放资源
        sqlSession.close();

        return statusCode;
    }
}
