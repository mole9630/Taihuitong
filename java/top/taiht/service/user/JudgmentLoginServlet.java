package top.taiht.service.user;

import top.taiht.pojo.user.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "JudgmentLoginServlet", value = "/admin")
public class JudgmentLoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        Cookie cookie = null;
        String resuleStr = null;
        boolean flag = true;
        if (user == null) {
            request.getRequestDispatcher("user.jsp").forward(request, response);
//            response.sendRedirect("login.jsp");  //= 报出NullPointerException的错误
        }
        else {
            flag = false;
            response.getWriter().println("欢迎您" + user.getuName() + ",<a href='/LoginOutServlet'>退出</a>");
            cookie = new Cookie("JSESSIONID", session.getId());
            cookie.setMaxAge(60 * 60 * 24 * 3); // cookie的存在周期为3天
            response.sendRedirect("space.jsp");
        }
        cookie.setPath("/");
        response.addCookie(cookie);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
