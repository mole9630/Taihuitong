package top.taiht.service.event;

import top.taiht.pojo.event.EventStaff;
import top.taiht.util.time.getTimestampUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "EnrollmentProcessingServlet", value = "/user/entryEvent")
public class EnrollmentProcessingServlet extends HttpServlet {
    private EventService eventService = new EventService();
    private getTimestampUtils getTimestampUtils = new getTimestampUtils();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int statusCode = -1;
        String resuleStr = null;
        EventStaff eventStaff = new EventStaff();
        eventStaff.setEsEID(Integer.parseInt(request.getParameter("eid")));
        eventStaff.setEsUID(Integer.parseInt(request.getParameter("uid")));
        eventStaff.setEsUName(request.getParameter("uname"));
        eventStaff.setEsEName(request.getParameter("ename"));
        eventStaff.setEsTime(getTimestampUtils.getTimestamp());
        statusCode = eventService.insertEventStaff(eventStaff);

        if (statusCode == 1) {
            System.out.println("[info] 活动报名成功!");
            resuleStr = "活动报名成功!";
            request.setAttribute("message", resuleStr);
            request.getRequestDispatcher("info.jsp").forward(request, response);
        } else {
            resuleStr = "系统繁忙,请稍后重试.";
            request.setAttribute("message", resuleStr);
            request.getRequestDispatcher("info.jsp").forward(request, response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
