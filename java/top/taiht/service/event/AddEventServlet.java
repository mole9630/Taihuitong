package top.taiht.service.event;

import top.taiht.pojo.article.Article;
import top.taiht.pojo.event.Event;
import top.taiht.util.time.getTimestampUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddEventServlet", value = "/AddEvent")
public class AddEventServlet extends HttpServlet {
    private EventService eventService = new EventService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String eName = request.getParameter("e_name");
        String ePeopleNumberStr = request.getParameter("e_people_number");
        String eAddress = request.getParameter("e_address");
        String eStartTime = request.getParameter("e_start_time");
        String eEndTime = request.getParameter("e_end_time");
        String eIntroduction = request.getParameter("e_introduction");
        String ePointStr = request.getParameter("e_point");

        int statusCode = -1;
        String resuleStr = null;

        // 判断不可为空的字段是否为空
        if (eName == null || eName.equals("") || ePeopleNumberStr == null || ePeopleNumberStr.equals("") || eAddress == null || eAddress.equals("") || eIntroduction == null || eIntroduction.equals("") || ePointStr == null || ePointStr.equals("")) {
            resuleStr = "请填写完整信息,请检查后重试.";
            request.setAttribute("message", resuleStr);
            request.getRequestDispatcher("info.jsp").forward(request, response);
        } else {
            // 类型转换
            Integer ePeopleNumber = Integer.parseInt(ePeopleNumberStr);
            Integer ePoint = Integer.parseInt(ePointStr);
            eStartTime = eStartTime.replace("T", " ");
            eEndTime = eEndTime.replace("T", " ");

            // 添加文章
            // 设置article对象值
            Event event = new Event();
            event.seteName(eName);
            event.setePeopleNumber(ePeopleNumber);
            event.seteAddress(eAddress);
            event.seteStartTime(eStartTime);
            event.seteEndTime(eEndTime);
            event.seteIntroduction(eIntroduction);
            event.setePoint(ePoint);

            // 执行方法
            statusCode = eventService.insertEvent(event);

            if (statusCode == 1) {
                System.out.println("[info] '" + event.geteName() + "'活动发布成功!");
                resuleStr = "'" + event.geteName() + "'活动发布成功!";
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
