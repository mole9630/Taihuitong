package top.taiht.service.user;

import top.taiht.pojo.user.SpaceInfo;
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
        // 创建spaceInfo对象
        SpaceInfo spaceInfo = new SpaceInfo();

        if (user != null) {
            // 写入登陆日志
            logService.insertLoginLog(user);

            if (user.getuStatus() == 0) {
                // 用户状态为0,表示用户已被禁用
                resultStr = user.getuName() + ":您的账号已被封禁.";
//            request.getSession().setAttribute("user", user);
                request.setAttribute("message", resultStr);
                request.getRequestDispatcher("info.jsp").forward(request, response);
            } else {
                // 用户状态为1,表示用户已被启用
                // 写入用户信息到SpaceInfo对象用于个人主页显示
                spaceInfo.setuID(user.getuId());
                spaceInfo.setuName(user.getuName());
                spaceInfo.setuPhone(user.getuPhone());
                spaceInfo.setuVillage(user.getuVillage());
                spaceInfo.setuPoint(userService.selectEventPointByUserId(user.getuId()));
                spaceInfo.setuStatus(user.getuStatus());
                spaceInfo.setuEventCount(userService.selectEventCountByUserId(user.getuId()));

                System.out.println("[info] " + userPhone + ":登录成功！");
//            request.getSession().setAttribute("user", user);
                request.setAttribute("user", user);
                request.setAttribute("spaceInfo", spaceInfo);
                request.getRequestDispatcher("space.jsp").forward(request, response);
            }
        }
        else {
            // 释放资源
            resultStr = userPhone + "用户不存在或者密码错误,请检查后重试.";
            request.setAttribute("message", resultStr);
            request.getRequestDispatcher("info.jsp").forward(request, response);
        }
    }
}
