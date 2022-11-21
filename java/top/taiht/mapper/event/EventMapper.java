package top.taiht.mapper.event;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import top.taiht.pojo.event.Event;

public interface EventMapper {
    // 添加活动
    public int insertEvent(Event Event);
}
