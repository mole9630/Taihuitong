package top.taiht.service.event;

import top.taiht.pojo.event.Event;
import top.taiht.pojo.event.EventStaff;
import top.taiht.pojo.user.User;
import top.taiht.service.user.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "showEventStatusServlet", value = "/admin/EventStatus")
public class showEventStatusServlet extends HttpServlet {
    private EventService eventService = new EventService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<EventStaff> eventStaffs = eventService.selectEventStaffByStatus();
        request.setAttribute("eventStaffs", eventStaffs);
        request.getRequestDispatcher("event_audit.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
