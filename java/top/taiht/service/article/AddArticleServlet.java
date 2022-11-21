package top.taiht.service.article;

import top.taiht.pojo.article.Article;
import top.taiht.pojo.user.User;
import top.taiht.util.time.getTimestampUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AddArticleServlet", value = "/AddArticle")
public class AddArticleServlet extends HttpServlet {
    private getTimestampUtils getTimestampUtils = new getTimestampUtils();
    private ArticleService articleService = new ArticleService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String aTitle = request.getParameter("a_title");
        String aCover = request.getParameter("a_cover");
        String aContent = request.getParameter("a_content");
        String aAuthor = request.getParameter("a_author");

        int statusCode = -1;
        String resuleStr = null;

        // 判断不可为空的字段是否为空
        if (aTitle == null || aTitle.equals("") || aCover == null || aCover.equals("") || aContent == null || aContent.equals("") || aAuthor == null || aAuthor.equals("")) {
            resuleStr = "请填写完整信息,请检查后重试.";
            request.setAttribute("message", resuleStr);
            request.getRequestDispatcher("info.jsp").forward(request, response);
        } else {
            // 添加文章
            // 设置article对象值
            Article article = new Article();
            article.setaTitle(aTitle);
            article.setaCover(aCover);
            article.setaContent(aContent);
            article.setaAuthor(aAuthor);
            article.setaTime(getTimestampUtils.getTimestamp());

            //执行方法
            statusCode = articleService.insertArticle(article);


            if (statusCode == 1) {
                System.out.println("[info] '" + article.getaTitle() + "'新闻发布成功!");
                resuleStr = "'" + article.getaTitle() + "'新闻发布成功!";
                request.setAttribute("message", resuleStr);
                request.getRequestDispatcher("info.jsp").forward(request, response);
            } else {
                resuleStr = "系统繁忙,请稍后重试.";
            }
            request.setAttribute("message", resuleStr);
            request.getRequestDispatcher("info.jsp").forward(request, response);
        }
    }
}
