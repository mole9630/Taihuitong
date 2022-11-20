package top.taiht.pojo.log;

public class Log {
    private Integer lId;
    private Integer uId;
    private String lStartTime;
    private String lEndTime;
    private String lType;
    private String lRemark;

    public Log() {
    }

    public Log(Integer lId, Integer uId, String lStartTime, String lEndTime, String lType, String lRemark) {
        this.lId = lId;
        this.uId = uId;
        this.lStartTime = lStartTime;
        this.lEndTime = lEndTime;
        this.lType = lType;
        this.lRemark = lRemark;
    }

    public Integer getlId() {
        return lId;
    }
    public void setlId(Integer lId) {
        this.lId = lId;
    }
    public Integer getuId() {
        return uId;
    }
    public void setuId(Integer uId) {
        this.uId = uId;
    }
    public String getlStartTime() {
        return lStartTime;
    }
    public void setlStartTime(String lStartTime) {
        this.lStartTime = lStartTime;
    }
    public String getlEndTime() {
        return lEndTime;
    }
    public void setlEndTime(String lEndTime) {
        this.lEndTime = lEndTime;
    }
    public String getlType() {
        return lType;
    }
    public void setlType(String lType) {
        this.lType = lType;
    }
    public String getlRemark() {
        return lRemark;
    }
    public void setlRemark(String lRemark) {
        this.lRemark = lRemark;
    }

    @Override
    public String toString() {
        return "Log{" +
                "lId=" + lId +
                ", uCardId='" + uId + '\'' +
                ", lStartTime='" + lStartTime + '\'' +
                ", lEndTime='" + lEndTime + '\'' +
                ", lType='" + lType + '\'' +
                ", lRemark='" + lRemark + '\'' +
                '}';
    }
}
