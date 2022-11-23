package top.taiht.pojo.event;

public class EventStaff {
    private Integer esID;
    private Integer esUID;
    private Integer esEID;
    private String esTime;
    private Integer esStatus;
    private String esUName;
    private String esEName;

    // 以下为非数据库字段
//    private String uName;
//    private String eName;

    public EventStaff() {
    }

    public EventStaff(Integer esID, Integer esUID, Integer esEID, String esTime, Integer esStatus, String esUName, String esEName) {
        this.esID = esID;
        this.esUID = esUID;
        this.esEID = esEID;
        this.esTime = esTime;
        this.esStatus = esStatus;
        this.esUName = esUName;
        this.esEName = esEName;
    }
    // 以下为非数据库字段构造方法
//    public EventStaff(Integer esID, Integer esUID, Integer esEID, String esTime, Integer esStatus, String uName, String eName) {
//        this.esID = esID;
//        this.esUID = esUID;
//        this.esEID = esEID;
//        this.esTime = esTime;
//        this.esStatus = esStatus;
//        this.uName = uName;
//        this.eName = eName;
//    }

    public Integer getEsID() {
        return esID;
    }
    public void setEsID(Integer esID) {
        this.esID = esID;
    }
    public Integer getEsUID() {
        return esUID;
    }
    public void setEsUID(Integer esUID) {
        this.esUID = esUID;
    }
    public Integer getEsEID() {
        return esEID;
    }
    public void setEsEID(Integer esEID) {
        this.esEID = esEID;
    }
    public String getEsTime() {
        return esTime;
    }
    public void setEsTime(String esTime) {
        this.esTime = esTime;
    }
    public Integer getEsStatus() {
        return esStatus;
    }
    public void setEsStatus(Integer esStatus) {
        this.esStatus = esStatus;
    }
    public String getEsUName() {
        return esUName;
    }
    public void setEsUName(String esUName) {
        this.esUName = esUName;
    }
    public String getEsEName() {
        return esEName;
    }
    public void setEsEName(String esEName) {
        this.esEName = esEName;
    }
}
