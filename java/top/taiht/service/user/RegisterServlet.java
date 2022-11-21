package top.taiht.service.user;

import top.taiht.pojo.user.User;
import top.taiht.service.log.LogService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RegisterServlet", value = "/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    private UserService userService = new UserService();
    private LogService logService = new LogService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("u_name");
        String userPassword = request.getParameter("u_password");
        String userRePassword = request.getParameter("u_re_password");
        String userIdentificationNumber = request.getParameter("u_identification_number");
        String userPhone = request.getParameter("u_phone");
        String userSex = request.getParameter("u_sex");
        String uEthnic = request.getParameter("u_ethnic");
        String uVillage = request.getParameter("u_village");

        int statusCode = -1;
        String resuleStr = null;

        // 判断不可为空的字段是否为空
        if (userName == null || userName.equals("") || userRePassword == null || userRePassword.equals("") || userIdentificationNumber == null || userIdentificationNumber.equals("") || userPhone == null || userPhone.equals("") || userSex == null || userSex.equals("") || uEthnic == null || uEthnic.equals("") || uVillage == null || uVillage.equals("")) {
            resuleStr = "请填写完整信息,请检查后重试.";
            request.setAttribute("message", resuleStr);
            request.getRequestDispatcher("info.jsp").forward(request, response);
        } else if (!userPassword.equals(userRePassword)) {
            resuleStr = "两次密码不一致,请检查后重试.";
            request.setAttribute("message", resuleStr);
            request.getRequestDispatcher("info.jsp").forward(request, response);
        } else {
            // 判断手机号是否存在
            User userJudgment = userService.selectUserByPhone(userPhone);

            if (userJudgment != null) {
                System.out.println("[info] " + userPhone + "用户注册失败,可能是用户已存在.");
                resuleStr = userPhone + "用户已存在.";
                request.setAttribute("message", resuleStr);
                request.getRequestDispatcher("info.jsp").forward(request, response);
            } else {
                // 设置user对象值
                User user = new User();
                user.setuName(userName);
                user.setuPassword(userPassword);
                user.setuIdentificationNumber(userIdentificationNumber);
                user.setuPhone(userPhone);
                user.setuSex(Integer.valueOf(userSex));
                user.setuEthnic(uEthnic);
                user.setuVillage(uVillage);

                //执行方法
                statusCode = userService.insertRegister(user);

                // 写入注册日志
                logService.insertRegisterLog(user);

                if (statusCode == 1) {
                    System.out.println("[info] " + userPhone + "用户注册成功!");
                    request.setAttribute("user", user);
                    request.getRequestDispatcher("space.jsp").forward(request, response);
                } else {
                    resuleStr = "系统繁忙,请稍后重试.";
                }
                request.setAttribute("message", resuleStr);
                request.getRequestDispatcher("info.jsp").forward(request, response);
            }
        }
    }
}
