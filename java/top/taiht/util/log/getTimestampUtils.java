package top.taiht.util.log;

import java.text.SimpleDateFormat;
import java.util.Date;

public class getTimestampUtils {
    public String getTimestamp() {
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return dateFormat.format(date);
    }
}
