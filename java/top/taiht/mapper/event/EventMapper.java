package top.taiht.mapper.event;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import top.taiht.pojo.event.Event;
import top.taiht.pojo.event.EventStaff;

import java.util.List;

public interface EventMapper {
    // 添加活动
    int insertEvent(Event Event);

    // 根据活动id查询活动
    @Select("select * from event where e_id = #{eID}")
    @ResultMap("EventResultMap")
    Event selectEventById(Integer eID);

    // 活动展示(报名页)
    @Select("select * from event")
    @ResultMap("EventResultMap")
    List<Event> selectEvent();

    // 已报名活动审核状态展示
    @Select("select * from event_staff")
    @ResultMap("EventStaffResultMap")
    List<EventStaff> selectEventStaffByStatus();

    // 报名活动(添加活动报名信息)
    int insertEventStaff(EventStaff eventStaff);
}
