package top.taiht.service.event;

import top.taiht.pojo.event.EventStaff;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ModifyEventStatusServlet", value = "/admin/modifyEventStatus")
public class ModifyEventStatusServlet extends HttpServlet {
    private EventService eventService = new EventService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int statusCode = -1;
        String resuleStr = null;
        EventStaff eventStaff = new EventStaff();
        Integer esid = Integer.valueOf(request.getParameter("esid"));
        Integer status = Integer.valueOf(request.getParameter("status"));

        statusCode = eventService.updateEventStaffStatus(esid, status);

        if (statusCode == 1) {
            System.out.println("[info] 修改审核状态成功!");
            response.sendRedirect("/admin/EventStatus");
//            resuleStr = "修改审核状态成功!";
//            request.setAttribute("message", resuleStr);
//            request.getRequestDispatcher("../info.jsp").forward(request, response);
        } else {
            resuleStr = "系统繁忙,请稍后重试.";
            request.setAttribute("message", resuleStr);
            request.getRequestDispatcher("../info.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
