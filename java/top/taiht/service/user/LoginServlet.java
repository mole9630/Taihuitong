package top.taiht.service.user;

import top.taiht.pojo.user.User;
import top.taiht.service.log.LogService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    // 可能经常用到,所以提取出来
    private UserService userService = new UserService();
    private LogService logService = new LogService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String userPhone = request.getParameter("u_phone");
        String userPassword = request.getParameter("u_password");
//        String selectRememberMe = request.getParameter("remember_me");
        String resultStr = null;

        // 调用UserService完成登录校验工作
        User user = userService.selectLogin(userPhone, userPassword);

        if (user != null) {
            // 写入登陆日志
            logService.insertLoginLog(user);

            // 登陆成功
            resultStr = "登录成功 --> 欢迎您:" ;
//            request.getSession().setAttribute("user", user);
            request.setAttribute("user", user);
            request.getRequestDispatcher("space.jsp").forward(request, response);
        }
        else {
            // 释放资源
            resultStr = userPhone + "用户不存在或者密码错误,请检查后重试.";
            request.setAttribute("message", resultStr);
            request.getRequestDispatcher("test.jsp").forward(request, response);
        }
    }
}
