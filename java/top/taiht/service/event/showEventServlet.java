package top.taiht.service.event;

import top.taiht.pojo.event.Event;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "showEventServlet", value = "/showEventServlet")
public class showEventServlet extends HttpServlet {
    private EventService eventService = new EventService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Event> event = eventService.selectEvent();
        request.setAttribute("event", event);
        request.getRequestDispatcher("user/EventRegistration.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
