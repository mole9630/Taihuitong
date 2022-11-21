package top.taiht.pojo.event;

public class EventStaff {
    private Integer esID;
    private Integer esUID;
    private Integer esEID;
    private String esTime;
    private Integer esStatus;

    public EventStaff() {
    }
    public EventStaff(Integer esID, Integer esUID, Integer esEID, String esTime, Integer esStatus) {
        this.esID = esID;
        this.esUID = esUID;
        this.esEID = esEID;
        this.esTime = esTime;
        this.esStatus = esStatus;
    }

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
}
