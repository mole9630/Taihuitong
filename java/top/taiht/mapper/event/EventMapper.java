package top.taiht.mapper.event;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import top.taiht.pojo.event.Event;

import java.util.List;

public interface EventMapper {
    // 添加活动
    public int insertEvent(Event Event);

    // 活动展示(报名页)
    @Select("select * from event")
    @ResultMap("EventResultMap")
    public List<Event> selectEvent();
}
